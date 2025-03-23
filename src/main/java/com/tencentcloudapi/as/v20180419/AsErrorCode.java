package com.tencentcloudapi.as.v20180419;
public enum AsErrorCode {
    // The requesting account failed to pass the qualification review.
     ACCOUNTQUALIFICATIONRESTRICTIONS("AccountQualificationRestrictions"),
     
    // CVM API call failed.
     CALLCVMERROR("CallCvmError"),
     
    // No scaling activity is generated.
     FAILEDOPERATION_NOACTIVITYTOGENERATE("FailedOperation.NoActivityToGenerate"),
     
    // An internal error occurred.
     INTERNALERROR("InternalError"),
     
    // The CMQ API call failed.
     INTERNALERROR_CALLCMQERROR("InternalError.CallCmqError"),
     
    // The internal API call failed.
     INTERNALERROR_CALLERROR("InternalError.CallError"),
     
    // CLB API call failed.
     INTERNALERROR_CALLLBERROR("InternalError.CallLbError"),
     
    // Monitor API call failed.
     INTERNALERROR_CALLMONITORERROR("InternalError.CallMonitorError"),
     
    // The notification service API call failed.
     INTERNALERROR_CALLNOTIFICATIONERROR("InternalError.CallNotificationError"),
     
    // The STS API call failed.
     INTERNALERROR_CALLSTSERROR("InternalError.CallStsError"),
     
    // Failed to call the Tencent Automation Tools (TAT) API.
     INTERNALERROR_CALLTATERROR("InternalError.CallTATError"),
     
    // The tag API call failed.
     INTERNALERROR_CALLTAGERROR("InternalError.CallTagError"),
     
    // The TVPC API call failed.
     INTERNALERROR_CALLTVPCERROR("InternalError.CallTvpcError"),
     
    // VPC API call failed.
     INTERNALERROR_CALLVPCERROR("InternalError.CallVpcError"),
     
    // Exceptions occurred while invoking other services.
     INTERNALERROR_CALLEEERROR("InternalError.CalleeError"),
     
    // An internal request error occurred.
     INTERNALERROR_REQUESTERROR("InternalError.RequestError"),
     
    // The image cannot be found.
     INVALIDIMAGEID_NOTFOUND("InvalidImageId.NotFound"),
     
    // Invalid launch configuration.
     INVALIDLAUNCHCONFIGURATION("InvalidLaunchConfiguration"),
     
    // The launch configuration ID is invalid.
     INVALIDLAUNCHCONFIGURATIONID("InvalidLaunchConfigurationId"),
     
    // Invalid parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Invalid Action request.
     INVALIDPARAMETER_ACTIONNOTFOUND("InvalidParameter.ActionNotFound"),
     
    // Multiple parameters specified conflict and cannot co-exist.
     INVALIDPARAMETER_CONFLICT("InvalidParameter.Conflict"),
     
    // The `hostname` parameter is unavailable to this image.
     INVALIDPARAMETER_HOSTNAMEUNAVAILABLE("InvalidParameter.HostNameUnavailable"),
     
    // The parameter is invalid in a specific scenario.
     INVALIDPARAMETER_INSCENARIO("InvalidParameter.InScenario"),
     
    // Invalid parameter combination.
     INVALIDPARAMETER_INVALIDCOMBINATION("InvalidParameter.InvalidCombination"),
     
    // The specified CLB does not exist in the current scaling group.
     INVALIDPARAMETER_LOADBALANCERNOTINAUTOSCALINGGROUP("InvalidParameter.LoadBalancerNotInAutoScalingGroup"),
     
    // A parameter is missing. One of the two parameters must be specified.
     INVALIDPARAMETER_MUSTONEPARAMETER("InvalidParameter.MustOneParameter"),
     
    // This parameter has been disused.
     INVALIDPARAMETER_PARAMETERDEPRECATED("InvalidParameter.ParameterDeprecated"),
     
    // Some parameters cannot coexist and should be deleted.
     INVALIDPARAMETER_PARAMETERMUSTBEDELETED("InvalidParameter.ParameterMustBeDeleted"),
     
