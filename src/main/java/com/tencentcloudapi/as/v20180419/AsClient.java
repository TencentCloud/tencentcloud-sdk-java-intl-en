/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.as.v20180419;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.as.v20180419.models.*;

public class AsClient extends AbstractClient{
    private static String endpoint = "as.tencentcloudapi.com";
    private static String service = "as";
    private static String version = "2018-04-19";
    
    public AsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AsClient(Credential credential, String region, ClientProfile profile) {
        super(AsClient.endpoint, AsClient.version, credential, region, profile);
    }

    /**
     *This API is used to add CVM instances to an auto scaling group.
* Only CVM instances in `RUNNING` or `STOPPED` status can be added.
* The added CVM instances must in the same VPC as the scaling group.

     * @param req AttachInstancesRequest
     * @return AttachInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AttachInstancesResponse AttachInstances(AttachInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachInstances", AttachInstancesResponse.class);
    }

    /**
     *This API is used to add CLBs to a security group.
     * @param req AttachLoadBalancersRequest
     * @return AttachLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public AttachLoadBalancersResponse AttachLoadBalancers(AttachLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachLoadBalancers", AttachLoadBalancersResponse.class);
    }

    /**
     *This API is used to cancel the instance refresh activity of the scaling group.
* Batches that have already been refreshed or are currently being refreshed remain unaffected; batches pending refresh will be canceled.
* If a refresh fails, the affected instances will remain in the standby status and require manual intervention by the user to either attempt to exit the standby status or destroy the instances.
* Rollback operations are not allowed after cancellation, and resuming is also unsupported.
     * @param req CancelInstanceRefreshRequest
     * @return CancelInstanceRefreshResponse
     * @throws TencentCloudSDKException
     */
    public CancelInstanceRefreshResponse CancelInstanceRefresh(CancelInstanceRefreshRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelInstanceRefresh", CancelInstanceRefreshResponse.class);
    }

    /**
     *This API is used to clear specific attributes of the launch configuration.
     * @param req ClearLaunchConfigurationAttributesRequest
     * @return ClearLaunchConfigurationAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ClearLaunchConfigurationAttributesResponse ClearLaunchConfigurationAttributes(ClearLaunchConfigurationAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ClearLaunchConfigurationAttributes", ClearLaunchConfigurationAttributesResponse.class);
    }

    /**
     *This API is used to complete a lifecycle action by setting the status of lifecycle hook to `CONTINUE` or `ABANDON`.

* If this API is not called, the lifecycle hook goes to the status specified in `DefaultResult` after the timeout period.
     * @param req CompleteLifecycleActionRequest
     * @return CompleteLifecycleActionResponse
     * @throws TencentCloudSDKException
     */
    public CompleteLifecycleActionResponse CompleteLifecycleAction(CompleteLifecycleActionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CompleteLifecycleAction", CompleteLifecycleActionResponse.class);
    }

