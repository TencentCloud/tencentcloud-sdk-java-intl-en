package com.tencentcloudapi.batch.v20170312;
public enum BatchErrorCode {
    // One (and only one) parameter must be specified for ComputeEnv and EnvId.
     ALLOWEDONEATTRIBUTEINENVIDANDCOMPUTEENV("AllowedOneAttributeInEnvIdAndComputeEnv"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // The CPM API call returns an error.
     INTERNALERROR_CALLCPMAPI("InternalError.CallCpmAPI"),
     
    // An error is returned for the CVM API call.
     INTERNALERROR_CALLCVM("InternalError.CallCvm"),
     
    // Error while obtaining the Tag component.
     INTERNALERROR_CALLTAGAPI("InternalError.CallTagAPI"),
     
    // The specified filter is not supported.
     INVALIDFILTER("InvalidFilter"),
     
    // Invalid compute node ID format.
     INVALIDPARAMETER_COMPUTENODEIDMALFORMED("InvalidParameter.ComputeNodeIdMalformed"),
     
    // Invalid CVM parameter.
     INVALIDPARAMETER_CVMPARAMETERS("InvalidParameter.CvmParameters"),
     
    // The compute environment description is too long.
     INVALIDPARAMETER_ENVDESCRIPTIONTOOLONG("InvalidParameter.EnvDescriptionTooLong"),
     
    // Invalid compute environment ID format.
     INVALIDPARAMETER_ENVIDMALFORMED("InvalidParameter.EnvIdMalformed"),
     
    // The compute environment name is too long.
     INVALIDPARAMETER_ENVNAMETOOLONG("InvalidParameter.EnvNameTooLong"),
     
    // Incorrect image ID.
     INVALIDPARAMETER_IMAGEIDMALFORMED("InvalidParameter.ImageIdMalformed"),
     
    // Invalid parameter combination.
     INVALIDPARAMETER_INVALIDPARAMETERCOMBINATION("InvalidParameter.InvalidParameterCombination"),
     
    // Invalid instance ID format.
     INVALIDPARAMETER_JOBIDMALFORMED("InvalidParameter.JobIdMalformed"),
     
    // Duplicate message notification event name.
     INVALIDPARAMETER_NOTIFICATIONEVENTNAMEDUPLICATE("InvalidParameter.NotificationEventNameDuplicate"),
     
    // Invalid topic name.
     INVALIDPARAMETER_NOTIFICATIONTOPICNAME("InvalidParameter.NotificationTopicName"),
     
    // The topic name is too long.
     INVALIDPARAMETER_NOTIFICATIONTOPICNAMETOOLONG("InvalidParameter.NotificationTopicNameTooLong"),
     
    // Invalid job name.
     INVALIDPARAMETER_TASKNAME("InvalidParameter.TaskName"),
     
    // The task name is too long.
     INVALIDPARAMETER_TASKNAMETOOLONG("InvalidParameter.TaskNameTooLong"),
     
    // The task template description is too long.
     INVALIDPARAMETER_TASKTEMPLATEDESCRIPTIONTOOLONG("InvalidParameter.TaskTemplateDescriptionTooLong"),
     
    // Invalid task template ID format.
     INVALIDPARAMETER_TASKTEMPLATEIDMALFORMED("InvalidParameter.TaskTemplateIdMalformed"),
     
    // Invalid task template name.
     INVALIDPARAMETER_TASKTEMPLATENAME("InvalidParameter.TaskTemplateName"),
     
    // The task template name is too long.
     INVALIDPARAMETER_TASKTEMPLATENAMETOOLONG("InvalidParameter.TaskTemplateNameTooLong"),
     
    // At least one of TaskTemplateName, TaskTemplateDescription, and TaskTemplateInfo must be contained.
     INVALIDPARAMETERATLEASTONEATTRIBUTE("InvalidParameterAtLeastOneAttribute"),
     
    // Incorrect parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // Compute environment parameter validation failed.
     INVALIDPARAMETERVALUE_COMPUTEENV("InvalidParameterValue.ComputeEnv"),
     
    // The dependent task definition was not found.
     INVALIDPARAMETERVALUE_DEPENDENCENOTFOUNDTASKNAME("InvalidParameterValue.DependenceNotFoundTaskName"),
     
    // Loop task dependency is prohibited.
     INVALIDPARAMETERVALUE_DEPENDENCEUNFEASIBLE("InvalidParameterValue.DependenceUnfeasible"),
     
    // Instance IDs duplicate.
     INVALIDPARAMETERVALUE_INSTANCEIDDUPLICATED("InvalidParameterValue.InstanceIdDuplicated"),
     
    // The specified instance type is not supported.
     INVALIDPARAMETERVALUE_INSTANCETYPE("InvalidParameterValue.InstanceType"),
     
    // The instance type value must be unique.
     INVALIDPARAMETERVALUE_INSTANCETYPEDUPLICATE("InvalidParameterValue.InstanceTypeDuplicate"),
     
    // The list of instance types cannot be empty.
     INVALIDPARAMETERVALUE_INSTANCETYPESEMPTY("InvalidParameterValue.InstanceTypesEmpty"),
     
    // The value of `DataTypeAny` is invalid.
     INVALIDPARAMETERVALUE_INVALIDDATATYPEANY("InvalidParameterValue.InvalidDataTypeAny"),
     
    // Incorrect `Filter` parameter.
     INVALIDPARAMETERVALUE_INVALIDFILTER("InvalidParameterValue.InvalidFilter"),
     
    // The number of filter parameter values exceeds the limit.
     INVALIDPARAMETERVALUE_LIMITEXCEEDED("InvalidParameterValue.LimitExceeded"),
     
    // Invalid local storage path.
     INVALIDPARAMETERVALUE_LOCALPATH("InvalidParameterValue.LocalPath"),
     
    // The number of retries is too large.
     INVALIDPARAMETERVALUE_MAXRETRYCOUNT("InvalidParameterValue.MaxRetryCount"),
     
    // Invalid negative parameter.
     INVALIDPARAMETERVALUE_NEGATIVE("InvalidParameterValue.Negative"),
     
    // Invalid storage path format.
     INVALIDPARAMETERVALUE_REMOTESTORAGEPATH("InvalidParameterValue.RemoteStoragePath"),
     
    // Invalid storage type.
     INVALIDPARAMETERVALUE_REMOTESTORAGESCHEMETYPE("InvalidParameterValue.RemoteStorageSchemeType"),
     
    // The specified ResourceType is invalid.
     INVALIDPARAMETERVALUE_RESOURCETYPE("InvalidParameterValue.ResourceType"),
     
    // The availability zone is unavailable.
     INVALIDPARAMETERVALUE_UNAVAILABLEZONE("InvalidParameterValue.UnavailableZone"),
     
    // The model billing type is not supported by BatchCompute.
     INVALIDPARAMETERVALUE_UNSUPPORTEDBATCHINSTANCECHARGETYPE("InvalidParameterValue.UnsupportedBatchInstanceChargeType"),
     
    // The specified zone does not exist.
     INVALIDZONE_MISMATCHREGION("InvalidZone.MismatchRegion"),
     
    // Insufficient compute environment quota.
     LIMITEXCEEDED_COMPUTEENVQUOTA("LimitExceeded.ComputeEnvQuota"),
     
    // Insufficient CPU quota.
     LIMITEXCEEDED_CPUQUOTA("LimitExceeded.CpuQuota"),
     
    // Insufficient task template quota.
     LIMITEXCEEDED_TASKTEMPLATEQUOTA("LimitExceeded.TaskTemplateQuota"),
     
    // The job is in use.
     RESOURCEINUSE_JOB("ResourceInUse.Job"),
     
    // The specified compute environment does not exist.
     RESOURCENOTFOUND_COMPUTEENV("ResourceNotFound.ComputeEnv"),
     
    // The specified compute node does not exist.
     RESOURCENOTFOUND_COMPUTENODE("ResourceNotFound.ComputeNode"),
     
    // The specified instance does not exist.
     RESOURCENOTFOUND_JOB("ResourceNotFound.Job"),
     
    // The specified job task does not exist.
     RESOURCENOTFOUND_TASK("ResourceNotFound.Task"),
     
    // The specified task instance does not exist.
     RESOURCENOTFOUND_TASKINSTANCE("ResourceNotFound.TaskInstance"),
     
    // The specified job template ID does not exist.
     RESOURCENOTFOUND_TASKTEMPLATE("ResourceNotFound.TaskTemplate"),
     
    // It is prohibited to use the BatchCompute service.
     UNAUTHORIZEDOPERATION_USERNOTALLOWEDTOUSEBATCH("UnauthorizedOperation.UserNotAllowedToUseBatch"),
     
    // Unknown parameter.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // Unsupported operation.
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
    // Another request is being processed and deletion is prohibited.
     UNSUPPORTEDOPERATION_ACCEPTOTHERREQUEST("UnsupportedOperation.AcceptOtherRequest"),
     
    // The compute environment accepts other requests.
     UNSUPPORTEDOPERATION_COMPUTEENVACCEPTOTHERREQUEST("UnsupportedOperation.ComputeEnvAcceptOtherRequest"),
     
    // Deletion is prohibited.
     UNSUPPORTEDOPERATION_COMPUTEENVOPERATION("UnsupportedOperation.ComputeEnvOperation"),
     
    // Compute node termination is prohibited.
     UNSUPPORTEDOPERATION_COMPUTENODEFORBIDTERMINATE("UnsupportedOperation.ComputeNodeForbidTerminate"),
     
    // The compute node is terminating.
     UNSUPPORTEDOPERATION_COMPUTENODEISTERMINATING("UnsupportedOperation.ComputeNodeIsTerminating"),
     
    // This instance cannot be added to the compute environment.
     UNSUPPORTEDOPERATION_INSTANCESNOTALLOWTOATTACH("UnsupportedOperation.InstancesNotAllowToAttach"),
     
    // The number of compute nodes to be removed for scale-in is greater than the number of existing compute nodes.
     UNSUPPORTEDOPERATION_NOTENOUGHCOMPUTENODESTOTERMINATE("UnsupportedOperation.NotEnoughComputeNodesToTerminate"),
     
    // This operation is prohibited for the task instances in the specified compute environment.
     UNSUPPORTEDOPERATION_TERMINATEOPERATIONWITHENVID("UnsupportedOperation.TerminateOperationWithEnvId");
     
    private String value;
    private BatchErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