    // The two parameters specified conflict and cannot co-exist.
     INVALIDPARAMETERCONFLICT("InvalidParameterConflict"),
     
    // Wrong parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // The bandwidth package ID is not supported in this account.
     INVALIDPARAMETERVALUE_ACCOUNTNOTSUPPORTBANDWIDTHPACKAGEID("InvalidParameterValue.AccountNotSupportBandwidthPackageId"),
     
    // The declared original expected instance number does not match the actual original expected instance number.
     INVALIDPARAMETERVALUE_ASSERTDESIREDCAPACITYFAILED("InvalidParameterValue.AssertDesiredCapacityFailed"),
     
    // The specified base capacity cannot exceed the max capacity.
     INVALIDPARAMETERVALUE_BASECAPACITYTOOLARGE("InvalidParameterValue.BaseCapacityTooLarge"),
     
    // The batch count cannot exceed the total number of instances pending refresh.
     INVALIDPARAMETERVALUE_BATCHNUMBERTOOLARGE("InvalidParameterValue.BatchNumberTooLarge"),
     
    // A classic CLB should be specified.
     INVALIDPARAMETERVALUE_CLASSICLB("InvalidParameterValue.ClassicLb"),
     
    // Conflicting notification receiver type.
     INVALIDPARAMETERVALUE_CONFLICTNOTIFICATIONTARGET("InvalidParameterValue.ConflictNotificationTarget"),
     
    // The cron expression specified for the scheduled task is invalid.
     INVALIDPARAMETERVALUE_CRONEXPRESSIONILLEGAL("InvalidParameterValue.CronExpressionIllegal"),
     
    // Exception with CVM parameter validation.
     INVALIDPARAMETERVALUE_CVMCONFIGURATIONERROR("InvalidParameterValue.CvmConfigurationError"),
     
    // Exception with CVM parameter validation.
     INVALIDPARAMETERVALUE_CVMERROR("InvalidParameterValue.CvmError"),
     
    // Duplicate CLB instances
     INVALIDPARAMETERVALUE_DUPLICATEDFORWARDLB("InvalidParameterValue.DuplicatedForwardLb"),
     
    // Duplicated subnet.
     INVALIDPARAMETERVALUE_DUPLICATEDSUBNET("InvalidParameterValue.DuplicatedSubnet"),
     
    // The end time of the scheduled task is before the start time.
     INVALIDPARAMETERVALUE_ENDTIMEBEFORESTARTTIME("InvalidParameterValue.EndTimeBeforeStartTime"),
     
    // Invalid filter.
     INVALIDPARAMETERVALUE_FILTER("InvalidParameterValue.Filter"),
     
    // A CLB should be specified.
     INVALIDPARAMETERVALUE_FORWARDLB("InvalidParameterValue.ForwardLb"),
     
    // The auto scaling group name already exists.
     INVALIDPARAMETERVALUE_GROUPNAMEDUPLICATED("InvalidParameterValue.GroupNameDuplicated"),
     
    // Invalid hostname
     INVALIDPARAMETERVALUE_HOSTNAMEILLEGAL("InvalidParameterValue.HostNameIllegal"),
     
    // HostNames with suffixes are too long and exceed the specified upper limit.
     INVALIDPARAMETERVALUE_HOSTNAMEWITHSUFFIXTOOLONG("InvalidParameterValue.HostNameWithSuffixTooLong"),
     
    // The specified IPv6 public network bandwidth billing mode is invalid.
     INVALIDPARAMETERVALUE_IPV6INTERNETCHARGETYPE("InvalidParameterValue.IPv6InternetChargeType"),
     
    // The specified image does not exist.
     INVALIDPARAMETERVALUE_IMAGENOTFOUND("InvalidParameterValue.ImageNotFound"),
     
    // Invalid instance name
     INVALIDPARAMETERVALUE_INSTANCENAMEILLEGAL("InvalidParameterValue.InstanceNameIllegal"),
     
