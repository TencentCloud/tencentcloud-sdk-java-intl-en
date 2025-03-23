package com.tencentcloudapi.ciam.v20210420;
public enum CiamErrorCode {
    // A CAM signature/authentication error occurred.
     AUTHFAILURE("AuthFailure"),
     
    // `DryRun` Operation. It means that the request would have succeeded, but the `DryRun` parameter was used.
     DRYRUNOPERATION("DryRunOperation"),
     
    // The operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // FailedOperation.AccountNotFound
     FAILEDOPERATION_ACCOUNTNOTFOUND("FailedOperation.AccountNotFound"),
     
    // FailedOperation.AddUsersToUserGroup
     FAILEDOPERATION_ADDUSERSTOUSERGROUP("FailedOperation.AddUsersToUserGroup"),
     
    // FailedOperation.AppIdIsNull
     FAILEDOPERATION_APPIDISNULL("FailedOperation.AppIdIsNull"),
     
    // FailedOperation.AppIdNotExited
     FAILEDOPERATION_APPIDNOTEXITED("FailedOperation.AppIdNotExited"),
     
    // FailedOperation.AppIdNotFound
     FAILEDOPERATION_APPIDNOTFOUND("FailedOperation.AppIdNotFound"),
     
    // FailedOperation.AppNotExited
     FAILEDOPERATION_APPNOTEXITED("FailedOperation.AppNotExited"),
     
    // FailedOperation.AuthListFailed
     FAILEDOPERATION_AUTHLISTFAILED("FailedOperation.AuthListFailed"),
     
    // FailedOperation.ChildOrgNodeWithUsersCannotBeDeleted
     FAILEDOPERATION_CHILDORGNODEWITHUSERSCANNOTBEDELETED("FailedOperation.ChildOrgNodeWithUsersCannotBeDeleted"),
     
    // FailedOperation.CreateOrgNodeFailure
     FAILEDOPERATION_CREATEORGNODEFAILURE("FailedOperation.CreateOrgNodeFailure"),
     
    // FailedOperation.CreateUserFailure
     FAILEDOPERATION_CREATEUSERFAILURE("FailedOperation.CreateUserFailure"),
     
    // FailedOperation.CreateUserGroupFailure
     FAILEDOPERATION_CREATEUSERGROUPFAILURE("FailedOperation.CreateUserGroupFailure"),
     
    // FailedOperation.CustomizedParentOrgNodeIdExisted
     FAILEDOPERATION_CUSTOMIZEDPARENTORGNODEIDEXISTED("FailedOperation.CustomizedParentOrgNodeIdExisted"),
     
    // FailedOperation.DeleteOrgNodeFailure
     FAILEDOPERATION_DELETEORGNODEFAILURE("FailedOperation.DeleteOrgNodeFailure"),
     
    // FailedOperation.DeleteUserException
     FAILEDOPERATION_DELETEUSEREXCEPTION("FailedOperation.DeleteUserException"),
     
    // FailedOperation.DeleteUserFailure
     FAILEDOPERATION_DELETEUSERFAILURE("FailedOperation.DeleteUserFailure"),
     
    // FailedOperation.DeleteUserGroupFailure
     FAILEDOPERATION_DELETEUSERGROUPFAILURE("FailedOperation.DeleteUserGroupFailure"),
     
    // FailedOperation.DescribeOrgNodeFailure
     FAILEDOPERATION_DESCRIBEORGNODEFAILURE("FailedOperation.DescribeOrgNodeFailure"),
     
    // FailedOperation.ExpectFieldsNotFound
     FAILEDOPERATION_EXPECTFIELDSNOTFOUND("FailedOperation.ExpectFieldsNotFound"),
     
    // FailedOperation.GroupIdNotFound
     FAILEDOPERATION_GROUPIDNOTFOUND("FailedOperation.GroupIdNotFound"),
     
    // The tenant is invalid.
     FAILEDOPERATION_INVALIDTENANT("FailedOperation.InvalidTenant"),
     
    // FailedOperation.ListAllUserGroupsFailure
     FAILEDOPERATION_LISTALLUSERGROUPSFAILURE("FailedOperation.ListAllUserGroupsFailure"),
     
    // FailedOperation.ListMatchedUserInfoFailure
     FAILEDOPERATION_LISTMATCHEDUSERINFOFAILURE("FailedOperation.ListMatchedUserInfoFailure"),
     
    // FailedOperation.ListUserGroupsOfUserFailure
     FAILEDOPERATION_LISTUSERGROUPSOFUSERFAILURE("FailedOperation.ListUserGroupsOfUserFailure"),
     
    // FailedOperation.ListUsersInOrgNodeFailure
     FAILEDOPERATION_LISTUSERSINORGNODEFAILURE("FailedOperation.ListUsersInOrgNodeFailure"),
     
    // FailedOperation.ListUsersInUserGroupFailure
     FAILEDOPERATION_LISTUSERSINUSERGROUPFAILURE("FailedOperation.ListUsersInUserGroupFailure"),
     
    // FailedOperation.ModifyApplicationDisplayNameIsNull
     FAILEDOPERATION_MODIFYAPPLICATIONDISPLAYNAMEISNULL("FailedOperation.ModifyApplicationDisplayNameIsNull"),
     
    // FailedOperation.OrgNodeIdNotExist
     FAILEDOPERATION_ORGNODEIDNOTEXIST("FailedOperation.OrgNodeIdNotExist"),
     
    // FailedOperation.OrgNodeNotExist
     FAILEDOPERATION_ORGNODENOTEXIST("FailedOperation.OrgNodeNotExist"),
     