    /**
     *This API (CreateAutoScalingGroup) is used to create an auto scaling group.
     * @param req CreateAutoScalingGroupRequest
     * @return CreateAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoScalingGroupResponse CreateAutoScalingGroup(CreateAutoScalingGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAutoScalingGroup", CreateAutoScalingGroupResponse.class);
    }

    /**
     *This API is used to create launch configurations and scaling groups based on an instance.

Note: for a scaling group that is created based on a monthly-subscribed instance, the instances added for scale-out are pay-as-you-go instance.
     * @param req CreateAutoScalingGroupFromInstanceRequest
     * @return CreateAutoScalingGroupFromInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoScalingGroupFromInstanceResponse CreateAutoScalingGroupFromInstance(CreateAutoScalingGroupFromInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAutoScalingGroupFromInstance", CreateAutoScalingGroupFromInstanceResponse.class);
    }

    /**
     *This API is used to create a launch configuration.

* To modify a launch configuration, please use `ModifyLaunchConfigurationAttributes`.

* Up to 20 launch configurations can be created for each project. For more information, see [Usage Limits](https://intl.cloud.tencent.com/document/product/377/3120?from_cn_redirect=1).
     * @param req CreateLaunchConfigurationRequest
     * @return CreateLaunchConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public CreateLaunchConfigurationResponse CreateLaunchConfiguration(CreateLaunchConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLaunchConfiguration", CreateLaunchConfigurationResponse.class);
    }

    /**
     *This API is used to create a lifecycle hook.

* You can configure notifications or automation commands (TAT) for the lifecycle hook.

If you configured a notification, Auto Scaling will notify the TDMQ queue of the following information:

```
{
	"Service": "Tencent Cloud Auto Scaling",
	"Time": "2019-03-14T10:15:11Z",
	"AppId": "1251783334",
	"ActivityId": "asa-fznnvrja",
	"AutoScalingGroupId": "asg-rrrrtttt",
	"LifecycleHookId": "ash-xxxxyyyy",
	"LifecycleHookName": "my-hook",
	"LifecycleActionToken": "3080e1c9-0efe-4dd7-ad3b-90cd6618298f",
	"InstanceId": "ins-aaaabbbb",
	"LifecycleTransition": "INSTANCE_LAUNCHING",
	"NotificationMetadata": ""
}
```
     * @param req CreateLifecycleHookRequest
     * @return CreateLifecycleHookResponse
     * @throws TencentCloudSDKException
     */
    public CreateLifecycleHookResponse CreateLifecycleHook(CreateLifecycleHookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLifecycleHook", CreateLifecycleHookResponse.class);
    }

    /**
     *This API is used to create a notification policy.
When the notification is sent to a CMQ topic or queue, the following contents are included:
```
{
    "Service": "Tencent Cloud Auto Scaling",
    "CreatedTime": "2021-10-11T10:15:11Z", // Activity creation time
    "AppId": "100000000",
    "ActivityId": "asa-fznnvrja", // Scaling activity ID
    "AutoScalingGroupId": "asg-pc2oqu2z", // Scaling group ID
    "ActivityType": "SCALE_OUT",  // Scaling activity type
    "StatusCode": "SUCCESSFUL",   // Scaling activity result
    "Description": "Activity was launched in response to a difference between desired capacity and actual capacity,
    scale out 1 instance(s).", // Scaling activity description
    "StartTime": "2021-10-11T10:15:11Z",  // Activity starting time
    "EndTime": "2021-10-11T10:15:32Z",    // Activity ending time
    "DetailedStatusMessageSet": [ // A collection of failed attempts during the scaling process (Failed attempts are allowed in a successful scaling activity)
        {
            "Code": "InvalidInstanceType",
            "Zone": "ap-guangzhou-2",
            "InstanceId": "",
            "InstanceChargeType": "POSTPAID_BY_HOUR",
            "SubnetId": "subnet-4t5mgeuu",
            "Message": "The specified instance type `S5.LARGE8` is invalid in `subnet-4t5mgeuu`, `ap-guangzhou-2`.",
            "InstanceType": "S5.LARGE8",
        }
    ]
}
```
     * @param req CreateNotificationConfigurationRequest
     * @return CreateNotificationConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public CreateNotificationConfigurationResponse CreateNotificationConfiguration(CreateNotificationConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNotificationConfiguration", CreateNotificationConfigurationResponse.class);
    }

    /**
     *This API (CreateScalingPolicy) is used to create an alarm trigger policy.
     * @param req CreateScalingPolicyRequest
     * @return CreateScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateScalingPolicyResponse CreateScalingPolicy(CreateScalingPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateScalingPolicy", CreateScalingPolicyResponse.class);
    }

    /**
     *This API (CreateScheduledAction) is used to create a scheduled task.
     * @param req CreateScheduledActionRequest
     * @return CreateScheduledActionResponse
     * @throws TencentCloudSDKException
     */
    public CreateScheduledActionResponse CreateScheduledAction(CreateScheduledActionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateScheduledAction", CreateScheduledActionResponse.class);
    }