    // Instance names with suffixes are too long and exceed the specified upper limit.
     INVALIDPARAMETERVALUE_INSTANCENAMEWITHSUFFIXTOOLONG("InvalidParameterValue.InstanceNameWithSuffixTooLong"),
     
    // The instance type is not supported.
     INVALIDPARAMETERVALUE_INSTANCETYPENOTSUPPORTED("InvalidParameterValue.InstanceTypeNotSupported"),
     
    // Invalid scaling activity ID.
     INVALIDPARAMETERVALUE_INVALIDACTIVITYID("InvalidParameterValue.InvalidActivityId"),
     
    // Invalid scaling group ID.
     INVALIDPARAMETERVALUE_INVALIDAUTOSCALINGGROUPID("InvalidParameterValue.InvalidAutoScalingGroupId"),
     
    // Invalid notification ID.
     INVALIDPARAMETERVALUE_INVALIDAUTOSCALINGNOTIFICATIONID("InvalidParameterValue.InvalidAutoScalingNotificationId"),
     
    // Invalid alarm-triggered policy ID.
     INVALIDPARAMETERVALUE_INVALIDAUTOSCALINGPOLICYID("InvalidParameterValue.InvalidAutoScalingPolicyId"),
     
    // The regions specified for CLB is invalid.
     INVALIDPARAMETERVALUE_INVALIDCLBREGION("InvalidParameterValue.InvalidClbRegion"),
     
    // The format of the placement group ID is incorrect.
     INVALIDPARAMETERVALUE_INVALIDDISASTERRECOVERGROUPID("InvalidParameterValue.InvalidDisasterRecoverGroupId"),
     
    // Invalid filter condition.
     INVALIDPARAMETERVALUE_INVALIDFILTER("InvalidParameterValue.InvalidFilter"),
     
    // The HPC ID is invalid.
     INVALIDPARAMETERVALUE_INVALIDHPCCLUSTERID("InvalidParameterValue.InvalidHpcClusterId"),
     
    // Invalid image ID.
     INVALIDPARAMETERVALUE_INVALIDIMAGEID("InvalidParameterValue.InvalidImageId"),
     
    // Invalid instance ID.
     INVALIDPARAMETERVALUE_INVALIDINSTANCEID("InvalidParameterValue.InvalidInstanceId"),
     
    // Invalid instance type.
     INVALIDPARAMETERVALUE_INVALIDINSTANCETYPE("InvalidParameterValue.InvalidInstanceType"),
     
    // Invalid launch configuration
     INVALIDPARAMETERVALUE_INVALIDLAUNCHCONFIGURATION("InvalidParameterValue.InvalidLaunchConfiguration"),
     
    // Invalid launch configuration ID.
     INVALIDPARAMETERVALUE_INVALIDLAUNCHCONFIGURATIONID("InvalidParameterValue.InvalidLaunchConfigurationId"),
     
    // Invalid lifecycle hook ID.
     INVALIDPARAMETERVALUE_INVALIDLIFECYCLEHOOKID("InvalidParameterValue.InvalidLifecycleHookId"),
     
    // The notification group ID should be a numeric string.
     INVALIDPARAMETERVALUE_INVALIDNOTIFICATIONUSERGROUPID("InvalidParameterValue.InvalidNotificationUserGroupId"),
     
    // Invalid scheduled action ID.
     INVALIDPARAMETERVALUE_INVALIDSCHEDULEDACTIONID("InvalidParameterValue.InvalidScheduledActionId"),
     
    // The scheduled task name contains invalid characters.
     INVALIDPARAMETERVALUE_INVALIDSCHEDULEDACTIONNAMEINCLUDEILLEGALCHAR("InvalidParameterValue.InvalidScheduledActionNameIncludeIllegalChar"),
     
    // Invalid security group ID.
     INVALIDPARAMETERVALUE_INVALIDSECURITYGROUPID("InvalidParameterValue.InvalidSecurityGroupId"),
     
    // Invalid snapshot ID.
     INVALIDPARAMETERVALUE_INVALIDSNAPSHOTID("InvalidParameterValue.InvalidSnapshotId"),
     