    // FailedOperation.OrgNodeRootCannotBeDeleted
     FAILEDOPERATION_ORGNODEROOTCANNOTBEDELETED("FailedOperation.OrgNodeRootCannotBeDeleted"),
     
    // FailedOperation.OrgNodeWithUsersCannotBeDeleted
     FAILEDOPERATION_ORGNODEWITHUSERSCANNOTBEDELETED("FailedOperation.OrgNodeWithUsersCannotBeDeleted"),
     
    // FailedOperation.PageParameterIsNotPaired
     FAILEDOPERATION_PAGEPARAMETERISNOTPAIRED("FailedOperation.PageParameterIsNotPaired"),
     
    // FailedOperation.ParentOrgNodeIdNotFound
     FAILEDOPERATION_PARENTORGNODEIDNOTFOUND("FailedOperation.ParentOrgNodeIdNotFound"),
     
    // FailedOperation.ParentOrgNodeIsEmpty
     FAILEDOPERATION_PARENTORGNODEISEMPTY("FailedOperation.ParentOrgNodeIsEmpty"),
     
    // FailedOperation.PersonNotFound
     FAILEDOPERATION_PERSONNOTFOUND("FailedOperation.PersonNotFound"),
     
    // FailedOperation.RemoveUsersFromUserGroupFailure
     FAILEDOPERATION_REMOVEUSERSFROMUSERGROUPFAILURE("FailedOperation.RemoveUsersFromUserGroupFailure"),
     
    // FailedOperation.RepeatedAuthorizationException
     FAILEDOPERATION_REPEATEDAUTHORIZATIONEXCEPTION("FailedOperation.RepeatedAuthorizationException"),
     
    // FailedOperation.RepeatedUnauthorizationException
     FAILEDOPERATION_REPEATEDUNAUTHORIZATIONEXCEPTION("FailedOperation.RepeatedUnauthorizationException"),
     
    // FailedOperation.TimeFormatIsIllegal
     FAILEDOPERATION_TIMEFORMATISILLEGAL("FailedOperation.TimeFormatIsIllegal"),
     
    // FailedOperation.UserAlreadyExistedInUserGroup
     FAILEDOPERATION_USERALREADYEXISTEDINUSERGROUP("FailedOperation.UserAlreadyExistedInUserGroup"),
     
    // FailedOperation.UserExpriationTimeIsIllegal
     FAILEDOPERATION_USEREXPRIATIONTIMEISILLEGAL("FailedOperation.UserExpriationTimeIsIllegal"),
     
    // FailedOperation.UserGroupNotExisted
     FAILEDOPERATION_USERGROUPNOTEXISTED("FailedOperation.UserGroupNotExisted"),
     
    // FailedOperation.UserIdNotFound
     FAILEDOPERATION_USERIDNOTFOUND("FailedOperation.UserIdNotFound"),
     
    // FailedOperation.UserInfoSortAttributeCodeIsIllegal
     FAILEDOPERATION_USERINFOSORTATTRIBUTECODEISILLEGAL("FailedOperation.UserInfoSortAttributeCodeIsIllegal"),
     
    // FailedOperation.UserNameExisted
     FAILEDOPERATION_USERNAMEEXISTED("FailedOperation.UserNameExisted"),
     
    // FailedOperation.UserNotExistedInUserGroup
     FAILEDOPERATION_USERNOTEXISTEDINUSERGROUP("FailedOperation.UserNotExistedInUserGroup"),
     
    // FailedOperation.UserPhoneExisted
     FAILEDOPERATION_USERPHONEEXISTED("FailedOperation.UserPhoneExisted"),
     
    // An internal error occurred.
     INTERNALERROR("InternalError"),
     
    // The parameter is incorrect.
     INVALIDPARAMETER("InvalidParameter"),
     
    // InvalidParameter.AttributeValueValidFailure
     INVALIDPARAMETER_ATTRIBUTEVALUEVALIDFAILURE("InvalidParameter.AttributeValueValidFailure"),
     
    // InvalidParameter.DataTypeNotMatch
     INVALIDPARAMETER_DATATYPENOTMATCH("InvalidParameter.DataTypeNotMatch"),
     
    // InvalidParameter.ParameterIsIllegal
     INVALIDPARAMETER_PARAMETERISILLEGAL("InvalidParameter.ParameterIsIllegal"),
     
    // InvalidParameter.ParameterTypeIsIllegal
     INVALIDPARAMETER_PARAMETERTYPEISILLEGAL("InvalidParameter.ParameterTypeIsIllegal"),
     
    // InvalidParameter.PasswordIsIllegal
     INVALIDPARAMETER_PASSWORDISILLEGAL("InvalidParameter.PasswordIsIllegal"),
     
    // The parameter value is incorrect.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // The quota limit is exceeded.
     LIMITEXCEEDED("LimitExceeded"),
     
    // The parameter is missing.
     MISSINGPARAMETER("MissingParameter"),
     
    // The operation was denied.
     OPERATIONDENIED("OperationDenied"),
     
    // OperationDenied.DataTypeIsIllegal
     OPERATIONDENIED_DATATYPEISILLEGAL("OperationDenied.DataTypeIsIllegal"),
     
    // OperationDenied.UinNotExisted
     OPERATIONDENIED_UINNOTEXISTED("OperationDenied.UinNotExisted"),
     
    // The number of requests exceeds the frequency limit.
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // The resource is in use.
     RESOURCEINUSE("ResourceInUse"),
     
    // The resource is insufficient.
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The resource is unavailable.
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // The resources have been sold out.
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
    // The operation is unauthorized.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // The service is not activated.
     UNAUTHORIZEDOPERATION_TENANTNOTACTIVATED("UnauthorizedOperation.TenantNotActivated"),
     
    // The parameter is unknown.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // The operation is not supported.
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private CiamErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