    /**
     *This API is used to delete an auto-scaling group. Make sure that there are no `IN_SERVICE` instances in the group, and there are no ongoing scaling activities. When you delete a scaling group, instances in the status of `CREATION_FAILED`, `TERMINATION_FAILED` and `DETACH_FAILED` are not terminated.
     * @param req DeleteAutoScalingGroupRequest
     * @return DeleteAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAutoScalingGroupResponse DeleteAutoScalingGroup(DeleteAutoScalingGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAutoScalingGroup", DeleteAutoScalingGroupResponse.class);
    }

    /**
     *This API (DeleteLaunchConfiguration) is used to delete a launch configuration.

* If the launch configuration is active in an auto scaling group, it cannot be deleted.

     * @param req DeleteLaunchConfigurationRequest
     * @return DeleteLaunchConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLaunchConfigurationResponse DeleteLaunchConfiguration(DeleteLaunchConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLaunchConfiguration", DeleteLaunchConfigurationResponse.class);
    }

    /**
     *This API (DeleteLifeCycleHook) is used to delete a lifecycle hook.
     * @param req DeleteLifecycleHookRequest
     * @return DeleteLifecycleHookResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLifecycleHookResponse DeleteLifecycleHook(DeleteLifecycleHookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLifecycleHook", DeleteLifecycleHookResponse.class);
    }

    /**
     *This API (DeleteNotificationConfiguration) is used to delete the specified notification.
     * @param req DeleteNotificationConfigurationRequest
     * @return DeleteNotificationConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNotificationConfigurationResponse DeleteNotificationConfiguration(DeleteNotificationConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNotificationConfiguration", DeleteNotificationConfigurationResponse.class);
    }

    /**
     *This API (DeleteScalingPolicy) is used to delete an alarm trigger policy.
     * @param req DeleteScalingPolicyRequest
     * @return DeleteScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScalingPolicyResponse DeleteScalingPolicy(DeleteScalingPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteScalingPolicy", DeleteScalingPolicyResponse.class);
    }

    /**
     *This API (DeleteScheduledAction) is used to delete the specified scheduled task.
     * @param req DeleteScheduledActionRequest
     * @return DeleteScheduledActionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScheduledActionResponse DeleteScheduledAction(DeleteScheduledActionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteScheduledAction", DeleteScheduledActionResponse.class);
    }

    /**
     *This API (DescribeAccountLimits) is used to query the limits of user's AS resources.
     * @param req DescribeAccountLimitsRequest
     * @return DescribeAccountLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountLimitsResponse DescribeAccountLimits(DescribeAccountLimitsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountLimits", DescribeAccountLimitsResponse.class);
    }

    /**
     *This API (DescribeAutoScalingActivities) is used to query the activity history of an auto scaling group.
     * @param req DescribeAutoScalingActivitiesRequest
     * @return DescribeAutoScalingActivitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalingActivitiesResponse DescribeAutoScalingActivities(DescribeAutoScalingActivitiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScalingActivities", DescribeAutoScalingActivitiesResponse.class);
    }

    /**
     *This API is used to query suggestions for scaling group configurations.
     * @param req DescribeAutoScalingAdvicesRequest
     * @return DescribeAutoScalingAdvicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalingAdvicesResponse DescribeAutoScalingAdvices(DescribeAutoScalingAdvicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScalingAdvices", DescribeAutoScalingAdvicesResponse.class);
    }

    /**
     *This API is used to query the latest activity history of an auto scaling group.
     * @param req DescribeAutoScalingGroupLastActivitiesRequest
     * @return DescribeAutoScalingGroupLastActivitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalingGroupLastActivitiesResponse DescribeAutoScalingGroupLastActivities(DescribeAutoScalingGroupLastActivitiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScalingGroupLastActivities", DescribeAutoScalingGroupLastActivitiesResponse.class);
    }

    /**
     *This API (DescribeAutoScalingGroups) is used to query the information of auto scaling groups.

* You can query the details of auto scaling groups based on information such as auto scaling group ID, auto scaling group name, or launch configuration ID. For more information on filters, see `Filter`.
* If the parameter is empty, a certain number (specified by `Limit` and 20 by default) of auto scaling groups of the current user will be returned.
     * @param req DescribeAutoScalingGroupsRequest
     * @return DescribeAutoScalingGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalingGroupsResponse DescribeAutoScalingGroups(DescribeAutoScalingGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScalingGroups", DescribeAutoScalingGroupsResponse.class);
    }

    /**
     *This API (DescribeAutoScalingInstances) is used to query the information of instances associated with AS.

* You can query the details of instances based on information such as instance ID and auto scaling group ID. For more information on filters, see `Filter`.
* If the parameter is empty, a certain number (specified by `Limit` and 20 by default) of instances of the current user will be returned.
     * @param req DescribeAutoScalingInstancesRequest
     * @return DescribeAutoScalingInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalingInstancesResponse DescribeAutoScalingInstances(DescribeAutoScalingInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScalingInstances", DescribeAutoScalingInstancesResponse.class);
    }

    /**
     *This API is used to query the information of launch configurations.

* You can query the launch configuration details based on information such as launch configuration ID and name. For more information on filters, see `Filter`.
* If the parameter is empty, a certain number (specified by `Limit` and 20 by default) of launch configurations of the current user will be returned.
     * @param req DescribeLaunchConfigurationsRequest
     * @return DescribeLaunchConfigurationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLaunchConfigurationsResponse DescribeLaunchConfigurations(DescribeLaunchConfigurationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLaunchConfigurations", DescribeLaunchConfigurationsResponse.class);
    }

    /**
     *This API (DescribeLifecycleHooks) is used to query the information of lifecycle hooks.

* You can query the details of lifecycle hooks based on information such as auto scaling group ID, lifecycle hook ID, or lifecycle hook name. For more information on filters, see `Filter`.
* If the parameter is empty, a certain number (specified by `Limit` and 20 by default) of lifecycle hooks of the current user will be returned.
     * @param req DescribeLifecycleHooksRequest
     * @return DescribeLifecycleHooksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLifecycleHooksResponse DescribeLifecycleHooks(DescribeLifecycleHooksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLifecycleHooks", DescribeLifecycleHooksResponse.class);
    }

    /**
     *This API (DescribeNotificationConfigurations) is used to query the information of one or more notifications.

You can query the details of notifications based on information such as notification ID and auto scaling group ID. For more information on filters, see `Filter`.
If the parameter is empty, a certain number (specified by `Limit` and 20 by default) of notifications of the current user will be returned.
     * @param req DescribeNotificationConfigurationsRequest
     * @return DescribeNotificationConfigurationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotificationConfigurationsResponse DescribeNotificationConfigurations(DescribeNotificationConfigurationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotificationConfigurations", DescribeNotificationConfigurationsResponse.class);
    }

    /**
     *This API (DescribeRefreshActivities) is used to query the instance refresh activity records of a scaling group.
     * @param req DescribeRefreshActivitiesRequest
     * @return DescribeRefreshActivitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRefreshActivitiesResponse DescribeRefreshActivities(DescribeRefreshActivitiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRefreshActivities", DescribeRefreshActivitiesResponse.class);
    }

    /**
     *This API (DescribeScalingPolicies) is used to query alarm trigger policies.
     * @param req DescribeScalingPoliciesRequest
     * @return DescribeScalingPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScalingPoliciesResponse DescribeScalingPolicies(DescribeScalingPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScalingPolicies", DescribeScalingPoliciesResponse.class);
    }

    /**
     *This API (DescribeScheduledActions) is used to query the details of one or more scheduled tasks.

* You can query the details of scheduled tasks based on information such as scheduled task ID, scheduled task name, or auto scaling group ID. For more information on filters, see `Filter`.
* If the parameter is empty, a certain number (specified by `Limit` and 20 by default) of scheduled tasks of the current user will be returned.
     * @param req DescribeScheduledActionsRequest
     * @return DescribeScheduledActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScheduledActionsResponse DescribeScheduledActions(DescribeScheduledActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScheduledActions", DescribeScheduledActionsResponse.class);
    }

    /**
     *This API is used to remove CVM instances from a scaling group. Instances removed via this API will not be terminated.
* If the number of remaining `IN_SERVICE` instances in the scaling group is less than the minimum capacity, this API will return an error.
* However, if the scaling group is in `DISABLED` status, the removal will not verify the relationship between the number of `IN_SERVICE` instances and the minimum capacity.
* This removal will unassociate the CVM from the CLB instance that has been configured for the scaling group.
     * @param req DetachInstancesRequest
     * @return DetachInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DetachInstancesResponse DetachInstances(DetachInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachInstances", DetachInstancesResponse.class);
    }

    /**
     *This API is used to unbind one or more CLBs from a scaling group. This API will not terminate CLBs.
     * @param req DetachLoadBalancersRequest
     * @return DetachLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public DetachLoadBalancersResponse DetachLoadBalancers(DetachLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachLoadBalancers", DetachLoadBalancersResponse.class);
    }

    /**
     *This API is used to disable the specified auto-scaling group.
* When a scaling group is disabled, the following activities are not triggered automatically:
    - Scaling activities triggered alert policies
    - Scaling activities triggered by desired group capacity
    - Replacement of unhealthy instances
    - Scheduled actions
* When the scaling group is disabled, you can trigger scaling activities manually, including: 
    - Scale out to the specify number of instances (ScaleOutInstances)
    - Scale in to the specify number of instances (ScaleInInstances)
    - Remove instances from the scaling group (DetachInstances)
    - Delete instances from the scaling group (RemoveInstances)
    - Add instances to a scaling group (AttachInstances)
    - Shut down CVM instances in a scaling group (StopAutoScalingInstances)
    - Start up CVM instances in a scaling group (StartAutoScalingInstances)
     * @param req DisableAutoScalingGroupRequest
     * @return DisableAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public DisableAutoScalingGroupResponse DisableAutoScalingGroup(DisableAutoScalingGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableAutoScalingGroup", DisableAutoScalingGroupResponse.class);
    }

    /**
     *This API (EnableAutoScalingGroup) is used to enable the specified auto scaling group.
     * @param req EnableAutoScalingGroupRequest
     * @return EnableAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public EnableAutoScalingGroupResponse EnableAutoScalingGroup(EnableAutoScalingGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableAutoScalingGroup", EnableAutoScalingGroupResponse.class);
    }

    /**
     *This API is used to execute a scaling policy.

* The scaling policy can be executed based on the scaling policy ID.
* The policy cannot be executed if there are ongoing scaling actions on the scaling group.
* Executing a target tracking policy is not supported.
     * @param req ExecuteScalingPolicyRequest
     * @return ExecuteScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ExecuteScalingPolicyResponse ExecuteScalingPolicy(ExecuteScalingPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExecuteScalingPolicy", ExecuteScalingPolicyResponse.class);
    }

    /**
     *This API is used to exit instances from the standby status in the scaling group.
* When an instance is in standby status, its load balancer weight is set to 0. Upon exiting the standby status, the weight value automatically gets restored.
* Initiating power-on/power-off actions on instances that are in standby status also results in them exiting from the standby status.
     * @param req ExitStandbyRequest
     * @return ExitStandbyResponse
     * @throws TencentCloudSDKException
     */
    public ExitStandbyResponse ExitStandby(ExitStandbyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExitStandby", ExitStandbyResponse.class);
    }

