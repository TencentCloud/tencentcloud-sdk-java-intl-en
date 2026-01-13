/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.mqtt.v20240516;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mqtt.v20240516.models.*;

public class MqttClient extends AbstractClient{
    private static String endpoint = "mqtt.intl.tencentcloudapi.com";
    private static String service = "mqtt";
    private static String version = "2024-05-16";

    public MqttClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MqttClient(Credential credential, String region, ClientProfile profile) {
        super(MqttClient.endpoint, MqttClient.version, credential, region, profile);
    }

    /**
     *This API is used to add a subscription for an MQTT client.
     * @param req AddClientSubscriptionRequest
     * @return AddClientSubscriptionResponse
     * @throws TencentCloudSDKException
     */
    public AddClientSubscriptionResponse AddClientSubscription(AddClientSubscriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddClientSubscription", AddClientSubscriptionResponse.class);
    }

    /**
     *This API is used to create a performance test task for an MQTT instance.
     * @param req CreateAuthorizationPolicyRequest
     * @return CreateAuthorizationPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuthorizationPolicyResponse CreateAuthorizationPolicy(CreateAuthorizationPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAuthorizationPolicy", CreateAuthorizationPolicyResponse.class);
    }

    /**
     *This API is used to purchase a new MQTT instance.
     * @param req CreateInstanceRequest
     * @return CreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceResponse CreateInstance(CreateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstance", CreateInstanceResponse.class);
    }

    /**
     *This API is used to create a message enrichment rule.
     * @param req CreateMessageEnrichmentRuleRequest
     * @return CreateMessageEnrichmentRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateMessageEnrichmentRuleResponse CreateMessageEnrichmentRule(CreateMessageEnrichmentRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMessageEnrichmentRule", CreateMessageEnrichmentRuleResponse.class);
    }

    /**
     *This API is used to add an MQTT role.
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUser", CreateUserResponse.class);
    }

    /**
     *This API is used to delete policy rules.
     * @param req DeleteAuthorizationPolicyRequest
     * @return DeleteAuthorizationPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAuthorizationPolicyResponse DeleteAuthorizationPolicy(DeleteAuthorizationPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAuthorizationPolicy", DeleteAuthorizationPolicyResponse.class);
    }

    /**
     *This API is used to delete a subscription of an MQTT client.
     * @param req DeleteClientSubscriptionRequest
     * @return DeleteClientSubscriptionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClientSubscriptionResponse DeleteClientSubscription(DeleteClientSubscriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClientSubscription", DeleteClientSubscriptionResponse.class);
    }

    /**
     *This API is used to delete an MQTT instance.
     * @param req DeleteInstanceRequest
     * @return DeleteInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceResponse DeleteInstance(DeleteInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInstance", DeleteInstanceResponse.class);
    }

    /**
     *This API is used to delete the message enrichment rule.
     * @param req DeleteMessageEnrichmentRuleRequest
     * @return DeleteMessageEnrichmentRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMessageEnrichmentRuleResponse DeleteMessageEnrichmentRule(DeleteMessageEnrichmentRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMessageEnrichmentRule", DeleteMessageEnrichmentRuleResponse.class);
    }

    /**
     *This API is used to delete an MQTT topic.
     * @param req DeleteTopicRequest
     * @return DeleteTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicResponse DeleteTopic(DeleteTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTopic", DeleteTopicResponse.class);
    }

    /**
     *This API is used to delete an MQTT user.
     * @param req DeleteUserRequest
     * @return DeleteUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserResponse DeleteUser(DeleteUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUser", DeleteUserResponse.class);
    }

    /**
     *This API is used to query authorization rules.
     * @param req DescribeAuthorizationPoliciesRequest
     * @return DescribeAuthorizationPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuthorizationPoliciesResponse DescribeAuthorizationPolicies(DescribeAuthorizationPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuthorizationPolicies", DescribeAuthorizationPoliciesResponse.class);
    }

    /**
     *This API is used to query the MQTT client details.
     * @param req DescribeClientListRequest
     * @return DescribeClientListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientListResponse DescribeClientList(DescribeClientListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClientList", DescribeClientListResponse.class);
    }

    /**
     *This API is used to query instance information.
     * @param req DescribeInstanceRequest
     * @return DescribeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceResponse DescribeInstance(DescribeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstance", DescribeInstanceResponse.class);
    }

    /**
     *This API is used to query messages based on subscription.
     * @param req DescribeMessageByTopicRequest
     * @return DescribeMessageByTopicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMessageByTopicResponse DescribeMessageByTopic(DescribeMessageByTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMessageByTopic", DescribeMessageByTopicResponse.class);
    }

    /**
     *This API is used to query the MQTT message details.
     * @param req DescribeMessageDetailsRequest
     * @return DescribeMessageDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMessageDetailsResponse DescribeMessageDetails(DescribeMessageDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMessageDetails", DescribeMessageDetailsResponse.class);
    }

    /**
     *This API is used to query message enrichment rules.
     * @param req DescribeMessageEnrichmentRulesRequest
     * @return DescribeMessageEnrichmentRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMessageEnrichmentRulesResponse DescribeMessageEnrichmentRules(DescribeMessageEnrichmentRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMessageEnrichmentRules", DescribeMessageEnrichmentRulesResponse.class);
    }

    /**
     *This API is used to query the MQTT topic details.
     * @param req DescribeTopicRequest
     * @return DescribeTopicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicResponse DescribeTopic(DescribeTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopic", DescribeTopicResponse.class);
    }

    /**
     *This API is used to query the user list. Filter parameter usage instructions are as follows:.

This API is used to perform Username fuzzy search.
     * @param req DescribeUserListRequest
     * @return DescribeUserListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserListResponse DescribeUserList(DescribeUserListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserList", DescribeUserListResponse.class);
    }

    /**
     *This API is used to kick out a client.
     * @param req KickOutClientRequest
     * @return KickOutClientResponse
     * @throws TencentCloudSDKException
     */
    public KickOutClientResponse KickOutClient(KickOutClientRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KickOutClient", KickOutClientResponse.class);
    }

