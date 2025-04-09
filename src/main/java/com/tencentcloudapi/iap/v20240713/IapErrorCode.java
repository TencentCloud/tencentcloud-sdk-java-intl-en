package com.tencentcloudapi.iap.v20240713;
public enum IapErrorCode {
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* The IdP name is already in use. */
     INVALIDPARAMETER_IDENTITYNAMEINUSE("InvalidParameter.IdentityNameInUse"),
     
     /* IdP metadata document error. */
     INVALIDPARAMETER_METADATAERROR("InvalidParameter.MetadataError"),
     
     /* Parameter error. */
     INVALIDPARAMETER_PARAMERROR("InvalidParameter.ParamError"),
     
     /* The OIDC signature public key is incorrect. */
     INVALIDPARAMETERVALUE_IDENTITYKEYERROR("InvalidParameterValue.IdentityKeyError"),
     
     /* The IdP URL is incorrect. */
     INVALIDPARAMETERVALUE_IDENTITYURLERROR("InvalidParameterValue.IdentityUrlError"),
     
     /* IdP name error. */
     INVALIDPARAMETERVALUE_NAMEERROR("InvalidParameterValue.NameError"),
     
     /* The upper limit on the number of IdPs has been reached. */
     LIMITEXCEEDED_IDENTITYFULL("LimitExceeded.IdentityFull"),
     
     /* The IdP does not exist. */
     RESOURCENOTFOUND_IDENTITYNOTEXIST("ResourceNotFound.IdentityNotExist"),
     
     /* No data. */
     RESOURCENOTFOUND_RECORDNOTEXISTS("ResourceNotFound.RecordNotExists");
     
    private String value;
    private IapErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

