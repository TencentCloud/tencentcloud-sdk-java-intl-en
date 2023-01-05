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
package com.tencentcloudapi.monitor.v20180724;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.monitor.v20180724.models.*;

public class MonitorClient extends AbstractClient{
    private static String endpoint = "monitor.tencentcloudapi.com";
    private static String service = "monitor";
    private static String version = "2018-07-24";

    public MonitorClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MonitorClient(Credential credential, String region, ClientProfile profile) {
        super(MonitorClient.endpoint, MonitorClient.version, credential, region, profile);
    }

    /**
     *This API is used to bind a Grafana instance.
     * @param req BindPrometheusManagedGrafanaRequest
     * @return BindPrometheusManagedGrafanaResponse
     * @throws TencentCloudSDKException
     */
    public BindPrometheusManagedGrafanaResponse BindPrometheusManagedGrafana(BindPrometheusManagedGrafanaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindPrometheusManagedGrafanaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindPrometheusManagedGrafanaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindPrometheusManagedGrafana");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to bind an alarm policy to a specific object.
     * @param req BindingPolicyObjectRequest
     * @return BindingPolicyObjectResponse
     * @throws TencentCloudSDKException
     */
    public BindingPolicyObjectResponse BindingPolicyObject(BindingPolicyObjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindingPolicyObjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindingPolicyObjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindingPolicyObject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to forcibly terminate a Grafana instance.
     * @param req CleanGrafanaInstanceRequest
     * @return CleanGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CleanGrafanaInstanceResponse CleanGrafanaInstance(CleanGrafanaInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CleanGrafanaInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CleanGrafanaInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CleanGrafanaInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a notification template.
     * @param req CreateAlarmNoticeRequest
     * @return CreateAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmNoticeResponse CreateAlarmNotice(CreateAlarmNoticeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAlarmNoticeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAlarmNoticeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAlarmNotice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a Cloud Monitor alarm policy.
     * @param req CreateAlarmPolicyRequest
     * @return CreateAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmPolicyResponse CreateAlarmPolicy(CreateAlarmPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAlarmPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAlarmPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAlarmPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a Prometheus alerting rule.

Note that alert object and alert message are special fields of Prometheus Rule Annotations, which need to be passed in through `annotations` and correspond to `summary` and `description` keys respectively. For more information, see [Alerting rules](https://prometheus.io/docs/prometheus/latest/configuration/alerting_rules/).
     * @param req CreateAlertRuleRequest
     * @return CreateAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlertRuleResponse CreateAlertRule(CreateAlertRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAlertRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAlertRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAlertRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an exporter integration.
     * @param req CreateExporterIntegrationRequest
     * @return CreateExporterIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public CreateExporterIntegrationResponse CreateExporterIntegration(CreateExporterIntegrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateExporterIntegrationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateExporterIntegrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateExporterIntegration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a Grafana instance.
     * @param req CreateGrafanaInstanceRequest
     * @return CreateGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateGrafanaInstanceResponse CreateGrafanaInstance(CreateGrafanaInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGrafanaInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGrafanaInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateGrafanaInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a Grafana integration configuration.
     * @param req CreateGrafanaIntegrationRequest
     * @return CreateGrafanaIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public CreateGrafanaIntegrationResponse CreateGrafanaIntegration(CreateGrafanaIntegrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGrafanaIntegrationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGrafanaIntegrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateGrafanaIntegration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a Grafana notification channel.
     * @param req CreateGrafanaNotificationChannelRequest
     * @return CreateGrafanaNotificationChannelResponse
     * @throws TencentCloudSDKException
     */
    public CreateGrafanaNotificationChannelResponse CreateGrafanaNotificationChannel(CreateGrafanaNotificationChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGrafanaNotificationChannelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGrafanaNotificationChannelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateGrafanaNotificationChannel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a policy group.
     * @param req CreatePolicyGroupRequest
     * @return CreatePolicyGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreatePolicyGroupResponse CreatePolicyGroup(CreatePolicyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePolicyGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePolicyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePolicyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a Prometheus CVM agent.
     * @param req CreatePrometheusAgentRequest
     * @return CreatePrometheusAgentResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusAgentResponse CreatePrometheusAgent(CreatePrometheusAgentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrometheusAgentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrometheusAgentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrometheusAgent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a pay-as-you-go Prometheus instance.
     * @param req CreatePrometheusMultiTenantInstancePostPayModeRequest
     * @return CreatePrometheusMultiTenantInstancePostPayModeResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusMultiTenantInstancePostPayModeResponse CreatePrometheusMultiTenantInstancePostPayMode(CreatePrometheusMultiTenantInstancePostPayModeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrometheusMultiTenantInstancePostPayModeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrometheusMultiTenantInstancePostPayModeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrometheusMultiTenantInstancePostPayMode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a Prometheus scrape task.
     * @param req CreatePrometheusScrapeJobRequest
     * @return CreatePrometheusScrapeJobResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusScrapeJobResponse CreatePrometheusScrapeJob(CreatePrometheusScrapeJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrometheusScrapeJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrometheusScrapeJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrometheusScrapeJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a Prometheus recording rule.
     * @param req CreateRecordingRuleRequest
     * @return CreateRecordingRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordingRuleResponse CreateRecordingRule(CreateRecordingRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRecordingRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRecordingRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRecordingRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to authorize a Grafana instance to another Tencent Cloud user.
     * @param req CreateSSOAccountRequest
     * @return CreateSSOAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateSSOAccountResponse CreateSSOAccount(CreateSSOAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSSOAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSSOAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSSOAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a Prometheus scrape configuration in TKE.
<p>Note: The prerequisite is that the corresponding TKE service has been integrated through the Prometheus console. For more information, see
<a href="https://intl.cloud.tencent.com/document/product/248/48859?from_cn_redirect=1" target="_blank">Agent Management</a>.</p>
     * @param req CreateServiceDiscoveryRequest
     * @return CreateServiceDiscoveryResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceDiscoveryResponse CreateServiceDiscovery(CreateServiceDiscoveryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServiceDiscoveryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServiceDiscoveryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateServiceDiscovery");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete alarm notification templates.
     * @param req DeleteAlarmNoticesRequest
     * @return DeleteAlarmNoticesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmNoticesResponse DeleteAlarmNotices(DeleteAlarmNoticesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAlarmNoticesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAlarmNoticesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAlarmNotices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an alarm policy.
     * @param req DeleteAlarmPolicyRequest
     * @return DeleteAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmPolicyResponse DeleteAlarmPolicy(DeleteAlarmPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAlarmPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAlarmPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAlarmPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to batch delete Prometheus alerting rules.
     * @param req DeleteAlertRulesRequest
     * @return DeleteAlertRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlertRulesResponse DeleteAlertRules(DeleteAlertRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAlertRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAlertRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAlertRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an exporter integration.
     * @param req DeleteExporterIntegrationRequest
     * @return DeleteExporterIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteExporterIntegrationResponse DeleteExporterIntegration(DeleteExporterIntegrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteExporterIntegrationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteExporterIntegrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteExporterIntegration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a Grafana instance.
     * @param req DeleteGrafanaInstanceRequest
     * @return DeleteGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGrafanaInstanceResponse DeleteGrafanaInstance(DeleteGrafanaInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteGrafanaInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGrafanaInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteGrafanaInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a Grafana integration configuration.
     * @param req DeleteGrafanaIntegrationRequest
     * @return DeleteGrafanaIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGrafanaIntegrationResponse DeleteGrafanaIntegration(DeleteGrafanaIntegrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteGrafanaIntegrationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGrafanaIntegrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteGrafanaIntegration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a Grafana notification channel.
     * @param req DeleteGrafanaNotificationChannelRequest
     * @return DeleteGrafanaNotificationChannelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGrafanaNotificationChannelResponse DeleteGrafanaNotificationChannel(DeleteGrafanaNotificationChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteGrafanaNotificationChannelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGrafanaNotificationChannelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteGrafanaNotificationChannel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an alarm policy group.
     * @param req DeletePolicyGroupRequest
     * @return DeletePolicyGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeletePolicyGroupResponse DeletePolicyGroup(DeletePolicyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePolicyGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePolicyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePolicyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a Prometheus scrape task.
     * @param req DeletePrometheusScrapeJobsRequest
     * @return DeletePrometheusScrapeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusScrapeJobsResponse DeletePrometheusScrapeJobs(DeletePrometheusScrapeJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePrometheusScrapeJobsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePrometheusScrapeJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePrometheusScrapeJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to batch delete Prometheus recording rules.
     * @param req DeleteRecordingRulesRequest
     * @return DeleteRecordingRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordingRulesResponse DeleteRecordingRules(DeleteRecordingRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRecordingRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRecordingRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRecordingRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an authorized TCMG user.
     * @param req DeleteSSOAccountRequest
     * @return DeleteSSOAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSSOAccountResponse DeleteSSOAccount(DeleteSSOAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSSOAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSSOAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSSOAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the platform event list.
     * @param req DescribeAccidentEventListRequest
     * @return DescribeAccidentEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccidentEventListResponse DescribeAccidentEventList(DescribeAccidentEventListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccidentEventListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccidentEventListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccidentEventList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of alarm events.
     * @param req DescribeAlarmEventsRequest
     * @return DescribeAlarmEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmEventsResponse DescribeAlarmEvents(DescribeAlarmEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmEventsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the alarm records.

Note: **If you use a sub-account, you can only query the alarm records of authorized projects** or uncategorized products.
     * @param req DescribeAlarmHistoriesRequest
     * @return DescribeAlarmHistoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmHistoriesResponse DescribeAlarmHistories(DescribeAlarmHistoriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmHistoriesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmHistoriesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmHistories");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of alarm metrics.
     * @param req DescribeAlarmMetricsRequest
     * @return DescribeAlarmMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmMetricsResponse DescribeAlarmMetrics(DescribeAlarmMetricsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmMetricsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmMetricsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmMetrics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of a single notification template.
     * @param req DescribeAlarmNoticeRequest
     * @return DescribeAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmNoticeResponse DescribeAlarmNotice(DescribeAlarmNoticeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmNoticeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmNoticeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmNotice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get all the callback URLs of an alarm notification template.
     * @param req DescribeAlarmNoticeCallbacksRequest
     * @return DescribeAlarmNoticeCallbacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmNoticeCallbacksResponse DescribeAlarmNoticeCallbacks(DescribeAlarmNoticeCallbacksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmNoticeCallbacksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmNoticeCallbacksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmNoticeCallbacks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of notification templates.
     * @param req DescribeAlarmNoticesRequest
     * @return DescribeAlarmNoticesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmNoticesResponse DescribeAlarmNotices(DescribeAlarmNoticesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmNoticesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmNoticesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmNotices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of alarm policies.
     * @param req DescribeAlarmPoliciesRequest
     * @return DescribeAlarmPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmPoliciesResponse DescribeAlarmPolicies(DescribeAlarmPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the details of a single alarm policy.
     * @param req DescribeAlarmPolicyRequest
     * @return DescribeAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmPolicyResponse DescribeAlarmPolicy(DescribeAlarmPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query a Prometheus alerting rule.
     * @param req DescribeAlertRulesRequest
     * @return DescribeAlertRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlertRulesResponse DescribeAlertRules(DescribeAlertRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlertRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlertRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlertRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query all namespaces.
     * @param req DescribeAllNamespacesRequest
     * @return DescribeAllNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllNamespacesResponse DescribeAllNamespaces(DescribeAllNamespacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAllNamespacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAllNamespacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAllNamespaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the attributes of basic metrics.
     * @param req DescribeBaseMetricsRequest
     * @return DescribeBaseMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaseMetricsResponse DescribeBaseMetrics(DescribeBaseMetricsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaseMetricsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaseMetricsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaseMetrics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the basic alarm list.
     * @param req DescribeBasicAlarmListRequest
     * @return DescribeBasicAlarmListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBasicAlarmListResponse DescribeBasicAlarmList(DescribeBasicAlarmListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBasicAlarmListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBasicAlarmListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBasicAlarmList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the bound object list.
     * @param req DescribeBindingPolicyObjectListRequest
     * @return DescribeBindingPolicyObjectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBindingPolicyObjectListResponse DescribeBindingPolicyObjectList(DescribeBindingPolicyObjectListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBindingPolicyObjectListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBindingPolicyObjectListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBindingPolicyObjectList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the trigger condition template.
     * @param req DescribeConditionsTemplateListRequest
     * @return DescribeConditionsTemplateListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConditionsTemplateListResponse DescribeConditionsTemplateList(DescribeConditionsTemplateListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConditionsTemplateListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConditionsTemplateListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConditionsTemplateList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to list Grafana DNS configurations.
     * @param req DescribeDNSConfigRequest
     * @return DescribeDNSConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDNSConfigResponse DescribeDNSConfig(DescribeDNSConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDNSConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDNSConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDNSConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of exporter integrations.
     * @param req DescribeExporterIntegrationsRequest
     * @return DescribeExporterIntegrationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExporterIntegrationsResponse DescribeExporterIntegrations(DescribeExporterIntegrationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExporterIntegrationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExporterIntegrationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExporterIntegrations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to list all Grafana alert channels.
     * @param req DescribeGrafanaChannelsRequest
     * @return DescribeGrafanaChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaChannelsResponse DescribeGrafanaChannels(DescribeGrafanaChannelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGrafanaChannelsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGrafanaChannelsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGrafanaChannels");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to list Grafana settings, i.e., the `grafana.ini` file content.
     * @param req DescribeGrafanaConfigRequest
     * @return DescribeGrafanaConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaConfigResponse DescribeGrafanaConfig(DescribeGrafanaConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGrafanaConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGrafanaConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGrafanaConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to list Grafana environment variables.
     * @param req DescribeGrafanaEnvironmentsRequest
     * @return DescribeGrafanaEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaEnvironmentsResponse DescribeGrafanaEnvironments(DescribeGrafanaEnvironmentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGrafanaEnvironmentsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGrafanaEnvironmentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGrafanaEnvironments");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to list all Grafana instances under a user account.
     * @param req DescribeGrafanaInstancesRequest
     * @return DescribeGrafanaInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaInstancesResponse DescribeGrafanaInstances(DescribeGrafanaInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGrafanaInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGrafanaInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGrafanaInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to list installed Grafana integrations.
     * @param req DescribeGrafanaIntegrationsRequest
     * @return DescribeGrafanaIntegrationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaIntegrationsResponse DescribeGrafanaIntegrations(DescribeGrafanaIntegrationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGrafanaIntegrationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGrafanaIntegrationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGrafanaIntegrations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to list Grafana notification channels.
     * @param req DescribeGrafanaNotificationChannelsRequest
     * @return DescribeGrafanaNotificationChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaNotificationChannelsResponse DescribeGrafanaNotificationChannels(DescribeGrafanaNotificationChannelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGrafanaNotificationChannelsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGrafanaNotificationChannelsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGrafanaNotificationChannels");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to list the Grafana allowlist.
     * @param req DescribeGrafanaWhiteListRequest
     * @return DescribeGrafanaWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaWhiteListResponse DescribeGrafanaWhiteList(DescribeGrafanaWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGrafanaWhiteListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGrafanaWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGrafanaWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to list the plugins installed in an instance.
     * @param req DescribeInstalledPluginsRequest
     * @return DescribeInstalledPluginsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstalledPluginsResponse DescribeInstalledPlugins(DescribeInstalledPluginsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstalledPluginsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstalledPluginsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstalledPlugins");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to list all the monitor types supported by CM.
     * @param req DescribeMonitorTypesRequest
     * @return DescribeMonitorTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMonitorTypesResponse DescribeMonitorTypes(DescribeMonitorTypesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMonitorTypesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMonitorTypesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMonitorTypes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get basic alarm policy conditions.
     * @param req DescribePolicyConditionListRequest
     * @return DescribePolicyConditionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyConditionListResponse DescribePolicyConditionList(DescribePolicyConditionListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePolicyConditionListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePolicyConditionListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePolicyConditionList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get details of a basic policy group.
     * @param req DescribePolicyGroupInfoRequest
     * @return DescribePolicyGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyGroupInfoResponse DescribePolicyGroupInfo(DescribePolicyGroupInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePolicyGroupInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePolicyGroupInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePolicyGroupInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of basic policy alarm groups.
     * @param req DescribePolicyGroupListRequest
     * @return DescribePolicyGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyGroupListResponse DescribePolicyGroupList(DescribePolicyGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePolicyGroupListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePolicyGroupListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePolicyGroupList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of product events by page.
     * @param req DescribeProductEventListRequest
     * @return DescribeProductEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductEventListResponse DescribeProductEventList(DescribeProductEventListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductEventListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductEventListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProductEventList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to list Prometheus CVM agents.
     * @param req DescribePrometheusAgentsRequest
     * @return DescribePrometheusAgentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAgentsResponse DescribePrometheusAgents(DescribePrometheusAgentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusAgentsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusAgentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusAgents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of one or multiple instances.
<ul>
<li>You can query the details of an instance by its ID, name, or status.</li>
<li>If this parameter is empty, the information of a certain number of instances under the current account will be returned. The number is specified by `Limit` and is 20 by default.</li>
</ul>
     * @param req DescribePrometheusInstancesRequest
     * @return DescribePrometheusInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusInstancesResponse DescribePrometheusInstances(DescribePrometheusInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to list Prometheus scrape tasks.
     * @param req DescribePrometheusScrapeJobsRequest
     * @return DescribePrometheusScrapeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusScrapeJobsResponse DescribePrometheusScrapeJobs(DescribePrometheusScrapeJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusScrapeJobsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusScrapeJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusScrapeJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to list the AZs of Tencent Managed Service for Prometheus (TMP).
     * @param req DescribePrometheusZonesRequest
     * @return DescribePrometheusZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusZonesResponse DescribePrometheusZones(DescribePrometheusZonesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusZonesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusZonesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusZones");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query Prometheus recording rules by filter.
     * @param req DescribeRecordingRulesRequest
     * @return DescribeRecordingRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordingRulesResponse DescribeRecordingRules(DescribeRecordingRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordingRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordingRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordingRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to list all authorized accounts of the current Grafana instance.
     * @param req DescribeSSOAccountRequest
     * @return DescribeSSOAccountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSSOAccountResponse DescribeSSOAccount(DescribeSSOAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSSOAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSSOAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSSOAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to list Prometheus scrape configurations in TKE.
<p>Note: The prerequisite is that the corresponding TKE service has been integrated through the Prometheus console. For more information, see
<a href="https://intl.cloud.tencent.com/document/product/248/48859?from_cn_redirect=1" target="_blank">Agent Management</a>.</p>
     * @param req DescribeServiceDiscoveryRequest
     * @return DescribeServiceDiscoveryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceDiscoveryResponse DescribeServiceDiscovery(DescribeServiceDiscoveryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceDiscoveryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceDiscoveryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServiceDiscovery");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query monitoring data by dimension conditions.
     * @param req DescribeStatisticDataRequest
     * @return DescribeStatisticDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStatisticDataResponse DescribeStatisticData(DescribeStatisticDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStatisticDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStatisticDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStatisticData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete the data of a Prometheus instance. The specified instance must be terminated first.
     * @param req DestroyPrometheusInstanceRequest
     * @return DestroyPrometheusInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyPrometheusInstanceResponse DestroyPrometheusInstance(DestroyPrometheusInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyPrometheusInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyPrometheusInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyPrometheusInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the Grafana public network access.
     * @param req EnableGrafanaInternetRequest
     * @return EnableGrafanaInternetResponse
     * @throws TencentCloudSDKException
     */
    public EnableGrafanaInternetResponse EnableGrafanaInternet(EnableGrafanaInternetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableGrafanaInternetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableGrafanaInternetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableGrafanaInternet");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the Grafana SSO through a Tencent Cloud account.
     * @param req EnableGrafanaSSORequest
     * @return EnableGrafanaSSOResponse
     * @throws TencentCloudSDKException
     */
    public EnableGrafanaSSOResponse EnableGrafanaSSO(EnableGrafanaSSORequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableGrafanaSSOResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableGrafanaSSOResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableGrafanaSSO");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set whether to enable CAM authentication during SSO.
     * @param req EnableSSOCamCheckRequest
     * @return EnableSSOCamCheckResponse
     * @throws TencentCloudSDKException
     */
    public EnableSSOCamCheckResponse EnableSSOCamCheck(EnableSSOCamCheckRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableSSOCamCheckResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableSSOCamCheckResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableSSOCamCheck");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the monitoring data of Tencent Cloud services except TKE. To pull TKE’s monitoring data, use the [DescribeStatisticData](https://www.tencentcloud.com/document/product/248/39481) API.
You can get the monitoring data of a Tencent Cloud service by passing in its namespace, object dimension description, and monitoring metrics.
API call rate limit: 20 calls/second (1,200 calls/minute). A single request can get the data of up to 10 instances for up to 1,440 data points.
If you need to call a large number of APIs to pull metrics or objects at a time, some APIs may fail to be called due to the rate limit. We suggest you evenly arrange API calls at a time granularity.

     * @param req GetMonitorDataRequest
     * @return GetMonitorDataResponse
     * @throws TencentCloudSDKException
     */
    public GetMonitorDataResponse GetMonitorData(GetMonitorDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetMonitorDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetMonitorDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetMonitorData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the command line for Prometheus agent management.
     * @param req GetPrometheusAgentManagementCommandRequest
     * @return GetPrometheusAgentManagementCommandResponse
     * @throws TencentCloudSDKException
     */
    public GetPrometheusAgentManagementCommandResponse GetPrometheusAgentManagementCommand(GetPrometheusAgentManagementCommandRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPrometheusAgentManagementCommandResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetPrometheusAgentManagementCommandResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetPrometheusAgentManagementCommand");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to install a Grafana plugin.
     * @param req InstallPluginsRequest
     * @return InstallPluginsResponse
     * @throws TencentCloudSDKException
     */
    public InstallPluginsResponse InstallPlugins(InstallPluginsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InstallPluginsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InstallPluginsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InstallPlugins");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to edit an alarm notification template.
     * @param req ModifyAlarmNoticeRequest
     * @return ModifyAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmNoticeResponse ModifyAlarmNotice(ModifyAlarmNoticeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmNoticeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmNoticeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAlarmNotice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the trigger condition of an alarm policy.
     * @param req ModifyAlarmPolicyConditionRequest
     * @return ModifyAlarmPolicyConditionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyConditionResponse ModifyAlarmPolicyCondition(ModifyAlarmPolicyConditionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmPolicyConditionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmPolicyConditionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAlarmPolicyCondition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to edit the basic information of a v2.0 alarm policy, including policy name and remarks.
     * @param req ModifyAlarmPolicyInfoRequest
     * @return ModifyAlarmPolicyInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyInfoResponse ModifyAlarmPolicyInfo(ModifyAlarmPolicyInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmPolicyInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmPolicyInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAlarmPolicyInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the alarm notification template bound to an alarm policy.
     * @param req ModifyAlarmPolicyNoticeRequest
     * @return ModifyAlarmPolicyNoticeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyNoticeResponse ModifyAlarmPolicyNotice(ModifyAlarmPolicyNoticeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmPolicyNoticeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmPolicyNoticeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAlarmPolicyNotice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable/disable an alarm policy.
     * @param req ModifyAlarmPolicyStatusRequest
     * @return ModifyAlarmPolicyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyStatusResponse ModifyAlarmPolicyStatus(ModifyAlarmPolicyStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmPolicyStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmPolicyStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAlarmPolicyStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the task triggered by an alarm policy. The `TriggerTasks` field contains the list of triggered tasks. If an empty array is passed in for `TriggerTasks`, it indicates to unbind all the triggered tasks from this policy.
     * @param req ModifyAlarmPolicyTasksRequest
     * @return ModifyAlarmPolicyTasksResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyTasksResponse ModifyAlarmPolicyTasks(ModifyAlarmPolicyTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmPolicyTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmPolicyTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAlarmPolicyTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify alarm recipients.
     * @param req ModifyAlarmReceiversRequest
     * @return ModifyAlarmReceiversResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmReceiversResponse ModifyAlarmReceivers(ModifyAlarmReceiversRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmReceiversResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmReceiversResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAlarmReceivers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the attributes of a Grafana instance.
     * @param req ModifyGrafanaInstanceRequest
     * @return ModifyGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGrafanaInstanceResponse ModifyGrafanaInstance(ModifyGrafanaInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyGrafanaInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyGrafanaInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyGrafanaInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update policy group.
     * @param req ModifyPolicyGroupRequest
     * @return ModifyPolicyGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPolicyGroupResponse ModifyPolicyGroup(ModifyPolicyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPolicyGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPolicyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPolicyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the attributes of a Prometheus instance.
     * @param req ModifyPrometheusInstanceAttributesRequest
     * @return ModifyPrometheusInstanceAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusInstanceAttributesResponse ModifyPrometheusInstanceAttributes(ModifyPrometheusInstanceAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPrometheusInstanceAttributesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPrometheusInstanceAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPrometheusInstanceAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *The default API request rate limit is 50 requests/sec.
The default upper limit on metrics of a single tenant is 100.
A maximum of 30 metric/value pairs can be reported at a time. When an error is returned for a request, no metrics/values in the request will be saved.

The reporting timestamp is the timestamp when you want to save the data. We recommend that you construct a timestamp at integer minutes.
The time range of a timestamp is from 300 seconds before the current time to the current time.
The data of the same IP metric/value pair must be reported by minute in chronological order.
     * @param req PutMonitorDataRequest
     * @return PutMonitorDataResponse
     * @throws TencentCloudSDKException
     */
    public PutMonitorDataResponse PutMonitorData(PutMonitorDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PutMonitorDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PutMonitorDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PutMonitorData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to restore a Grafana instance.
     * @param req ResumeGrafanaInstanceRequest
     * @return ResumeGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ResumeGrafanaInstanceResponse ResumeGrafanaInstance(ResumeGrafanaInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeGrafanaInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeGrafanaInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResumeGrafanaInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to send a custom alarm notification.
     * @param req SendCustomAlarmMsgRequest
     * @return SendCustomAlarmMsgResponse
     * @throws TencentCloudSDKException
     */
    public SendCustomAlarmMsgResponse SendCustomAlarmMsg(SendCustomAlarmMsgRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendCustomAlarmMsgResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SendCustomAlarmMsgResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SendCustomAlarmMsg");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set an alarm policy as the default policy in the current policy type under the current project.
Alarm policies in the same type under the project will be set as non-default.
     * @param req SetDefaultAlarmPolicyRequest
     * @return SetDefaultAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public SetDefaultAlarmPolicyResponse SetDefaultAlarmPolicy(SetDefaultAlarmPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetDefaultAlarmPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetDefaultAlarmPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetDefaultAlarmPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to terminate a pay-as-you-go Prometheus instance.
     * @param req TerminatePrometheusInstancesRequest
     * @return TerminatePrometheusInstancesResponse
     * @throws TencentCloudSDKException
     */
    public TerminatePrometheusInstancesResponse TerminatePrometheusInstances(TerminatePrometheusInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminatePrometheusInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TerminatePrometheusInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TerminatePrometheusInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete all bound objects.
     * @param req UnBindingAllPolicyObjectRequest
     * @return UnBindingAllPolicyObjectResponse
     * @throws TencentCloudSDKException
     */
    public UnBindingAllPolicyObjectResponse UnBindingAllPolicyObject(UnBindingAllPolicyObjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnBindingAllPolicyObjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnBindingAllPolicyObjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnBindingAllPolicyObject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an object that is bound to a policy.
     * @param req UnBindingPolicyObjectRequest
     * @return UnBindingPolicyObjectResponse
     * @throws TencentCloudSDKException
     */
    public UnBindingPolicyObjectResponse UnBindingPolicyObject(UnBindingPolicyObjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnBindingPolicyObjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnBindingPolicyObjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnBindingPolicyObject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unbind a Grafana instance from an instance.
     * @param req UnbindPrometheusManagedGrafanaRequest
     * @return UnbindPrometheusManagedGrafanaResponse
     * @throws TencentCloudSDKException
     */
    public UnbindPrometheusManagedGrafanaResponse UnbindPrometheusManagedGrafana(UnbindPrometheusManagedGrafanaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindPrometheusManagedGrafanaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindPrometheusManagedGrafanaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindPrometheusManagedGrafana");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a Grafana dashboard.
     * @param req UninstallGrafanaDashboardRequest
     * @return UninstallGrafanaDashboardResponse
     * @throws TencentCloudSDKException
     */
    public UninstallGrafanaDashboardResponse UninstallGrafanaDashboard(UninstallGrafanaDashboardRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UninstallGrafanaDashboardResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UninstallGrafanaDashboardResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UninstallGrafanaDashboard");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete installed plugins.
     * @param req UninstallGrafanaPluginsRequest
     * @return UninstallGrafanaPluginsResponse
     * @throws TencentCloudSDKException
     */
    public UninstallGrafanaPluginsResponse UninstallGrafanaPlugins(UninstallGrafanaPluginsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UninstallGrafanaPluginsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UninstallGrafanaPluginsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UninstallGrafanaPlugins");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update a Prometheus alerting rule.

Note that alert object and alert message are special fields of Prometheus Rule Annotations, which need to be passed in through `annotations` and correspond to `summary` and `description` keys respectively. For more information, see [Alerting rules](https://prometheus.io/docs/prometheus/latest/configuration/alerting_rules/).
     * @param req UpdateAlertRuleRequest
     * @return UpdateAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAlertRuleResponse UpdateAlertRule(UpdateAlertRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAlertRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAlertRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateAlertRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the status of a Prometheus alerting rule.
     * @param req UpdateAlertRuleStateRequest
     * @return UpdateAlertRuleStateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAlertRuleStateResponse UpdateAlertRuleState(UpdateAlertRuleStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAlertRuleStateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAlertRuleStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateAlertRuleState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the Grafana DNS configuration.
     * @param req UpdateDNSConfigRequest
     * @return UpdateDNSConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDNSConfigResponse UpdateDNSConfig(UpdateDNSConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDNSConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDNSConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateDNSConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the exporter integration configuration.
     * @param req UpdateExporterIntegrationRequest
     * @return UpdateExporterIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateExporterIntegrationResponse UpdateExporterIntegration(UpdateExporterIntegrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateExporterIntegrationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateExporterIntegrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateExporterIntegration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the Grafana configuration.
     * @param req UpdateGrafanaConfigRequest
     * @return UpdateGrafanaConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGrafanaConfigResponse UpdateGrafanaConfig(UpdateGrafanaConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateGrafanaConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateGrafanaConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateGrafanaConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update Grafana environment variables.
     * @param req UpdateGrafanaEnvironmentsRequest
     * @return UpdateGrafanaEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGrafanaEnvironmentsResponse UpdateGrafanaEnvironments(UpdateGrafanaEnvironmentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateGrafanaEnvironmentsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateGrafanaEnvironmentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateGrafanaEnvironments");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the Grafana integration configuration.
     * @param req UpdateGrafanaIntegrationRequest
     * @return UpdateGrafanaIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGrafanaIntegrationResponse UpdateGrafanaIntegration(UpdateGrafanaIntegrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateGrafanaIntegrationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateGrafanaIntegrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateGrafanaIntegration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the Grafana notification channel.
     * @param req UpdateGrafanaNotificationChannelRequest
     * @return UpdateGrafanaNotificationChannelResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGrafanaNotificationChannelResponse UpdateGrafanaNotificationChannel(UpdateGrafanaNotificationChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateGrafanaNotificationChannelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateGrafanaNotificationChannelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateGrafanaNotificationChannel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the Grafana allowlist.
     * @param req UpdateGrafanaWhiteListRequest
     * @return UpdateGrafanaWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGrafanaWhiteListResponse UpdateGrafanaWhiteList(UpdateGrafanaWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateGrafanaWhiteListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateGrafanaWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateGrafanaWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the status of a Prometheus CVM agent.
     * @param req UpdatePrometheusAgentStatusRequest
     * @return UpdatePrometheusAgentStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePrometheusAgentStatusResponse UpdatePrometheusAgentStatus(UpdatePrometheusAgentStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdatePrometheusAgentStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdatePrometheusAgentStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdatePrometheusAgentStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update a Prometheus scrape task.
     * @param req UpdatePrometheusScrapeJobRequest
     * @return UpdatePrometheusScrapeJobResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePrometheusScrapeJobResponse UpdatePrometheusScrapeJob(UpdatePrometheusScrapeJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdatePrometheusScrapeJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdatePrometheusScrapeJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdatePrometheusScrapeJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update a Prometheus recording rule.
     * @param req UpdateRecordingRuleRequest
     * @return UpdateRecordingRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRecordingRuleResponse UpdateRecordingRule(UpdateRecordingRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateRecordingRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateRecordingRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateRecordingRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the remarks and permission information of an authorized account in an overwriting manner.
     * @param req UpdateSSOAccountRequest
     * @return UpdateSSOAccountResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSSOAccountResponse UpdateSSOAccount(UpdateSSOAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateSSOAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateSSOAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateSSOAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update a Grafana dashboard.
     * @param req UpgradeGrafanaDashboardRequest
     * @return UpgradeGrafanaDashboardResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeGrafanaDashboardResponse UpgradeGrafanaDashboard(UpgradeGrafanaDashboardRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeGrafanaDashboardResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeGrafanaDashboardResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeGrafanaDashboard");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to upgrade a Grafana instance.
     * @param req UpgradeGrafanaInstanceRequest
     * @return UpgradeGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeGrafanaInstanceResponse UpgradeGrafanaInstance(UpgradeGrafanaInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeGrafanaInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeGrafanaInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeGrafanaInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