    // Invalid subnet ID.
     INVALIDPARAMETERVALUE_INVALIDSUBNETID("InvalidParameterValue.InvalidSubnetId"),
     
    // The launch configuration name already exists.
     INVALIDPARAMETERVALUE_LAUNCHCONFIGURATIONNAMEDUPLICATED("InvalidParameterValue.LaunchConfigurationNameDuplicated"),
     
    // The specified launch configuration was not found.
     INVALIDPARAMETERVALUE_LAUNCHCONFIGURATIONNOTFOUND("InvalidParameterValue.LaunchConfigurationNotFound"),
     
    // The load balancer is in a different project.
     INVALIDPARAMETERVALUE_LBPROJECTINCONSISTENT("InvalidParameterValue.LbProjectInconsistent"),
     
    // The lifecycle hook name already exists.
     INVALIDPARAMETERVALUE_LIFECYCLEHOOKNAMEDUPLICATED("InvalidParameterValue.LifecycleHookNameDuplicated"),
     
    // The value exceeds the limit.
     INVALIDPARAMETERVALUE_LIMITEXCEEDED("InvalidParameterValue.LimitExceeded"),
     
    // Target group listeners are not supported.
     INVALIDPARAMETERVALUE_LISTENERTARGETTYPENOTSUPPORTED("InvalidParameterValue.ListenerTargetTypeNotSupported"),
     
    // The maximum additional quantity is too large.
     INVALIDPARAMETERVALUE_MAXSURGETOOLARGE("InvalidParameterValue.MaxSurgeTooLarge"),
     
    // The bandwidth package ID is required.
     INVALIDPARAMETERVALUE_MISSINGBANDWIDTHPACKAGEID("InvalidParameterValue.MissingBandwidthPackageId"),
     
    // No resource permission.
     INVALIDPARAMETERVALUE_NORESOURCEPERMISSION("InvalidParameterValue.NoResourcePermission"),
     
    // The value should be a floating point string.
     INVALIDPARAMETERVALUE_NOTSTRINGTYPEFLOAT("InvalidParameterValue.NotStringTypeFloat"),
     
    // The account only supports VPCs.
     INVALIDPARAMETERVALUE_ONLYVPC("InvalidParameterValue.OnlyVpc"),
     
    // The project ID does not exist.
     INVALIDPARAMETERVALUE_PROJECTIDNOTFOUND("InvalidParameterValue.ProjectIdNotFound"),
     
    // The value is outside the specified range.
     INVALIDPARAMETERVALUE_RANGE("InvalidParameterValue.Range"),
     
    // The alarm policy name already exists.
     INVALIDPARAMETERVALUE_SCALINGPOLICYNAMEDUPLICATE("InvalidParameterValue.ScalingPolicyNameDuplicate"),
     
    // The scheduled task name already exists.
     INVALIDPARAMETERVALUE_SCHEDULEDACTIONNAMEDUPLICATE("InvalidParameterValue.ScheduledActionNameDuplicate"),
     
    // The value of maximum, minimum, or desired number of instances in the auto scaling group is invalid.
     INVALIDPARAMETERVALUE_SIZE("InvalidParameterValue.Size"),
     
    // The start time of the scheduled task is before the current time.
     INVALIDPARAMETERVALUE_STARTTIMEBEFORECURRENTTIME("InvalidParameterValue.StartTimeBeforeCurrentTime"),
     
    // The subnet information is invalid.
     INVALIDPARAMETERVALUE_SUBNETIDS("InvalidParameterValue.SubnetIds"),
     
    // The backend port of the CLB layer-4 listener already exists.
     INVALIDPARAMETERVALUE_TARGETPORTDUPLICATED("InvalidParameterValue.TargetPortDuplicated"),
     
    // Executing a target tracking policy is not supported.
     INVALIDPARAMETERVALUE_TARGETTRACKINGSCALINGPOLICY("InvalidParameterValue.TargetTrackingScalingPolicy"),
     
