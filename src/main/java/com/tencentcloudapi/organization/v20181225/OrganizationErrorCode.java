package com.tencentcloudapi.organization.v20181225;
public enum OrganizationErrorCode {
    // 
     FAILEDOPERATION("FailedOperation"),
     
    // Members cannot be deleted from the root unit.
     FAILEDOPERATION_DISABLEDELETEMEMBERFROMROOTNODE("FailedOperation.DisableDeleteMemberFromRootNode"),
     
    // You cannot quit an organization created by yourself.
     FAILEDOPERATION_DISABLEQUITSELFCREATEDORGANIZATION("FailedOperation.DisableQuitSelfCreatedOrganization"),
     
    // You are already in this organization.
     FAILEDOPERATION_INORGANIZATIONALREADY("FailedOperation.InOrganizationAlready"),
     
    // The name is already in use.
     FAILEDOPERATION_MEMBERNAMEUSED("FailedOperation.MemberNameUsed"),
     
    // There are members in this department
     FAILEDOPERATION_NODENOTEMPTY("FailedOperation.NodeNotEmpty"),
     
    // You can only invite accounts within the same site.
     FAILEDOPERATION_NOTSAMEREGION("FailedOperation.NotSameRegion"),
     
    // The organization already exists.
     FAILEDOPERATION_ORGANIZATIONEXISTALREADY("FailedOperation.OrganizationExistAlready"),
     
    // There are members in this organization.
     FAILEDOPERATION_ORGANIZATIONNOTEMPTY("FailedOperation.OrganizationNotEmpty"),
     
    // Failed to leave the shared unit.
     FAILEDOPERATION_QUITSHAREUINTERROR("FailedOperation.QuitShareUintError"),
     
    // The invitation has already been sent before.
     FAILEDOPERATION_RESENTINVITATION("FailedOperation.ReSentInvitation"),
     
    // Shared unit is not empty.
     FAILEDOPERATION_SHAREUNITNOTEMPTY("FailedOperation.ShareUnitNotEmpty"),
     
    // The UIN does not belong to the organization.
     FAILEDOPERATION_SOMEUINSNOTINORGANIZATION("FailedOperation.SomeUinsNotInOrganization"),
     
    // The user has already joined the organization.
     FAILEDOPERATION_USERINORGANIZATION("FailedOperation.UserInOrganization"),
     
    // The account that sent the invitation is not a primary account.
     FAILEDOPERATION_USERNOTREGISTER("FailedOperation.UserNotRegister"),
     
    // The number of organization members has reached the maximum.
     LIMITEXCEEDED_MEMBERS("LimitExceeded.Members"),
     
    // The department has too many levels.
     LIMITEXCEEDED_NODEDEPTHEXCEEDLIMIT("LimitExceeded.NodeDepthExceedLimit"),
     
    // The number of departments exceeds the upper limit.
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