    /**
     *This API (ModifyAutoScalingGroup) is used to modify an auto scaling group.
     * @param req ModifyAutoScalingGroupRequest
     * @return ModifyAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoScalingGroupResponse ModifyAutoScalingGroup(ModifyAutoScalingGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoScalingGroup", ModifyAutoScalingGroupResponse.class);
    }

    /**
     *This API (ModifyDesiredCapacity) is used to modify the desired number of instances in the specified auto scaling group.
     * @param req ModifyDesiredCapacityRequest
     * @return ModifyDesiredCapacityResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDesiredCapacityResponse ModifyDesiredCapacity(ModifyDesiredCapacityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDesiredCapacity", ModifyDesiredCapacityResponse.class);
    }

    /**
     *This API (ModifyLaunchConfigurationAttributes) is used to modify some attributes of a launch configuration.

* The changes of launch configuration do not affect the existing instances. New instances will be created based on the modified configuration.
* This API supports modifying certain simple types of attributes.
     * @param req ModifyLaunchConfigurationAttributesRequest
     * @return ModifyLaunchConfigurationAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLaunchConfigurationAttributesResponse ModifyLaunchConfigurationAttributes(ModifyLaunchConfigurationAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLaunchConfigurationAttributes", ModifyLaunchConfigurationAttributesResponse.class);
    }

    /**
     *This API is used to modify the lifecycle hook.
     * @param req ModifyLifecycleHookRequest
     * @return ModifyLifecycleHookResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLifecycleHookResponse ModifyLifecycleHook(ModifyLifecycleHookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLifecycleHook", ModifyLifecycleHookResponse.class);
    }

    /**
     *This API is used to modify the target rule attributes of the CLB in the scaling group.
     * @param req ModifyLoadBalancerTargetAttributesRequest
     * @return ModifyLoadBalancerTargetAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerTargetAttributesResponse ModifyLoadBalancerTargetAttributes(ModifyLoadBalancerTargetAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancerTargetAttributes", ModifyLoadBalancerTargetAttributesResponse.class);
    }

    /**
     *This API is used to modify the cloud load balancers of a scaling group.

* This API can specify a new cloud load balancer configuration for the scaling group. The new configuration overwrites the original load balancer configuration.
* To clear the cloud load balancer of the scaling group, specify only the scaling group ID but not the specific cloud load balancer.
* This API modifies the cloud load balancer of the scaling group and generate a scaling activity to asynchronously modify the cloud load balancers of existing instances.
     * @param req ModifyLoadBalancersRequest
     * @return ModifyLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancersResponse ModifyLoadBalancers(ModifyLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancers", ModifyLoadBalancersResponse.class);
    }

    /**
     *This API is used to modify a notification policy.
* The receiver type of the notification policy cannot be modified.
     * @param req ModifyNotificationConfigurationRequest
     * @return ModifyNotificationConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNotificationConfigurationResponse ModifyNotificationConfiguration(ModifyNotificationConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNotificationConfiguration", ModifyNotificationConfigurationResponse.class);
    }

    /**
     *This API (ModifyScalingPolicy) is used to modify an alarm trigger policy.
     * @param req ModifyScalingPolicyRequest
     * @return ModifyScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyScalingPolicyResponse ModifyScalingPolicy(ModifyScalingPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyScalingPolicy", ModifyScalingPolicyResponse.class);
    }

    /**
     *This API (ModifyScheduledAction) is used to modify a scheduled task.
     * @param req ModifyScheduledActionRequest
     * @return ModifyScheduledActionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyScheduledActionResponse ModifyScheduledAction(ModifyScheduledActionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyScheduledAction", ModifyScheduledActionResponse.class);
    }

    /**
     *This API is used to delete CVM instances from a scaling group. Instances that are automatically created through AS will be terminated, while those manually added to the scaling group will be removed and retained.
* If the number of remaining `IN_SERVICE` instances in the scaling group is less than the minimum capacity, this API will return an error.
* However, if the scaling group is in `DISABLED` status, the removal will not verify the relationship between the number of `IN_SERVICE` instances and the minimum capacity.
* This removal will unassociate the CVM from the CLB instance that has been configured for the scaling group.
     * @param req RemoveInstancesRequest
     * @return RemoveInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RemoveInstancesResponse RemoveInstances(RemoveInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveInstances", RemoveInstancesResponse.class);
    }

    /**
     *This API is used to resume the paused instance refresh activity, allowing it to retry failed instances in the current batch or proceed with refreshing subsequent batches. Note that calling this interface is ineffective when the activity is not in a paused status.
     * @param req ResumeInstanceRefreshRequest
     * @return ResumeInstanceRefreshResponse
     * @throws TencentCloudSDKException
     */
    public ResumeInstanceRefreshResponse ResumeInstanceRefresh(ResumeInstanceRefreshRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeInstanceRefresh", ResumeInstanceRefreshResponse.class);
    }