    // The specified threshold must be within the valid range.
     INVALIDPARAMETERVALUE_THRESHOLDOUTOFRANGE("InvalidParameterValue.ThresholdOutOfRange"),
     
    // Wrong time format.
     INVALIDPARAMETERVALUE_TIMEFORMAT("InvalidParameterValue.TimeFormat"),
     
    // Too many values.
     INVALIDPARAMETERVALUE_TOOLONG("InvalidParameterValue.TooLong"),
     
    // The value of input parameter is too short.
     INVALIDPARAMETERVALUE_TOOSHORT("InvalidParameterValue.TooShort"),
     
    // Incorrect UserData format.
     INVALIDPARAMETERVALUE_USERDATAFORMATERROR("InvalidParameterValue.UserDataFormatError"),
     
    // The UserData is too long.
     INVALIDPARAMETERVALUE_USERDATASIZEEXCEEDED("InvalidParameterValue.UserDataSizeExceeded"),
     
    // The user group does not exist.
     INVALIDPARAMETERVALUE_USERGROUPIDNOTFOUND("InvalidParameterValue.UserGroupIdNotFound"),
     
    // The specified availability zone is not in the region.
     INVALIDPARAMETERVALUE_ZONEMISMATCHREGION("InvalidParameterValue.ZoneMismatchRegion"),
     
    // The account does not support this operation.
     INVALIDPERMISSION("InvalidPermission"),
     
    // The quota limit is exceeded.
     LIMITEXCEEDED("LimitExceeded"),
     
    // Binding with the specified CLBs will make the total number of bound CLBs exceeds the upper limit.
     LIMITEXCEEDED_AFTERATTACHLBLIMITEXCEEDED("LimitExceeded.AfterAttachLbLimitExceeded"),
     
    // The number of auto scaling groups exceeds the limit.
     LIMITEXCEEDED_AUTOSCALINGGROUPLIMITEXCEEDED("LimitExceeded.AutoScalingGroupLimitExceeded"),
     
    // The desired number of instances exceeds the limit.
     LIMITEXCEEDED_DESIREDCAPACITYLIMITEXCEEDED("LimitExceeded.DesiredCapacityLimitExceeded"),
     
    // Too many values for the specified filter
     LIMITEXCEEDED_FILTERVALUESTOOLONG("LimitExceeded.FilterValuesTooLong"),
     
    // You are short of the launch configuration quota.
     LIMITEXCEEDED_LAUNCHCONFIGURATIONQUOTANOTENOUGH("LimitExceeded.LaunchConfigurationQuotaNotEnough"),
     
    // The maximum number of instances exceeds the limit.
     LIMITEXCEEDED_MAXSIZELIMITEXCEEDED("LimitExceeded.MaxSizeLimitExceeded"),
     
    // The minimum number of instances is below the limit.
     LIMITEXCEEDED_MINSIZELIMITEXCEEDED("LimitExceeded.MinSizeLimitExceeded"),
     
    // You are short of the quota.
     LIMITEXCEEDED_QUOTANOTENOUGH("LimitExceeded.QuotaNotEnough"),
     
    // The number of scheduled tasks exceeds the limit.
     LIMITEXCEEDED_SCHEDULEDACTIONLIMITEXCEEDED("LimitExceeded.ScheduledActionLimitExceeded"),
     
    // Only one target tracking policy can be created for a scaling group.
     LIMITEXCEEDED_TARGETTRACKINGSCALINGPOLICY("LimitExceeded.TargetTrackingScalingPolicy"),
     
    // Parameter missing.
     MISSINGPARAMETER("MissingParameter"),
     
    // A parameter is missing in a specific scenario.
     MISSINGPARAMETER_INSCENARIO("MissingParameter.InScenario"),
     
    // The `InstanceMarketOptions` parameter of the spot instance is missing.
     MISSINGPARAMETER_INSTANCEMARKETOPTIONS("MissingParameter.InstanceMarketOptions"),
     
    // The auto scaling group is performing a scaling activity.
     RESOURCEINUSE_ACTIVITYINPROGRESS("ResourceInUse.ActivityInProgress"),
     
