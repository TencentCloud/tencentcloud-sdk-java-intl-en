package com.tencentcloudapi.tke.v20220501;
public enum TkeErrorCode {
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // db error.
     INTERNALERROR_DB("InternalError.Db"),
     
    // DB error.
     INTERNALERROR_DBAFFECTIVEDROWS("InternalError.DbAffectivedRows"),
     
    // Record not found.
     INTERNALERROR_DBRECORDNOTFOUND("InternalError.DbRecordNotFound"),
     
    // Initializing Master failed.
     INTERNALERROR_INITMASTERFAILED("InternalError.InitMasterFailed"),
     
    // Param error.
     INTERNALERROR_PARAM("InternalError.Param"),
     
    // Public clusters do not support node expansion.
     INTERNALERROR_PUBLICCLUSTEROPNOTSUPPORT("InternalError.PublicClusterOpNotSupport"),
     
    // Internal error.
     INTERNALERROR_UNEXCEPTEDINTERNAL("InternalError.UnexceptedInternal"),
     
    // Unknown internal error.
     INTERNALERROR_UNEXPECTEDINTERNAL("InternalError.UnexpectedInternal"),
     
    // Parameter error.
     INVALIDPARAMETER("InvalidParameter"),
     
    // The cluster ID does not exist.
     INVALIDPARAMETER_CLUSTERNOTFOUND("InvalidParameter.ClusterNotFound"),
     
    // Parameter error.
     INVALIDPARAMETER_PARAM("InvalidParameter.Param"),
     
    // Operation denied.
     OPERATIONDENIED("OperationDenied"),
     
    // The resource is occupied.
     RESOURCEINUSE("ResourceInUse"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The cluster does not exist.
     RESOURCENOTFOUND_CLUSTERNOTFOUND("ResourceNotFound.ClusterNotFound"),
     
    // The cluster status does not support this operation.
     RESOURCEUNAVAILABLE_CLUSTERSTATE("ResourceUnavailable.ClusterState");
     
    private String value;
    private TkeErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