    /**
     *This API is used to generate a new instance refresh activity, which also supports batched refreshing and operations such as pausing, resuming, and canceling. The interface returns the RefreshActivityId for the rollback activity.
* Instances pending refresh in the original activity are updated to a canceled status. Nonexistent instances are disregarded, while instances in all other statuses proceed to enter the rollback process.
* Instances that were being refreshed in the original activity will not be immediately terminated; instead, the rollback activity will be executed after their refresh has been completed.
* Rollback is supported for activities that are in a paused status or those with the most recent successful refresh; it is not supported for activities in other statuses.
* When the original refresh activity involves reinstalling instances, for the ImageId parameter, it will automatically restore to the image ID before the rollback; for parameters such as UserData, EnhancedService, LoginSettings, and HostName, they will still be retrieved from the launch configuration, requiring users to manually modify the launch configuration before initiating the rollback.
     * @param req RollbackInstanceRefreshRequest
     * @return RollbackInstanceRefreshResponse
     * @throws TencentCloudSDKException
     */
    public RollbackInstanceRefreshResponse RollbackInstanceRefresh(RollbackInstanceRefreshRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollbackInstanceRefresh", RollbackInstanceRefreshResponse.class);
    }

    /**
     *This API is used to reduce the specified number of instances from the scaling group.
* There is no on going scaling task.
* This API is valid even when the scaling group is disabled. For more details, see [DisableAutoScalingGroup](https://intl.cloud.tencent.com/document/api/377/20435?from_cn_redirect=1).
* You can specify the instances to remove in the scale-in activity by using `TerminationPolicies`. For more information, see [Scaling In Policies](https://intl.cloud.tencent.com/document/product/377/8563?from_cn_redirect=1).
* Only the `IN_SERVICE` instances will be reduced. To reduce instances in other statues, use the [`DetachInstances`](https://intl.cloud.tencent.com/document/api/377/20436?from_cn_redirect=1) or [`RemoveInstances`](https://intl.cloud.tencent.com/document/api/377/20431?from_cn_redirect=1) API.
* The desired capacity will be reduced accordingly. The new desired capacity should be no less than the minimum capacity.
* If the scale-in activity failed or partially succeeded, the final desired capacity only deducts the instances that have been reduced successfully.
     * @param req ScaleInInstancesRequest
     * @return ScaleInInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ScaleInInstancesResponse ScaleInInstances(ScaleInInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleInInstances", ScaleInInstancesResponse.class);
    }

    /**
     *This API is used to add the specified number of instances to a scaling group. It returns the scaling activity ID `ActivityId`.
* u200dMake sure that there are no ongoing scaling tasks.
* This API is valid even when the scaling group is disabled. For more details, see [DisableAutoScalingGroup](https://intl.cloud.tencent.com/document/api/377/20435?from_cn_redirect=1).
* The total number of instances after this action cannot exceed the maximum capacity.
* If a scale-out action failed or partially succeeded, only the number of successfully created instances is added to the number of desired capacity.
* If the allocation policy is `SPOT_MIXED`, there may be multiple scaling activities triggered for one scaling task. u200dIn this case, the first activity ID (`ActivityId`) is returned.
     * @param req ScaleOutInstancesRequest
     * @return ScaleOutInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutInstancesResponse ScaleOutInstances(ScaleOutInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleOutInstances", ScaleOutInstancesResponse.class);
    }

    /**
     *This API is used to enable scale-in protection for an instance.
When scale-in protection is enabled, the instance will not be removed in scale-in activities triggered by replacement of unhealthy instances, alarm threshold reached, change of desired quantity, etc.
     * @param req SetInstancesProtectionRequest
     * @return SetInstancesProtectionResponse
     * @throws TencentCloudSDKException
     */
    public SetInstancesProtectionResponse SetInstancesProtection(SetInstancesProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetInstancesProtection", SetInstancesProtectionResponse.class);
    }