    // The scaling group is disabled.
     RESOURCEINUSE_AUTOSCALINGGROUPNOTACTIVE("ResourceInUse.AutoScalingGroupNotActive"),
     
    // There are still normal instances in the auto scaling group.
     RESOURCEINUSE_INSTANCEINGROUP("ResourceInUse.InstanceInGroup"),
     
    // The specified launch configuration is still used in the scaling group.
     RESOURCEINUSE_LAUNCHCONFIGURATIONIDINUSE("ResourceInUse.LaunchConfigurationIdInUse"),
     
    // The maximum number of instances in the auto scaling group is exceeded.
     RESOURCEINSUFFICIENT_AUTOSCALINGGROUPABOVEMAXSIZE("ResourceInsufficient.AutoScalingGroupAboveMaxSize"),
     
    // The number of instances in the auto scaling group is below the minimum value.
     RESOURCEINSUFFICIENT_AUTOSCALINGGROUPBELOWMINSIZE("ResourceInsufficient.AutoScalingGroupBelowMinSize"),
     
    // The number of instances in a scaling group is more than the maximum capacity.
     RESOURCEINSUFFICIENT_INSERVICEINSTANCEABOVEMAXSIZE("ResourceInsufficient.InServiceInstanceAboveMaxSize"),
     
    // The number of instances in a scaling group is less than the minimum capacity.
     RESOURCEINSUFFICIENT_INSERVICEINSTANCEBELOWMINSIZE("ResourceInsufficient.InServiceInstanceBelowMinSize"),
     
    // The scaling group does not exist.
     RESOURCENOTFOUND_AUTOSCALINGGROUPIDNOTFOUND("ResourceNotFound.AutoScalingGroupIdNotFound"),
     
    // The scaling group does not exist.
     RESOURCENOTFOUND_AUTOSCALINGGROUPNOTFOUND("ResourceNotFound.AutoScalingGroupNotFound"),
     
    // The notification does not exist.
     RESOURCENOTFOUND_AUTOSCALINGNOTIFICATIONNOTFOUND("ResourceNotFound.AutoScalingNotificationNotFound"),
     
    // The specified bandwidth package ID is not found.
     RESOURCENOTFOUND_BANDWIDTHPACKAGEIDNOTFOUND("ResourceNotFound.BandwidthPackageIdNotFound"),
     
    // The specified CMQ queue does not exist.
     RESOURCENOTFOUND_CMQQUEUENOTFOUND("ResourceNotFound.CmqQueueNotFound"),
     
    // The command does not exist.
     RESOURCENOTFOUND_COMMANDNOTFOUND("ResourceNotFound.CommandNotFound"),
     
    // The specified placement group ID does not exist.
     RESOURCENOTFOUND_DISASTERRECOVERGROUPNOTFOUND("ResourceNotFound.DisasterRecoverGroupNotFound"),
     
    // The specified instance does not exist.
     RESOURCENOTFOUND_INSTANCESNOTFOUND("ResourceNotFound.InstancesNotFound"),
     
    // The target instance is not in the auto scaling group.
     RESOURCENOTFOUND_INSTANCESNOTINAUTOSCALINGGROUP("ResourceNotFound.InstancesNotInAutoScalingGroup"),
     
    // The specified launch configuration does not exist.
     RESOURCENOTFOUND_LAUNCHCONFIGURATIONIDNOTFOUND("ResourceNotFound.LaunchConfigurationIdNotFound"),
     
    // The instance corresponding to the lifecycle hook does not exist.
     RESOURCENOTFOUND_LIFECYCLEHOOKINSTANCENOTFOUND("ResourceNotFound.LifecycleHookInstanceNotFound"),
     
    // The specified lifecycle hook was not found.
     RESOURCENOTFOUND_LIFECYCLEHOOKNOTFOUND("ResourceNotFound.LifecycleHookNotFound"),
     
    // The specified lifecycle hook token does not exist.
     RESOURCENOTFOUND_LIFECYCLEHOOKTOKENNOTFOUND("ResourceNotFound.LifecycleHookTokenNotFound"),
     
