package com.rest.server.marshalling;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by ygusev on 25.06.2015.
 */
public abstract class AbstractMarshallingImpl<T> implements Marshalling<T> {

    public AbstractMarshallingImpl(Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }

    protected String fileName;

    protected String filePath;

    private final Class<T> typeParameterClass;

    @Override
    @SuppressWarnings("unchecked")
    public T unmarshalledAll() {
        String pathName = filePath + fileName;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(typeParameterClass);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            return (T) jaxbUnmarshaller.unmarshal(new File(pathName));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    public abstract void setFileName(String fileName);

    public abstract void setFilePath(String filePath);
}
