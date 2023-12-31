package com.leno.example.generalServices.process.components;

import com.leno.example.utilz.sftp.exceptions.DownloadFileException;

import java.util.List;
import java.util.function.BiFunction;

public interface TargetServerInterface {


    /**
     *
     * Collects the document from the targeted server.
     * We pass the name of the collection which will be used to
     * create a directory in which all of the documents will be uploaded on internal server
     * @return
     */
    boolean collect(String nameOfCollection) throws Exception,DownloadFileException;


    /**
     *
     * @param nameOfCollection
     * @param onCollectFunction
     * @return
     * @throws Exception
     */
    boolean collect(String nameOfCollection,  BiFunction<List<TargetFile>,Boolean, Boolean> onCollectFunction) throws Exception, DownloadFileException;
}