    /**
     *This API is used to modify policy rules. See the data plane authorization policy description (https://www.tencentcloud.com/document/product/1778/109715?from_cn_redirect=1).
     * @param req ModifyAuthorizationPolicyRequest
     * @return ModifyAuthorizationPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuthorizationPolicyResponse ModifyAuthorizationPolicy(ModifyAuthorizationPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAuthorizationPolicy", ModifyAuthorizationPolicyResponse.class);
    }

    /**
     *This API is used to modify instance attributes. Only running clusters can call this API to perform configuration change.
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstance", ModifyInstanceResponse.class);
    }

    /**
     *This API is used to modify message enrichment rules.
Note: All attributes of the current rule must be submitted, even if specific fields are not modified.
     * @param req ModifyMessageEnrichmentRuleRequest
     * @return ModifyMessageEnrichmentRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMessageEnrichmentRuleResponse ModifyMessageEnrichmentRule(ModifyMessageEnrichmentRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMessageEnrichmentRule", ModifyMessageEnrichmentRuleResponse.class);
    }

    /**
     *This API is used to modify an MQTT role.
     * @param req ModifyUserRequest
     * @return ModifyUserResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserResponse ModifyUser(ModifyUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUser", ModifyUserResponse.class);
    }

    /**
     *This API is used to modify policy rule priority.
     * @param req UpdateAuthorizationPolicyPriorityRequest
     * @return UpdateAuthorizationPolicyPriorityResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAuthorizationPolicyPriorityResponse UpdateAuthorizationPolicyPriority(UpdateAuthorizationPolicyPriorityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAuthorizationPolicyPriority", UpdateAuthorizationPolicyPriorityResponse.class);
    }

    /**
     *This API is used to modify the priority for message enrichment rule.
     * @param req UpdateMessageEnrichmentRulePriorityRequest
     * @return UpdateMessageEnrichmentRulePriorityResponse
     * @throws TencentCloudSDKException
     */
    public UpdateMessageEnrichmentRulePriorityResponse UpdateMessageEnrichmentRulePriority(UpdateMessageEnrichmentRulePriorityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateMessageEnrichmentRulePriority", UpdateMessageEnrichmentRulePriorityResponse.class);
    }

}