    /**
     *This API is used to start up CVM instances in a scaling group.
* After startup, the instance will be in the `IN_SERVICE` status, which will increase the desired capacity. Please note that the desired capacity cannot exceed the maximum value.
* This API supports batch operation. Up to 100 instances can be started up in each request.
     * @param req StartAutoScalingInstancesRequest
     * @return StartAutoScalingInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StartAutoScalingInstancesResponse StartAutoScalingInstances(StartAutoScalingInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartAutoScalingInstances", StartAutoScalingInstancesResponse.class);
    }

    /**
     *This API is used to refresh running CVM instances in the scaling group and return the RefreshActivityId for the instance refresh activity based on parameters in the launch configuration.
* For refresh methods involving reinstallation (currently only reinstallation is supported), during reinstallation, only the ImageId, UserData, EnhancedService, HostName, and LoginSettings parameters will be fetched from the launch configuration for refreshing; other parameters of the instance will not be refreshed.
* During the instance refresh process (including paused status), the scaling group will be disabled. It is not recommended to modify the associated launch configuration during a refresh, as this may impact the refresh parameters, leading to inconsistent instance configurations.
* In rolling update mode, instance refreshes are performed in multiple batches. If there are failed refreshes within a batch, the activity will enter a failed paused status.
* Instances pending refresh that are removed or destroyed will be marked as NOT_FOUND status, but they will not block the instance refresh activity.
* Even if a running instance has parameters consistent with the latest launch configuration, it can still undergo another refresh.
     * @param req StartInstanceRefreshRequest
     * @return StartInstanceRefreshResponse
     * @throws TencentCloudSDKException
     */
    public StartInstanceRefreshResponse StartInstanceRefresh(StartInstanceRefreshRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartInstanceRefresh", StartInstanceRefreshResponse.class);
    }