    // The specified listener does not exist.
     RESOURCENOTFOUND_LISTENERNOTFOUND("ResourceNotFound.ListenerNotFound"),
     
    // The specified load balancer was not found.
     RESOURCENOTFOUND_LOADBALANCERNOTFOUND("ResourceNotFound.LoadBalancerNotFound"),
     
    // The specified CLB does not exist in the current scaling group.
     RESOURCENOTFOUND_LOADBALANCERNOTINAUTOSCALINGGROUP("ResourceNotFound.LoadBalancerNotInAutoScalingGroup"),
     
    // The specified location does not exist.
     RESOURCENOTFOUND_LOCATIONNOTFOUND("ResourceNotFound.LocationNotFound"),
     
    // The specified instance refresh activity does not exist.
     RESOURCENOTFOUND_REFRESHACTIVITYNOTFOUND("ResourceNotFound.RefreshActivityNotFound"),
     
    // The alarm policy does not exist.
     RESOURCENOTFOUND_SCALINGPOLICYNOTFOUND("ResourceNotFound.ScalingPolicyNotFound"),
     
    // The specified scheduled task does not exist.
     RESOURCENOTFOUND_SCHEDULEDACTIONNOTFOUND("ResourceNotFound.ScheduledActionNotFound"),
     
    // The TDMQ-CMQ queue doesn't exist.
     RESOURCENOTFOUND_TDMQCMQQUEUENOTFOUND("ResourceNotFound.TDMQCMQQueueNotFound"),
     
    // The TDMQ-CMQ topic doesn't exist.
     RESOURCENOTFOUND_TDMQCMQTOPICNOTFOUND("ResourceNotFound.TDMQCMQTopicNotFound"),
     
    // The auto scaling group is exceptional.
     RESOURCEUNAVAILABLE_AUTOSCALINGGROUPABNORMALSTATUS("ResourceUnavailable.AutoScalingGroupAbnormalStatus"),
     
    // The auto scaling group is disabled.
     RESOURCEUNAVAILABLE_AUTOSCALINGGROUPDISABLED("ResourceUnavailable.AutoScalingGroupDisabled"),
     
    // The auto scaling group is active.
     RESOURCEUNAVAILABLE_AUTOSCALINGGROUPINACTIVITY("ResourceUnavailable.AutoScalingGroupInActivity"),
     
    // The scaling group is already involved in another instance refresh activity.
     RESOURCEUNAVAILABLE_AUTOSCALINGGROUPINREFRESHACTIVITY("ResourceUnavailable.AutoScalingGroupInRefreshActivity"),
     
    // There are no subscribers for the specified CMQ topic.
     RESOURCEUNAVAILABLE_CMQTOPICHASNOSUBSCRIBER("ResourceUnavailable.CmqTopicHasNoSubscriber"),
     
    // The instance and the auto scaling group are in different VPCs.
     RESOURCEUNAVAILABLE_CVMVPCINCONSISTENT("ResourceUnavailable.CvmVpcInconsistent"),
     
    // You cannot modify the VPC of a scaling group bound with a load balancer.
     RESOURCEUNAVAILABLE_FORBIDDENMODIFYVPC("ResourceUnavailable.ForbiddenModifyVpc"),
     
    // The instance reinstallation quotation failed, because the new image conflicts with other parameters of the instance or the new image does not exist.
     RESOURCEUNAVAILABLE_INQUIRYPRICERESETINSTANCEFAILED("ResourceUnavailable.InquiryPriceResetInstanceFailed"),
     
    // Unable to add the instance to the scaling group.
     RESOURCEUNAVAILABLE_INSTANCECANNOTATTACH("ResourceUnavailable.InstanceCannotAttach"),
     
    // The specified instance is active.
     RESOURCEUNAVAILABLE_INSTANCEINOPERATION("ResourceUnavailable.InstanceInOperation"),
     
