package com.tencentcloudapi.organization.v20181225;
public enum OrganizationErrorCode {
    // Members cannot be deleted from the root unit.
     FAILEDOPERATION_DISABLEDELETEMEMBERFROMROOTNODE("FailedOperation.DisableDeleteMemberFromRootNode"),
     
    // You cannot quit an organization created by yourself.
     FAILEDOPERATION_DISABLEQUITSELFCREATEDORGANIZATION("FailedOperation.DisableQuitSelfCreatedOrganization"),
     
    // You are already in this organization.
     FAILEDOPERATION_INORGANIZATIONALREADY("FailedOperation.InOrganizationAlready"),
     
    // The name is already in use.
     FAILEDOPERATION_MEMBERNAMEUSED("FailedOperation.MemberNameUsed"),
     
    // There are members in this organizational unit.
     FAILEDOPERATION_NODENOTEMPTY("FailedOperation.NodeNotEmpty"),
     
    // The organization already exists.
     FAILEDOPERATION_ORGANIZATIONEXISTALREADY("FailedOperation.OrganizationExistAlready"),
     
    // There are members in this organization.
     FAILEDOPERATION_ORGANIZATIONNOTEMPTY("FailedOperation.OrganizationNotEmpty"),
     
    // The invitation has already been sent before.
     FAILEDOPERATION_RESENTINVITATION("FailedOperation.ReSentInvitation"),
     
    // A UIN does not belong to this organization.
     FAILEDOPERATION_SOMEUINSNOTINORGANIZATION("FailedOperation.SomeUinsNotInOrganization"),
     
    // The user has already joined the organization.
     FAILEDOPERATION_USERINORGANIZATION("FailedOperation.UserInOrganization"),
     
    // The account that sent the invitation is not a primary account.
     FAILEDOPERATION_USERNOTREGISTER("FailedOperation.UserNotRegister"),
     
    // The number of organization members has reached the maximum.
     LIMITEXCEEDED_MEMBERS("LimitExceeded.Members"),
     
    // Too many organizational unit levels.
     LIMITEXCEEDED_NODEDEPTHEXCEEDLIMIT("LimitExceeded.NodeDepthExceedLimit"),
     
    // The number of organizational units has reached the upper limit.
     LIMITEXCEEDED_NODEEXCEEDLIMIT("LimitExceeded.NodeExceedLimit"),
     
    // The organizational unit name is already in use.
     RESOURCEINUSE_NODENAME("ResourceInUse.NodeName"),
     
    // This name is already in use.
     RESOURCEINUSE_NODENAMEUSED("ResourceInUse.NodeNameUsed"),
     
    // The invitation information does not exist.
     RESOURCENOTFOUND_INVITATIONNOTEXIST("ResourceNotFound.InvitationNotExist"),
     
    // The member does not exist.
     RESOURCENOTFOUND_MEMBERNOTEXIST("ResourceNotFound.MemberNotExist"),
     
    // The organizational unit does not exist.
     RESOURCENOTFOUND_NODENOTEXIST("ResourceNotFound.NodeNotExist"),
     
    // The organization does not exist.
     RESOURCENOTFOUND_ORGANIZATIONNOTEXIST("ResourceNotFound.OrganizationNotExist"),
     
    // The user does not exist.
     RESOURCENOTFOUND_USERNOTEXIST("ResourceNotFound.UserNotExist");
     
    private String value;
    private OrganizationErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

