package com.tencentcloudapi.privatedns.v20201028;
public enum PrivatednsErrorCode {
    // Error with CAM signature/authentication.
     AUTHFAILURE("AuthFailure"),
     
    // Token verification failed.
     AUTHFAILURE_TOKENFAILURE("AuthFailure.TokenFailure"),
     
    // `DryRun` Operation. It means that the request would have succeeded, but the `DryRun` parameter was used.
     DRYRUNOPERATION("DryRunOperation"),
     
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // Failed to associate the private domain with the VPC.
     FAILEDOPERATION_BINDZONEVPCFAILED("FailedOperation.BindZoneVpcFailed"),
     
    // Failed to create the record.
     FAILEDOPERATION_CREATERECORDFAILED("FailedOperation.CreateRecordFailed"),
     
    // Failed to create the private domain.
     FAILEDOPERATION_CREATEZONEFAILED("FailedOperation.CreateZoneFailed"),
     
    // The private domain is currently associated with a VPC. Please disassociate the VPC first before clearing its records.
     FAILEDOPERATION_DELETELASTBINDVPCRECORDFAILED("FailedOperation.DeleteLastBindVpcRecordFailed"),
     
    // Failed to delete the domain.
     FAILEDOPERATION_DELETEZONEFAILED("FailedOperation.DeleteZoneFailed"),
     
    // Failed to modify the record.
     FAILEDOPERATION_MODIFYRECORDFAILED("FailedOperation.ModifyRecordFailed"),
     
    // Failed to modify the private domain.
     FAILEDOPERATION_MODIFYZONEFAILED("FailedOperation.ModifyZoneFailed"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Undefined error.
     INTERNALERROR_UNDEFIENDERROR("InternalError.UndefiendError"),
     
    // Incorrect parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Invalid CIDR.
     INVALIDPARAMETER_ILLEGALCIDR("InvalidParameter.IllegalCidr"),
     
    // Incorrect domain name.
     INVALIDPARAMETER_ILLEGALDOMAIN("InvalidParameter.IllegalDomain"),
     
    // Incorrect top-level domain name.
     INVALIDPARAMETER_ILLEGALDOMAINTLD("InvalidParameter.IllegalDomainTld"),
     
    // Invalid PTR record.
     INVALIDPARAMETER_ILLEGALPTRRECORD("InvalidParameter.IllegalPTRRecord"),
     
    // Invalid record.
     INVALIDPARAMETER_ILLEGALRECORD("InvalidParameter.IllegalRecord"),
     
    // Invalid record value.
     INVALIDPARAMETER_ILLEGALRECORDVALUE("InvalidParameter.IllegalRecordValue"),
     
    // Invalid VPC.
     INVALIDPARAMETER_ILLEGALVPCINFO("InvalidParameter.IllegalVpcInfo"),
     
    // The MX value must be a multiple of 5 between 5 and 50.
     INVALIDPARAMETER_INVALIDMX("InvalidParameter.InvalidMX"),
     
    // The number of round-robin DNS AAAA records exceeds 50.
     INVALIDPARAMETER_RECORDAAAACOUNTEXCEED("InvalidParameter.RecordAAAACountExceed"),
     
    // The number of round-robin DNS A records exceeds 50.
     INVALIDPARAMETER_RECORDACOUNTEXCEED("InvalidParameter.RecordACountExceed"),
     
    // The number of round-robin DNS CNAME records exceeds 50.
     INVALIDPARAMETER_RECORDCNAMECOUNTEXCEED("InvalidParameter.RecordCNAMECountExceed"),
     
    // Records conflict.
     INVALIDPARAMETER_RECORDCONFLICT("InvalidParameter.RecordConflict"),
     
    // The number of records exceeds the limit.
     INVALIDPARAMETER_RECORDCOUNTEXCEED("InvalidParameter.RecordCountExceed"),
     
    // The record already exists.
     INVALIDPARAMETER_RECORDEXIST("InvalidParameter.RecordExist"),
     
    // The number of record levels exceeds the limit.
     INVALIDPARAMETER_RECORDLEVELEXCEED("InvalidParameter.RecordLevelExceed"),
     
    // The number of round-robin DNS MX records exceeds 50.
     INVALIDPARAMETER_RECORDMXCOUNTEXCEED("InvalidParameter.RecordMXCountExceed"),
     
    // The record does not exist.
     INVALIDPARAMETER_RECORDNOTEXIST("InvalidParameter.RecordNotExist"),
     
    // The number of round-robin DNS records exceeds the limit.
     INVALIDPARAMETER_RECORDROLLLIMITCOUNTEXCEED("InvalidParameter.RecordRolllimitCountExceed"),
     
    // The number of round-robin DNS TXT records exceeds 10.
     INVALIDPARAMETER_RECORDTXTCOUNTEXCEED("InvalidParameter.RecordTXTCountExceed"),
     
    // The current record type does not support weight.
     INVALIDPARAMETER_RECORDUNSUPPORTWEIGHT("InvalidParameter.RecordUnsupportWeight"),
     
    // The VPC has been bound to another domain.
     INVALIDPARAMETER_VPCBINDED("InvalidParameter.VpcBinded"),
     
    // The domain does not exist.
     INVALIDPARAMETER_ZONENOTEXISTS("InvalidParameter.ZoneNotExists"),
     
    // Incorrect parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // The quota limit is exceeded.
     LIMITEXCEEDED("LimitExceeded"),
     
    // Missing parameter.
     MISSINGPARAMETER("MissingParameter"),
     
    // The operation was denied.
     OPERATIONDENIED("OperationDenied"),
     
    // The number of requests exceeds the frequency limit.
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // The resource is in use.
     RESOURCEINUSE("ResourceInUse"),
     
    // Insufficient resource.
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The Private DNS service is not activated.
     RESOURCENOTFOUND_SERVICENOTSUBSCRIBED("ResourceNotFound.ServiceNotSubscribed"),
     
    // The resource is unavailable.
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // The resources have been sold out.
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
    // Unauthorized operation.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // Role not authorized.
     UNAUTHORIZEDOPERATION_ROLEUNAUTHORIZED("UnauthorizedOperation.RoleUnAuthorized"),
     
    // Unverified user.
     UNAUTHORIZEDOPERATION_UNAUTHORIZEDACCOUNT("UnauthorizedOperation.UnauthorizedAccount"),
     
    // Unknown parameter.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // Unsupported operation.
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
    // Account not bound.
     UNSUPPORTEDOPERATION_ACCOUNTNOTBOUND("UnsupportedOperation.AccountNotBound");
     
    private String value;
    private PrivatednsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