    /**
     *This API is used to shut down CVM instances in a scaling group.
* Use the `SOFT_FIRST` shutdown, which means the CVM will be forcibly shut down if the soft shutdown fails.
* Shutting down instances in the `IN_SERVICE` status will reduce the desired capacity, but the desired capacity cannot be less than the minimum value.
* To use the `STOP_CHARGING` shutdown, the instances you want to shut down must satisfy the conditions of [no charges when shut down](https://intl.cloud.tencent.com/document/product/213/19918?from_cn_redirect=1).
* This API supports batch operation. Up to 100 instances can be shut down in each request.
     * @param req StopAutoScalingInstancesRequest
     * @return StopAutoScalingInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StopAutoScalingInstancesResponse StopAutoScalingInstances(StopAutoScalingInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopAutoScalingInstances", StopAutoScalingInstancesResponse.class);
    }

    /**
     *This API is used to pause the ongoing instance refresh activity.
* In the paused status, the scaling group will also be disabled.
* Instances that are currently being updated will not be paused, instances pending updates will have their updates paused.
     * @param req StopInstanceRefreshRequest
     * @return StopInstanceRefreshResponse
     * @throws TencentCloudSDKException
     */
    public StopInstanceRefreshResponse StopInstanceRefresh(StopInstanceRefreshRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopInstanceRefresh", StopInstanceRefreshResponse.class);
    }

