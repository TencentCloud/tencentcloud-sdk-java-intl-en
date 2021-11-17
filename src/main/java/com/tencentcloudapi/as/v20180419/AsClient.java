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
     *This API (AttachInstances) is used to add CVM instances to an auto scaling group.

     * @param req AttachInstancesRequest
     * @return AttachInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AttachInstancesResponse AttachInstances(AttachInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to clear specific attributes of the launch configuration.
     * @param req ClearLaunchConfigurationAttributesRequest
     * @return ClearLaunchConfigurationAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ClearLaunchConfigurationAttributesResponse ClearLaunchConfigurationAttributes(ClearLaunchConfigurationAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ClearLaunchConfigurationAttributesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ClearLaunchConfigurationAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ClearLaunchConfigurationAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CompleteLifecycleAction) is used to complete a lifecycle action.

* The result ("CONTINUE" or "ABANDON") of a specific lifecycle hook can be specified by calling this API. If this API is not called at all, the lifecycle hook will be processed based on the "DefaultResult" after timeout.

     * @param req CompleteLifecycleActionRequest
     * @return CompleteLifecycleActionResponse
     * @throws TencentCloudSDKException
     */
    public CompleteLifecycleActionResponse CompleteLifecycleAction(CompleteLifecycleActionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CompleteLifecycleActionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CompleteLifecycleActionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CompleteLifecycleAction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateAutoScalingGroup) is used to create an auto scaling group.
     * @param req CreateAutoScalingGroupRequest
     * @return CreateAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoScalingGroupResponse CreateAutoScalingGroup(CreateAutoScalingGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAutoScalingGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAutoScalingGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAutoScalingGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create launch configurations and scaling groups based on an instance.

Note: for a scaling group that is created based on a monthly-subscribed instance, the instances added for scale-out are pay-as-you-go instance.
     * @param req CreateAutoScalingGroupFromInstanceRequest
     * @return CreateAutoScalingGroupFromInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoScalingGroupFromInstanceResponse CreateAutoScalingGroupFromInstance(CreateAutoScalingGroupFromInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAutoScalingGroupFromInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAutoScalingGroupFromInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAutoScalingGroupFromInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateLaunchConfiguration) is used to create a launch configuration.

* A few fields of a launch configuration can be modified through `ModifyLaunchConfigurationAttributes`. To use a new launch configuration, it is recommended to create it from scratch.

* You can create up to 20 launch configurations for each project. For more information, see [Usage Limits](https://intl.cloud.tencent.com/document/product/377/3120?from_cn_redirect=1).

     * @param req CreateLaunchConfigurationRequest
     * @return CreateLaunchConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public CreateLaunchConfigurationResponse CreateLaunchConfiguration(CreateLaunchConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLaunchConfigurationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLaunchConfigurationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLaunchConfiguration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateLifeCycleHook) is used to create a lifecycle hook.

* You can configure message notifications in the following format for lifecycle hooks, which will be sent to your CMQ queue by AS:

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
        JsonResponseModel<CreateLifecycleHookResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLifecycleHookResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLifecycleHook");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<CreateNotificationConfigurationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNotificationConfigurationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNotificationConfiguration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateScalingPolicy) is used to create an alarm trigger policy.
     * @param req CreateScalingPolicyRequest
     * @return CreateScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateScalingPolicyResponse CreateScalingPolicy(CreateScalingPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateScalingPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateScalingPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateScalingPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateScheduledAction) is used to create a scheduled task.
     * @param req CreateScheduledActionRequest
     * @return CreateScheduledActionResponse
     * @throws TencentCloudSDKException
     */
    public CreateScheduledActionResponse CreateScheduledAction(CreateScheduledActionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateScheduledActionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateScheduledActionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateScheduledAction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteAutoScalingGroup) is used to delete the specified auto scaling group that has no instances and remains inactive.
     * @param req DeleteAutoScalingGroupRequest
     * @return DeleteAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAutoScalingGroupResponse DeleteAutoScalingGroup(DeleteAutoScalingGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAutoScalingGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAutoScalingGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAutoScalingGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteLaunchConfiguration) is used to delete a launch configuration.

* If the launch configuration is active in an auto scaling group, it cannot be deleted.

     * @param req DeleteLaunchConfigurationRequest
     * @return DeleteLaunchConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLaunchConfigurationResponse DeleteLaunchConfiguration(DeleteLaunchConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLaunchConfigurationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLaunchConfigurationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLaunchConfiguration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteLifeCycleHook) is used to delete a lifecycle hook.
     * @param req DeleteLifecycleHookRequest
     * @return DeleteLifecycleHookResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLifecycleHookResponse DeleteLifecycleHook(DeleteLifecycleHookRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLifecycleHookResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLifecycleHookResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLifecycleHook");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteNotificationConfiguration) is used to delete the specified notification.
     * @param req DeleteNotificationConfigurationRequest
     * @return DeleteNotificationConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNotificationConfigurationResponse DeleteNotificationConfiguration(DeleteNotificationConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNotificationConfigurationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNotificationConfigurationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNotificationConfiguration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteScalingPolicy) is used to delete an alarm trigger policy.
     * @param req DeleteScalingPolicyRequest
     * @return DeleteScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScalingPolicyResponse DeleteScalingPolicy(DeleteScalingPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteScalingPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteScalingPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteScalingPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteScheduledAction) is used to delete the specified scheduled task.
     * @param req DeleteScheduledActionRequest
     * @return DeleteScheduledActionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScheduledActionResponse DeleteScheduledAction(DeleteScheduledActionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteScheduledActionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteScheduledActionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteScheduledAction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeAccountLimits) is used to query the limits of user's AS resources.
     * @param req DescribeAccountLimitsRequest
     * @return DescribeAccountLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountLimitsResponse DescribeAccountLimits(DescribeAccountLimitsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountLimitsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccountLimitsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccountLimits");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeAutoScalingActivities) is used to query the activity history of an auto scaling group.
     * @param req DescribeAutoScalingActivitiesRequest
     * @return DescribeAutoScalingActivitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalingActivitiesResponse DescribeAutoScalingActivities(DescribeAutoScalingActivitiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAutoScalingActivitiesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAutoScalingActivitiesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAutoScalingActivities");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the latest activity history of an auto scaling group.
     * @param req DescribeAutoScalingGroupLastActivitiesRequest
     * @return DescribeAutoScalingGroupLastActivitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalingGroupLastActivitiesResponse DescribeAutoScalingGroupLastActivities(DescribeAutoScalingGroupLastActivitiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAutoScalingGroupLastActivitiesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAutoScalingGroupLastActivitiesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAutoScalingGroupLastActivities");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<DescribeAutoScalingGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAutoScalingGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAutoScalingGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<DescribeAutoScalingInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAutoScalingInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAutoScalingInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeLaunchConfigurations) is used to query the information of launch configurations.

* You can query the launch configuration details based on information such as launch configuration ID and name. For more information on filters, see `Filter`.
* If the parameter is empty, a certain number (specified by `Limit` and 20 by default) of launch configurations of the current user will be returned.
     * @param req DescribeLaunchConfigurationsRequest
     * @return DescribeLaunchConfigurationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLaunchConfigurationsResponse DescribeLaunchConfigurations(DescribeLaunchConfigurationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLaunchConfigurationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLaunchConfigurationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLaunchConfigurations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<DescribeLifecycleHooksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLifecycleHooksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLifecycleHooks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<DescribeNotificationConfigurationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNotificationConfigurationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNotificationConfigurations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeScalingPolicies) is used to query alarm trigger policies.
     * @param req DescribeScalingPoliciesRequest
     * @return DescribeScalingPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScalingPoliciesResponse DescribeScalingPolicies(DescribeScalingPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScalingPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScalingPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScalingPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<DescribeScheduledActionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScheduledActionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScheduledActions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<DetachInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DisableAutoScalingGroup) is used to disable the specified auto scaling group.
     * @param req DisableAutoScalingGroupRequest
     * @return DisableAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public DisableAutoScalingGroupResponse DisableAutoScalingGroup(DisableAutoScalingGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableAutoScalingGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableAutoScalingGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableAutoScalingGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (EnableAutoScalingGroup) is used to enable the specified auto scaling group.
     * @param req EnableAutoScalingGroupRequest
     * @return EnableAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public EnableAutoScalingGroupResponse EnableAutoScalingGroup(EnableAutoScalingGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableAutoScalingGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableAutoScalingGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableAutoScalingGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ExecuteScalingPolicy) is used to execute a scaling policy.

* The scaling policy can be executed based on the scaling policy ID.
* When the auto scaling group to which the scaling policy belongs is performing a scaling activity, the scaling policy will be rejected.
     * @param req ExecuteScalingPolicyRequest
     * @return ExecuteScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ExecuteScalingPolicyResponse ExecuteScalingPolicy(ExecuteScalingPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExecuteScalingPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ExecuteScalingPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExecuteScalingPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyAutoScalingGroup) is used to modify an auto scaling group.
     * @param req ModifyAutoScalingGroupRequest
     * @return ModifyAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoScalingGroupResponse ModifyAutoScalingGroup(ModifyAutoScalingGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAutoScalingGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAutoScalingGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAutoScalingGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyDesiredCapacity) is used to modify the desired number of instances in the specified auto scaling group.
     * @param req ModifyDesiredCapacityRequest
     * @return ModifyDesiredCapacityResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDesiredCapacityResponse ModifyDesiredCapacity(ModifyDesiredCapacityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDesiredCapacityResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDesiredCapacityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDesiredCapacity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<ModifyLaunchConfigurationAttributesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLaunchConfigurationAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLaunchConfigurationAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<ModifyLoadBalancersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLoadBalancersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLoadBalancers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a notification policy.
* The receiver type of the notification policy cannot be modified.
     * @param req ModifyNotificationConfigurationRequest
     * @return ModifyNotificationConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNotificationConfigurationResponse ModifyNotificationConfiguration(ModifyNotificationConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNotificationConfigurationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNotificationConfigurationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNotificationConfiguration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyScalingPolicy) is used to modify an alarm trigger policy.
     * @param req ModifyScalingPolicyRequest
     * @return ModifyScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyScalingPolicyResponse ModifyScalingPolicy(ModifyScalingPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyScalingPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyScalingPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyScalingPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyScheduledAction) is used to modify a scheduled task.
     * @param req ModifyScheduledActionRequest
     * @return ModifyScheduledActionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyScheduledActionResponse ModifyScheduledAction(ModifyScheduledActionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyScheduledActionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyScheduledActionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyScheduledAction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<RemoveInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to reduce the specified number of instances from the scaling group, which returns the scaling activity ID `ActivityId`.
* The scaling group is not active.
* The scale-in instances will be selected according to the `TerminationPolicies` policy as described in [Reducing Capacity](https://intl.cloud.tencent.com/document/product/377/8563?from_cn_redirect=1).
* Only the `IN_SERVICE` instances will be reduced. To reduce instances in other statues, use the [`DetachInstances`](https://intl.cloud.tencent.com/document/api/377/20436?from_cn_redirect=1) or [`RemoveInstances`](https://intl.cloud.tencent.com/document/api/377/20431?from_cn_redirect=1) API.
* The desired capacity will be reduced accordingly. The new desired capacity should be no less than the minimum capacity.
* If the scale-in activity failed or partially succeeded, the final desired capacity only deducts the instances that have been reduced successfully.
     * @param req ScaleInInstancesRequest
     * @return ScaleInInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ScaleInInstancesResponse ScaleInInstances(ScaleInInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScaleInInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ScaleInInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ScaleInInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add the specified number of instances to the scaling group, which returns the scaling activity ID `ActivityId`.
* The scaling group is not active.
* The desired capacity will be increased accordingly. The new desired capacity should be no more than the maximum capacity.
* If the scale-out activity failed or partially succeeded, the final desired capacity only includes the instances that have been added successfully.
     * @param req ScaleOutInstancesRequest
     * @return ScaleOutInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutInstancesResponse ScaleOutInstances(ScaleOutInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScaleOutInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ScaleOutInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ScaleOutInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable scale-in protection for an instance.
When scale-in protection is enabled, the instance will not be removed in scale-in activities triggered by replacement of unhealthy instances, alarm threshold reached, change of desired quantity, etc.
     * @param req SetInstancesProtectionRequest
     * @return SetInstancesProtectionResponse
     * @throws TencentCloudSDKException
     */
    public SetInstancesProtectionResponse SetInstancesProtection(SetInstancesProtectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetInstancesProtectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetInstancesProtectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetInstancesProtection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<StartAutoScalingInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartAutoScalingInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartAutoScalingInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<StopAutoScalingInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopAutoScalingInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopAutoScalingInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (UpgradeLaunchConfiguration) is used to upgrade a launch configuration.

* This API is used to upgrade a launch configuration in a "completely overriding" manner, i.e., it uniformly sets a new configuration according to the API parameters regardless of the original parameters. If optional fields are left empty, their default values will be used.
* After the launch configuration is upgraded, the existing instances that have been created by it will not be changed, but new instances will be created according to the new configuration.
     * @param req UpgradeLaunchConfigurationRequest
     * @return UpgradeLaunchConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeLaunchConfigurationResponse UpgradeLaunchConfiguration(UpgradeLaunchConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeLaunchConfigurationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeLaunchConfigurationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeLaunchConfiguration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (UpgradeLifecycleHook) is used to upgrade a lifecycle hook.

* This API is used to upgrade a lifecycle hook in a "completely overriding" manner, i.e., it uniformly sets a new configuration according to the API parameters regardless of the original parameters. If optional fields are left empty, their default values will be used.

     * @param req UpgradeLifecycleHookRequest
     * @return UpgradeLifecycleHookResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeLifecycleHookResponse UpgradeLifecycleHook(UpgradeLifecycleHookRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeLifecycleHookResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeLifecycleHookResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeLifecycleHook");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