    // The instance does not support **No Charges When Shut Down**.
     RESOURCEUNAVAILABLE_INSTANCENOTSUPPORTSTOPCHARGING("ResourceUnavailable.InstanceNotSupportStopCharging"),
     
    // The instance already exists in the auto scaling group.
     RESOURCEUNAVAILABLE_INSTANCESALREADYINAUTOSCALINGGROUP("ResourceUnavailable.InstancesAlreadyInAutoScalingGroup"),
     
    // The launch configuration is exceptional.
     RESOURCEUNAVAILABLE_LAUNCHCONFIGURATIONSTATUSABNORMAL("ResourceUnavailable.LaunchConfigurationStatusAbnormal"),
     
    // The backend region of the CLB is not the same as the one for AS service.
     RESOURCEUNAVAILABLE_LBBACKENDREGIONINCONSISTENT("ResourceUnavailable.LbBackendRegionInconsistent"),
     
    // The CLBs are not in the same project.
     RESOURCEUNAVAILABLE_LBPROJECTINCONSISTENT("ResourceUnavailable.LbProjectInconsistent"),
     
    // The CLB and scaling group should reside in the same VPC.
     RESOURCEUNAVAILABLE_LBVPCINCONSISTENT("ResourceUnavailable.LbVpcInconsistent"),
     
    // The lifecycle action has already been set.
     RESOURCEUNAVAILABLE_LIFECYCLEACTIONRESULTHASSET("ResourceUnavailable.LifecycleActionResultHasSet"),
     
    // CLB is active in the scaling group.
     RESOURCEUNAVAILABLE_LOADBALANCERINOPERATION("ResourceUnavailable.LoadBalancerInOperation"),
     
    // There are no instances in running status within the scaling group, making it impossible to perform an instance refresh.
     RESOURCEUNAVAILABLE_NOINSTANCECANREFRESH("ResourceUnavailable.NoInstanceCanRefresh"),
     
    // There are no instances eligible for rollback in the scaling group.
     RESOURCEUNAVAILABLE_NOINSTANCECANROLLBACK("ResourceUnavailable.NoInstanceCanRollback"),
     
    // Project inconsistency.
     RESOURCEUNAVAILABLE_PROJECTINCONSISTENT("ResourceUnavailable.ProjectInconsistent"),
     
    // The current refresh activity is in a successful status and not the most recent execution, so it cannot be rolled back.
     RESOURCEUNAVAILABLE_REFRESHACTIVITYCANNOTROLLBACK("ResourceUnavailable.RefreshActivityCanNotRollback"),
     
    // The instance refresh activity status conflicts with the current operation.
     RESOURCEUNAVAILABLE_REFRESHACTIVITYSTATUSCONFLICTWITHOPERATION("ResourceUnavailable.RefreshActivityStatusConflictWithOperation"),
     
    // Rollback type instance refresh activity cannot be rolled back again.
     RESOURCEUNAVAILABLE_ROLLBACKTYPEACTIVITYCANNOTROLLBACKAGAIN("ResourceUnavailable.RollbackTypeActivityCanNotRollbackAgain"),
     
    // Unable to add instances to the scaling group when they are shut down.
     RESOURCEUNAVAILABLE_STOPPEDINSTANCENOTALLOWATTACH("ResourceUnavailable.StoppedInstanceNotAllowAttach"),
     
    // The TDMQ-CMQ topic is not subscribed.
     RESOURCEUNAVAILABLE_TDMQCMQTOPICHASNOSUBSCRIBER("ResourceUnavailable.TDMQCMQTopicHasNoSubscriber"),
     
    // The specified availability zone is unavailable.
     RESOURCEUNAVAILABLE_ZONEUNAVAILABLE("ResourceUnavailable.ZoneUnavailable"),
     
    // You have not assigned the CAM role AS-QCSRole to Auto Scaling. Please go to the AS console to complete authorization first.
     UNAUTHORIZEDOPERATION_AUTOSCALINGROLEUNAUTHORIZED("UnauthorizedOperation.AutoScalingRoleUnauthorized"),
     
    // Unsupported operation.
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private AsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