    /**
     *已有替代接口ModifyLaunchConfiguration。该接口存在覆盖参数风险，目前官网已隐藏

There is a replacement API: ModifyLaunchConfiguration. This API carries the risk of parameter overwriting, and it has currently been hidden on the official website.
This API (UpgradeLaunchConfiguration) is used to upgrade the launch configuration.
* This API is used to upgrade the launch configuration, adopting an "entirely overwrite" approach. Regardless of previous parameter settings, they will be uniformly replaced with new configurations as specified in the interface parameters. For non-mandatory fields, if not filled in, default values will be assigned.
* After upgrading and modifying the launch configuration, existing instances that have been scaled out using this configuration will not undergo any changes. Subsequently, newly added instances using this upgraded launch configuration will be scaled out according to the new configuration.
     * @param req UpgradeLaunchConfigurationRequest
     * @return UpgradeLaunchConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeLaunchConfigurationResponse UpgradeLaunchConfiguration(UpgradeLaunchConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeLaunchConfiguration", UpgradeLaunchConfigurationResponse.class);
    }

    /**
     *This API (UpgradeLifecycleHook) is used to upgrade a lifecycle hook.

* This API is used to upgrade a lifecycle hook in a "completely overriding" manner, i.e., it uniformly sets a new configuration according to the API parameters regardless of the original parameters. If optional fields are left empty, their default values will be used.

     * @param req UpgradeLifecycleHookRequest
     * @return UpgradeLifecycleHookResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeLifecycleHookResponse UpgradeLifecycleHook(UpgradeLifecycleHookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeLifecycleHook", UpgradeLifecycleHookResponse.class);
    }

}
