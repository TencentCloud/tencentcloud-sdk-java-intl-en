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
    private static String endpoint = "monitor.intl.tencentcloudapi.com";
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
        req.setSkipSign(false);
        return this.internalRequest(req, "BindPrometheusManagedGrafana", BindPrometheusManagedGrafanaResponse.class);
    }

    /**
     *This API is used to bind an alarm policy to a specific object.
     * @param req BindingPolicyObjectRequest
     * @return BindingPolicyObjectResponse
     * @throws TencentCloudSDKException
     */
    public BindingPolicyObjectResponse BindingPolicyObject(BindingPolicyObjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindingPolicyObject", BindingPolicyObjectResponse.class);
    }

    /**
     *This API is used to determine whether the user is new to TMP, that is, whether the user has never created a TMP instance in any region.
     * @param req CheckIsPrometheusNewUserRequest
     * @return CheckIsPrometheusNewUserResponse
     * @throws TencentCloudSDKException
     */
    public CheckIsPrometheusNewUserResponse CheckIsPrometheusNewUser(CheckIsPrometheusNewUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckIsPrometheusNewUser", CheckIsPrometheusNewUserResponse.class);
    }

    /**
     *This API is used to forcibly terminate a Grafana instance.
     * @param req CleanGrafanaInstanceRequest
     * @return CleanGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CleanGrafanaInstanceResponse CleanGrafanaInstance(CleanGrafanaInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CleanGrafanaInstance", CleanGrafanaInstanceResponse.class);
    }

    /**
     *This API is used to create a notification template.
     * @param req CreateAlarmNoticeRequest
     * @return CreateAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmNoticeResponse CreateAlarmNotice(CreateAlarmNoticeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlarmNotice", CreateAlarmNoticeResponse.class);
    }

    /**
     *This API is used to create an alarm policy.
     * @param req CreateAlarmPolicyRequest
     * @return CreateAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmPolicyResponse CreateAlarmPolicy(CreateAlarmPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlarmPolicy", CreateAlarmPolicyResponse.class);
    }

    /**
     *This API is used to create a Prometheus alerting rule.

Note that alert object and alert message are special fields of Prometheus Rule Annotations, which need to be passed in through `annotations` and correspond to `summary` and `description` keys respectively. For more information, see [Alerting rules](https://prometheus.io/docs/prometheus/latest/configuration/alerting_rules/).
     * @param req CreateAlertRuleRequest
     * @return CreateAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlertRuleResponse CreateAlertRule(CreateAlertRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlertRule", CreateAlertRuleResponse.class);
    }

    /**
     *Create an exporter integration in the integration center. Due to the considerable number of integrations, it is advisable to create through the console.  **Prerequisite:** Authorized to create a managed EKS cluster.  **Verification method:** 1. Confirm on the console interface. If no authorization notification appears, it indicates authorization is granted. 2. Query the cluster status via the `DescribePrometheusInstanceInitStatus` API. If the managed cluster does not exist, create it using the `RunPrometheusInstance` API.
     * @param req CreateExporterIntegrationRequest
     * @return CreateExporterIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public CreateExporterIntegrationResponse CreateExporterIntegration(CreateExporterIntegrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateExporterIntegration", CreateExporterIntegrationResponse.class);
    }

    /**
     *This API is used to create a monthly subscribed TCMG instance of the Basic Edition, with auto-renewal enabled and vouchers not allowed by default.
     * @param req CreateGrafanaInstanceRequest
     * @return CreateGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateGrafanaInstanceResponse CreateGrafanaInstance(CreateGrafanaInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGrafanaInstance", CreateGrafanaInstanceResponse.class);
    }

    /**
     *This API is used to create a Grafana integration configuration.
     * @param req CreateGrafanaIntegrationRequest
     * @return CreateGrafanaIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public CreateGrafanaIntegrationResponse CreateGrafanaIntegration(CreateGrafanaIntegrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGrafanaIntegration", CreateGrafanaIntegrationResponse.class);
    }

    /**
     *This API is used to create a Grafana notification channel.
     * @param req CreateGrafanaNotificationChannelRequest
     * @return CreateGrafanaNotificationChannelResponse
     * @throws TencentCloudSDKException
     */
    public CreateGrafanaNotificationChannelResponse CreateGrafanaNotificationChannel(CreateGrafanaNotificationChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGrafanaNotificationChannel", CreateGrafanaNotificationChannelResponse.class);
    }

    /**
     *This API is used to add a policy group.
     * @param req CreatePolicyGroupRequest
     * @return CreatePolicyGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreatePolicyGroupResponse CreatePolicyGroup(CreatePolicyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePolicyGroup", CreatePolicyGroupResponse.class);
    }

    /**
     *This API is used to create a Prometheus CVM agent.
     * @param req CreatePrometheusAgentRequest
     * @return CreatePrometheusAgentResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusAgentResponse CreatePrometheusAgent(CreatePrometheusAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusAgent", CreatePrometheusAgentResponse.class);
    }

    /**
     *This API is used to create a Prometheus alert rule groups.

This API is used to group alert rules, which can include multiple alert rules. Alert messages within the group are sent via the alert group's notification template.
This API is used to enable individually creating enabled/disabled alert rules under an alert group.
     * @param req CreatePrometheusAlertGroupRequest
     * @return CreatePrometheusAlertGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusAlertGroupResponse CreatePrometheusAlertGroup(CreatePrometheusAlertGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusAlertGroup", CreatePrometheusAlertGroupResponse.class);
    }

    /**
     *This API is used to create an alerting rule.
     * @param req CreatePrometheusAlertPolicyRequest
     * @return CreatePrometheusAlertPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusAlertPolicyResponse CreatePrometheusAlertPolicy(CreatePrometheusAlertPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusAlertPolicy", CreatePrometheusAlertPolicyResponse.class);
    }

    /**
     *This API is used to associate a cluster with a Cloud Monitor (CM)-integrated Tencent Managed Service for Prometheus (TMP) 2.0 instance.
     * @param req CreatePrometheusClusterAgentRequest
     * @return CreatePrometheusClusterAgentResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusClusterAgentResponse CreatePrometheusClusterAgent(CreatePrometheusClusterAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusClusterAgent", CreatePrometheusClusterAgentResponse.class);
    }

    /**
     *This API is used to create Prometheus configurations.
     * @param req CreatePrometheusConfigRequest
     * @return CreatePrometheusConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusConfigResponse CreatePrometheusConfig(CreatePrometheusConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusConfig", CreatePrometheusConfigResponse.class);
    }

    /**
     *This API is used to create a global alert notification channel.
     * @param req CreatePrometheusGlobalNotificationRequest
     * @return CreatePrometheusGlobalNotificationResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusGlobalNotificationResponse CreatePrometheusGlobalNotification(CreatePrometheusGlobalNotificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusGlobalNotification", CreatePrometheusGlobalNotificationResponse.class);
    }

    /**
     *This API is used to create a pay-as-you-go Prometheus instance.
     * @param req CreatePrometheusMultiTenantInstancePostPayModeRequest
     * @return CreatePrometheusMultiTenantInstancePostPayModeResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusMultiTenantInstancePostPayModeResponse CreatePrometheusMultiTenantInstancePostPayMode(CreatePrometheusMultiTenantInstancePostPayModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusMultiTenantInstancePostPayMode", CreatePrometheusMultiTenantInstancePostPayModeResponse.class);
    }

    /**
     *This API is used to create a recording rule in the YAML way.
     * @param req CreatePrometheusRecordRuleYamlRequest
     * @return CreatePrometheusRecordRuleYamlResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusRecordRuleYamlResponse CreatePrometheusRecordRuleYaml(CreatePrometheusRecordRuleYamlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusRecordRuleYaml", CreatePrometheusRecordRuleYamlResponse.class);
    }

    /**
     *This API is used to create a Prometheus scrape task.
     * @param req CreatePrometheusScrapeJobRequest
     * @return CreatePrometheusScrapeJobResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusScrapeJobResponse CreatePrometheusScrapeJob(CreatePrometheusScrapeJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusScrapeJob", CreatePrometheusScrapeJobResponse.class);
    }

    /**
     *This API is used to create a TMP template.
     * @param req CreatePrometheusTempRequest
     * @return CreatePrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusTempResponse CreatePrometheusTemp(CreatePrometheusTempRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusTemp", CreatePrometheusTempResponse.class);
    }

    /**
     *This API is used to create a Prometheus recording rule.
     * @param req CreateRecordingRuleRequest
     * @return CreateRecordingRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordingRuleResponse CreateRecordingRule(CreateRecordingRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRecordingRule", CreateRecordingRuleResponse.class);
    }

    /**
     *This API is used to authorize a Grafana instance to another Tencent Cloud user.
     * @param req CreateSSOAccountRequest
     * @return CreateSSOAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateSSOAccountResponse CreateSSOAccount(CreateSSOAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSSOAccount", CreateSSOAccountResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateServiceDiscovery", CreateServiceDiscoveryResponse.class);
    }

    /**
     *This API is used to delete an alarm notification template.
     * @param req DeleteAlarmNoticesRequest
     * @return DeleteAlarmNoticesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmNoticesResponse DeleteAlarmNotices(DeleteAlarmNoticesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAlarmNotices", DeleteAlarmNoticesResponse.class);
    }

    /**
     *This API is used to delete an alarm policy.
     * @param req DeleteAlarmPolicyRequest
     * @return DeleteAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmPolicyResponse DeleteAlarmPolicy(DeleteAlarmPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAlarmPolicy", DeleteAlarmPolicyResponse.class);
    }

    /**
     *This API is used to batch delete Prometheus alerting rules.
     * @param req DeleteAlertRulesRequest
     * @return DeleteAlertRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlertRulesResponse DeleteAlertRules(DeleteAlertRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAlertRules", DeleteAlertRulesResponse.class);
    }

    /**
     *This API is used to delete an exporter integration.
     * @param req DeleteExporterIntegrationRequest
     * @return DeleteExporterIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteExporterIntegrationResponse DeleteExporterIntegration(DeleteExporterIntegrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteExporterIntegration", DeleteExporterIntegrationResponse.class);
    }

    /**
     *This API is used to refund a monthly subscribed TCMG instance. Once it is called, the instance cannot be used and will be automatically terminated seven days later.
     * @param req DeleteGrafanaInstanceRequest
     * @return DeleteGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGrafanaInstanceResponse DeleteGrafanaInstance(DeleteGrafanaInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGrafanaInstance", DeleteGrafanaInstanceResponse.class);
    }

    /**
     *This API is used to delete a Grafana integration configuration.
     * @param req DeleteGrafanaIntegrationRequest
     * @return DeleteGrafanaIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGrafanaIntegrationResponse DeleteGrafanaIntegration(DeleteGrafanaIntegrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGrafanaIntegration", DeleteGrafanaIntegrationResponse.class);
    }

    /**
     *This API is used to delete a Grafana notification channel.
     * @param req DeleteGrafanaNotificationChannelRequest
     * @return DeleteGrafanaNotificationChannelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGrafanaNotificationChannelResponse DeleteGrafanaNotificationChannel(DeleteGrafanaNotificationChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGrafanaNotificationChannel", DeleteGrafanaNotificationChannelResponse.class);
    }

    /**
     *This API is used to delete an alarm policy group.
     * @param req DeletePolicyGroupRequest
     * @return DeletePolicyGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeletePolicyGroupResponse DeletePolicyGroup(DeletePolicyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePolicyGroup", DeletePolicyGroupResponse.class);
    }

    /**
     *This API is used to delete Prometheus alert rule groups.
     * @param req DeletePrometheusAlertGroupsRequest
     * @return DeletePrometheusAlertGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusAlertGroupsResponse DeletePrometheusAlertGroups(DeletePrometheusAlertGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusAlertGroups", DeletePrometheusAlertGroupsResponse.class);
    }

    /**
     *This API is used to delete a TMP 2.0 instance alerting rule.
     * @param req DeletePrometheusAlertPolicyRequest
     * @return DeletePrometheusAlertPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusAlertPolicyResponse DeletePrometheusAlertPolicy(DeletePrometheusAlertPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusAlertPolicy", DeletePrometheusAlertPolicyResponse.class);
    }

    /**
     *This API is used to disassociate a TMP instance from a cluster.
     * @param req DeletePrometheusClusterAgentRequest
     * @return DeletePrometheusClusterAgentResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusClusterAgentResponse DeletePrometheusClusterAgent(DeletePrometheusClusterAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusClusterAgent", DeletePrometheusClusterAgentResponse.class);
    }

    /**
     *This API is used to delete Prometheus configurations. If the target cluster does not exist, a result indicating success will be returned.
     * @param req DeletePrometheusConfigRequest
     * @return DeletePrometheusConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusConfigResponse DeletePrometheusConfig(DeletePrometheusConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusConfig", DeletePrometheusConfigResponse.class);
    }

    /**
     *This API is used to delete a recording instance.
     * @param req DeletePrometheusRecordRuleYamlRequest
     * @return DeletePrometheusRecordRuleYamlResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusRecordRuleYamlResponse DeletePrometheusRecordRuleYaml(DeletePrometheusRecordRuleYamlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusRecordRuleYaml", DeletePrometheusRecordRuleYamlResponse.class);
    }

    /**
     *This API is used to delete a Prometheus scrape task.
     * @param req DeletePrometheusScrapeJobsRequest
     * @return DeletePrometheusScrapeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusScrapeJobsResponse DeletePrometheusScrapeJobs(DeletePrometheusScrapeJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusScrapeJobs", DeletePrometheusScrapeJobsResponse.class);
    }

    /**
     *This API is used to delete a TMP template.
     * @param req DeletePrometheusTempRequest
     * @return DeletePrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusTempResponse DeletePrometheusTemp(DeletePrometheusTempRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusTemp", DeletePrometheusTempResponse.class);
    }

    /**
     *This API is used to unsync a template, which will delete the configuration generated by the template in the target. It takes effect for v2 instances.
     * @param req DeletePrometheusTempSyncRequest
     * @return DeletePrometheusTempSyncResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusTempSyncResponse DeletePrometheusTempSync(DeletePrometheusTempSyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusTempSync", DeletePrometheusTempSyncResponse.class);
    }

    /**
     *This API is used to batch delete Prometheus recording rules.
     * @param req DeleteRecordingRulesRequest
     * @return DeleteRecordingRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordingRulesResponse DeleteRecordingRules(DeleteRecordingRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecordingRules", DeleteRecordingRulesResponse.class);
    }

    /**
     *This API is used to delete an authorized TCMG user.
     * @param req DeleteSSOAccountRequest
     * @return DeleteSSOAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSSOAccountResponse DeleteSSOAccount(DeleteSSOAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSSOAccount", DeleteSSOAccountResponse.class);
    }

    /**
     *This API is used to get the platform event list.
     * @param req DescribeAccidentEventListRequest
     * @return DescribeAccidentEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccidentEventListResponse DescribeAccidentEventList(DescribeAccidentEventListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccidentEventList", DescribeAccidentEventListResponse.class);
    }

    /**
     *This API is used to query the list of alarm events.
     * @param req DescribeAlarmEventsRequest
     * @return DescribeAlarmEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmEventsResponse DescribeAlarmEvents(DescribeAlarmEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmEvents", DescribeAlarmEventsResponse.class);
    }

    /**
     *This API is used to query the alarm records.

Note: **If you use a sub-account, you can only query the alarm records of authorized projects** or uncategorized products.
     * @param req DescribeAlarmHistoriesRequest
     * @return DescribeAlarmHistoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmHistoriesResponse DescribeAlarmHistories(DescribeAlarmHistoriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmHistories", DescribeAlarmHistoriesResponse.class);
    }

    /**
     *This API is used to query the list of alarm metrics.
     * @param req DescribeAlarmMetricsRequest
     * @return DescribeAlarmMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmMetricsResponse DescribeAlarmMetrics(DescribeAlarmMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmMetrics", DescribeAlarmMetricsResponse.class);
    }

    /**
     *This API is used to query the details of a single notification template.
     * @param req DescribeAlarmNoticeRequest
     * @return DescribeAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmNoticeResponse DescribeAlarmNotice(DescribeAlarmNoticeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmNotice", DescribeAlarmNoticeResponse.class);
    }

    /**
     *This API is used to obtain all the callback URLs of an alarm notification template.
     * @param req DescribeAlarmNoticeCallbacksRequest
     * @return DescribeAlarmNoticeCallbacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmNoticeCallbacksResponse DescribeAlarmNoticeCallbacks(DescribeAlarmNoticeCallbacksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmNoticeCallbacks", DescribeAlarmNoticeCallbacksResponse.class);
    }

    /**
     *This API is used to query the list of notification templates.
     * @param req DescribeAlarmNoticesRequest
     * @return DescribeAlarmNoticesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmNoticesResponse DescribeAlarmNotices(DescribeAlarmNoticesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmNotices", DescribeAlarmNoticesResponse.class);
    }

    /**
     *This API is used to query the list of alarm policies.
     * @param req DescribeAlarmPoliciesRequest
     * @return DescribeAlarmPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmPoliciesResponse DescribeAlarmPolicies(DescribeAlarmPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmPolicies", DescribeAlarmPoliciesResponse.class);
    }

    /**
     *This API is used to get the details of a single alarm policy.
     * @param req DescribeAlarmPolicyRequest
     * @return DescribeAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmPolicyResponse DescribeAlarmPolicy(DescribeAlarmPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmPolicy", DescribeAlarmPolicyResponse.class);
    }

    /**
     *This API is used to query a Prometheus alerting rule.
     * @param req DescribeAlertRulesRequest
     * @return DescribeAlertRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlertRulesResponse DescribeAlertRules(DescribeAlertRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlertRules", DescribeAlertRulesResponse.class);
    }

    /**
     *This API is used to query all namespaces.
     * @param req DescribeAllNamespacesRequest
     * @return DescribeAllNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllNamespacesResponse DescribeAllNamespaces(DescribeAllNamespacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllNamespaces", DescribeAllNamespacesResponse.class);
    }

    /**
     *This API is used to get the attributes of basic metrics.
     * @param req DescribeBaseMetricsRequest
     * @return DescribeBaseMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaseMetricsResponse DescribeBaseMetrics(DescribeBaseMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaseMetrics", DescribeBaseMetricsResponse.class);
    }

    /**
     *This API is used to get the basic alarm list.
     * @param req DescribeBasicAlarmListRequest
     * @return DescribeBasicAlarmListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBasicAlarmListResponse DescribeBasicAlarmList(DescribeBasicAlarmListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBasicAlarmList", DescribeBasicAlarmListResponse.class);
    }

    /**
     *This API is used to get the bound object list.
     * @param req DescribeBindingPolicyObjectListRequest
     * @return DescribeBindingPolicyObjectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBindingPolicyObjectListResponse DescribeBindingPolicyObjectList(DescribeBindingPolicyObjectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBindingPolicyObjectList", DescribeBindingPolicyObjectListResponse.class);
    }

    /**
     *This API is used to obtain the binding status between the TencentCloud Managed Service for Prometheus instance and the TKE cluster.
     * @param req DescribeClusterAgentCreatingProgressRequest
     * @return DescribeClusterAgentCreatingProgressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAgentCreatingProgressResponse DescribeClusterAgentCreatingProgress(DescribeClusterAgentCreatingProgressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterAgentCreatingProgress", DescribeClusterAgentCreatingProgressResponse.class);
    }

    /**
     *This API is used to get the trigger condition template.
     * @param req DescribeConditionsTemplateListRequest
     * @return DescribeConditionsTemplateListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConditionsTemplateListResponse DescribeConditionsTemplateList(DescribeConditionsTemplateListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConditionsTemplateList", DescribeConditionsTemplateListResponse.class);
    }

    /**
     *This API is used to list Grafana DNS configurations.
     * @param req DescribeDNSConfigRequest
     * @return DescribeDNSConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDNSConfigResponse DescribeDNSConfig(DescribeDNSConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDNSConfig", DescribeDNSConfigResponse.class);
    }

    /**
     *This API is used to query the list of exporter integrations.
     * @param req DescribeExporterIntegrationsRequest
     * @return DescribeExporterIntegrationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExporterIntegrationsResponse DescribeExporterIntegrations(DescribeExporterIntegrationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExporterIntegrations", DescribeExporterIntegrationsResponse.class);
    }

    /**
     *This API is used to list all Grafana alert channels.
     * @param req DescribeGrafanaChannelsRequest
     * @return DescribeGrafanaChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaChannelsResponse DescribeGrafanaChannels(DescribeGrafanaChannelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGrafanaChannels", DescribeGrafanaChannelsResponse.class);
    }

    /**
     *This API is used to list Grafana settings, i.e., the `grafana.ini` file content.
     * @param req DescribeGrafanaConfigRequest
     * @return DescribeGrafanaConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaConfigResponse DescribeGrafanaConfig(DescribeGrafanaConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGrafanaConfig", DescribeGrafanaConfigResponse.class);
    }

    /**
     *This API is used to list Grafana environment variables.
     * @param req DescribeGrafanaEnvironmentsRequest
     * @return DescribeGrafanaEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaEnvironmentsResponse DescribeGrafanaEnvironments(DescribeGrafanaEnvironmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGrafanaEnvironments", DescribeGrafanaEnvironmentsResponse.class);
    }

    /**
     *This API is used to list all Grafana instances under a user account.
     * @param req DescribeGrafanaInstancesRequest
     * @return DescribeGrafanaInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaInstancesResponse DescribeGrafanaInstances(DescribeGrafanaInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGrafanaInstances", DescribeGrafanaInstancesResponse.class);
    }

    /**
     *This API is used to list installed Grafana integrations.
     * @param req DescribeGrafanaIntegrationsRequest
     * @return DescribeGrafanaIntegrationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaIntegrationsResponse DescribeGrafanaIntegrations(DescribeGrafanaIntegrationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGrafanaIntegrations", DescribeGrafanaIntegrationsResponse.class);
    }

    /**
     *This API is used to list Grafana notification channels.
     * @param req DescribeGrafanaNotificationChannelsRequest
     * @return DescribeGrafanaNotificationChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaNotificationChannelsResponse DescribeGrafanaNotificationChannels(DescribeGrafanaNotificationChannelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGrafanaNotificationChannels", DescribeGrafanaNotificationChannelsResponse.class);
    }

    /**
     *This API is used to list the Grafana allowlist.
     * @param req DescribeGrafanaWhiteListRequest
     * @return DescribeGrafanaWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaWhiteListResponse DescribeGrafanaWhiteList(DescribeGrafanaWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGrafanaWhiteList", DescribeGrafanaWhiteListResponse.class);
    }

    /**
     *This API is used to list the plugins installed in an instance.
     * @param req DescribeInstalledPluginsRequest
     * @return DescribeInstalledPluginsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstalledPluginsResponse DescribeInstalledPlugins(DescribeInstalledPluginsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstalledPlugins", DescribeInstalledPluginsResponse.class);
    }

    /**
     *This API is used to list all the monitoring types supported by CM.
     * @param req DescribeMonitorTypesRequest
     * @return DescribeMonitorTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMonitorTypesResponse DescribeMonitorTypes(DescribeMonitorTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMonitorTypes", DescribeMonitorTypesResponse.class);
    }

    /**
     *This API is used to get basic alarm policy conditions.
     * @param req DescribePolicyConditionListRequest
     * @return DescribePolicyConditionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyConditionListResponse DescribePolicyConditionList(DescribePolicyConditionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePolicyConditionList", DescribePolicyConditionListResponse.class);
    }

    /**
     *This API is used to get details of a basic policy group.
     * @param req DescribePolicyGroupInfoRequest
     * @return DescribePolicyGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyGroupInfoResponse DescribePolicyGroupInfo(DescribePolicyGroupInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePolicyGroupInfo", DescribePolicyGroupInfoResponse.class);
    }

    /**
     *This API is used to get the list of basic policy alarm groups.
     * @param req DescribePolicyGroupListRequest
     * @return DescribePolicyGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyGroupListResponse DescribePolicyGroupList(DescribePolicyGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePolicyGroupList", DescribePolicyGroupListResponse.class);
    }

    /**
     *This API is used to get the list of product events by page.
     * @param req DescribeProductEventListRequest
     * @return DescribeProductEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductEventListResponse DescribeProductEventList(DescribeProductEventListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductEventList", DescribeProductEventListResponse.class);
    }

    /**
     *This API is used to get the list of instances associated with the target cluster.
     * @param req DescribePrometheusAgentInstancesRequest
     * @return DescribePrometheusAgentInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAgentInstancesResponse DescribePrometheusAgentInstances(DescribePrometheusAgentInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusAgentInstances", DescribePrometheusAgentInstancesResponse.class);
    }

    /**
     *This API is used to list Prometheus CVM agents.
     * @param req DescribePrometheusAgentsRequest
     * @return DescribePrometheusAgentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAgentsResponse DescribePrometheusAgents(DescribePrometheusAgentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusAgents", DescribePrometheusAgentsResponse.class);
    }

    /**
     *This API is used to query alarm groups under a given prometheus.
     * @param req DescribePrometheusAlertGroupsRequest
     * @return DescribePrometheusAlertGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAlertGroupsResponse DescribePrometheusAlertGroups(DescribePrometheusAlertGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusAlertGroups", DescribePrometheusAlertGroupsResponse.class);
    }

    /**
     *This API is used to get the list of v2.0 instance alerting rules.
     * @param req DescribePrometheusAlertPolicyRequest
     * @return DescribePrometheusAlertPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAlertPolicyResponse DescribePrometheusAlertPolicy(DescribePrometheusAlertPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusAlertPolicy", DescribePrometheusAlertPolicyResponse.class);
    }

    /**
     *This API is used to get the list of clusters associated with the TMP instance.
     * @param req DescribePrometheusClusterAgentsRequest
     * @return DescribePrometheusClusterAgentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusClusterAgentsResponse DescribePrometheusClusterAgents(DescribePrometheusClusterAgentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusClusterAgents", DescribePrometheusClusterAgentsResponse.class);
    }

    /**
     *This API is used to get the Prometheus configuration.
     * @param req DescribePrometheusConfigRequest
     * @return DescribePrometheusConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusConfigResponse DescribePrometheusConfig(DescribePrometheusConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusConfig", DescribePrometheusConfigResponse.class);
    }

    /**
     *This API is used to get the instance-level scrape configurations.
     * @param req DescribePrometheusGlobalConfigRequest
     * @return DescribePrometheusGlobalConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusGlobalConfigResponse DescribePrometheusGlobalConfig(DescribePrometheusGlobalConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusGlobalConfig", DescribePrometheusGlobalConfigResponse.class);
    }

    /**
     *This API is used to query the global alert notification channel.
     * @param req DescribePrometheusGlobalNotificationRequest
     * @return DescribePrometheusGlobalNotificationResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusGlobalNotificationResponse DescribePrometheusGlobalNotification(DescribePrometheusGlobalNotificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusGlobalNotification", DescribePrometheusGlobalNotificationResponse.class);
    }

    /**
     *This API is used to get the details of a TMP instance.
     * @param req DescribePrometheusInstanceDetailRequest
     * @return DescribePrometheusInstanceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusInstanceDetailResponse DescribePrometheusInstanceDetail(DescribePrometheusInstanceDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusInstanceDetail", DescribePrometheusInstanceDetailResponse.class);
    }

    /**
     *This API is used to get the initialization task status of a v2.0 instance.
     * @param req DescribePrometheusInstanceInitStatusRequest
     * @return DescribePrometheusInstanceInitStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusInstanceInitStatusResponse DescribePrometheusInstanceInitStatus(DescribePrometheusInstanceInitStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusInstanceInitStatus", DescribePrometheusInstanceInitStatusResponse.class);
    }

    /**
     * This API is used to query the usage of a pay-as-you-go Tencent Managed Service for Prometheus (TMP) instance.
     * @param req DescribePrometheusInstanceUsageRequest
     * @return DescribePrometheusInstanceUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusInstanceUsageResponse DescribePrometheusInstanceUsage(DescribePrometheusInstanceUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusInstanceUsage", DescribePrometheusInstanceUsageResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusInstances", DescribePrometheusInstancesResponse.class);
    }

    /**
     *This API is used to obtain the list of Tencent Managed Service for Prometheus (TMP) instances and the clusters associated with them.
     * @param req DescribePrometheusInstancesOverviewRequest
     * @return DescribePrometheusInstancesOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusInstancesOverviewResponse DescribePrometheusInstancesOverview(DescribePrometheusInstancesOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusInstancesOverview", DescribePrometheusInstancesOverviewResponse.class);
    }

    /**
     *This API is used to get the YAML list of Prometheus recording rules.
     * @param req DescribePrometheusRecordRuleYamlRequest
     * @return DescribePrometheusRecordRuleYamlResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusRecordRuleYamlResponse DescribePrometheusRecordRuleYaml(DescribePrometheusRecordRuleYamlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusRecordRuleYaml", DescribePrometheusRecordRuleYamlResponse.class);
    }

    /**
     *This API is used to get the list of recording rules, including those created by CRD resources in the associated cluster.
     * @param req DescribePrometheusRecordRulesRequest
     * @return DescribePrometheusRecordRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusRecordRulesResponse DescribePrometheusRecordRules(DescribePrometheusRecordRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusRecordRules", DescribePrometheusRecordRulesResponse.class);
    }

    /**
     *This API is used to list Prometheus scrape tasks.
     * @param req DescribePrometheusScrapeJobsRequest
     * @return DescribePrometheusScrapeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusScrapeJobsResponse DescribePrometheusScrapeJobs(DescribePrometheusScrapeJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusScrapeJobs", DescribePrometheusScrapeJobsResponse.class);
    }

    /**
     *This API is used to get the targets information.
     * @param req DescribePrometheusTargetsTMPRequest
     * @return DescribePrometheusTargetsTMPResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusTargetsTMPResponse DescribePrometheusTargetsTMP(DescribePrometheusTargetsTMPRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusTargetsTMP", DescribePrometheusTargetsTMPResponse.class);
    }

    /**
     *This API is used to get the list of templates, where the default template is always on top.
     * @param req DescribePrometheusTempRequest
     * @return DescribePrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusTempResponse DescribePrometheusTemp(DescribePrometheusTempRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusTemp", DescribePrometheusTempResponse.class);
    }

    /**
     *This API is used to get the information of instances associated with a template. It takes effect for v2 instances.
     * @param req DescribePrometheusTempSyncRequest
     * @return DescribePrometheusTempSyncResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusTempSyncResponse DescribePrometheusTempSync(DescribePrometheusTempSyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusTempSync", DescribePrometheusTempSyncResponse.class);
    }

    /**
     *This API is used to list the AZs of Tencent Managed Service for Prometheus (TMP).
     * @param req DescribePrometheusZonesRequest
     * @return DescribePrometheusZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusZonesResponse DescribePrometheusZones(DescribePrometheusZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusZones", DescribePrometheusZonesResponse.class);
    }

    /**
     *This API is used to query Prometheus recording rules by filter.
     * @param req DescribeRecordingRulesRequest
     * @return DescribeRecordingRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordingRulesResponse DescribeRecordingRules(DescribeRecordingRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordingRules", DescribeRecordingRulesResponse.class);
    }

    /**
     *This API is used to list all authorized accounts of the current Grafana instance.
     * @param req DescribeSSOAccountRequest
     * @return DescribeSSOAccountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSSOAccountResponse DescribeSSOAccount(DescribeSSOAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSSOAccount", DescribeSSOAccountResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceDiscovery", DescribeServiceDiscoveryResponse.class);
    }

    /**
     *This API is used to query monitoring data by dimension conditions.
     * @param req DescribeStatisticDataRequest
     * @return DescribeStatisticDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStatisticDataResponse DescribeStatisticData(DescribeStatisticDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStatisticData", DescribeStatisticDataResponse.class);
    }

    /**
     *This API is used to delete the data of a Prometheus instance. The specified instance must be terminated first.
     * @param req DestroyPrometheusInstanceRequest
     * @return DestroyPrometheusInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyPrometheusInstanceResponse DestroyPrometheusInstance(DestroyPrometheusInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyPrometheusInstance", DestroyPrometheusInstanceResponse.class);
    }

    /**
     *This API is used to set the Grafana public network access.
     * @param req EnableGrafanaInternetRequest
     * @return EnableGrafanaInternetResponse
     * @throws TencentCloudSDKException
     */
    public EnableGrafanaInternetResponse EnableGrafanaInternet(EnableGrafanaInternetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableGrafanaInternet", EnableGrafanaInternetResponse.class);
    }

    /**
     *This API is used to set the Grafana SSO through a Tencent Cloud account.
     * @param req EnableGrafanaSSORequest
     * @return EnableGrafanaSSOResponse
     * @throws TencentCloudSDKException
     */
    public EnableGrafanaSSOResponse EnableGrafanaSSO(EnableGrafanaSSORequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableGrafanaSSO", EnableGrafanaSSOResponse.class);
    }

    /**
     *This API is used to set whether to enable CAM authentication during SSO.
     * @param req EnableSSOCamCheckRequest
     * @return EnableSSOCamCheckResponse
     * @throws TencentCloudSDKException
     */
    public EnableSSOCamCheckResponse EnableSSOCamCheck(EnableSSOCamCheckRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableSSOCamCheck", EnableSSOCamCheckResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "GetMonitorData", GetMonitorDataResponse.class);
    }

    /**
     *This API is used to get the command line for Prometheus agent management.
     * @param req GetPrometheusAgentManagementCommandRequest
     * @return GetPrometheusAgentManagementCommandResponse
     * @throws TencentCloudSDKException
     */
    public GetPrometheusAgentManagementCommandResponse GetPrometheusAgentManagementCommand(GetPrometheusAgentManagementCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetPrometheusAgentManagementCommand", GetPrometheusAgentManagementCommandResponse.class);
    }

    /**
     *This API is used to install a Grafana plugin.
     * @param req InstallPluginsRequest
     * @return InstallPluginsResponse
     * @throws TencentCloudSDKException
     */
    public InstallPluginsResponse InstallPlugins(InstallPluginsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InstallPlugins", InstallPluginsResponse.class);
    }

    /**
     *This API is used to edit an alarm notification template.
     * @param req ModifyAlarmNoticeRequest
     * @return ModifyAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmNoticeResponse ModifyAlarmNotice(ModifyAlarmNoticeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmNotice", ModifyAlarmNoticeResponse.class);
    }

    /**
     *This API is used to modify the trigger condition of an alarm policy.
     * @param req ModifyAlarmPolicyConditionRequest
     * @return ModifyAlarmPolicyConditionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyConditionResponse ModifyAlarmPolicyCondition(ModifyAlarmPolicyConditionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmPolicyCondition", ModifyAlarmPolicyConditionResponse.class);
    }

    /**
     *This API is used to edit the basic information of a v2.0 alarm policy, including policy name and remarks.
     * @param req ModifyAlarmPolicyInfoRequest
     * @return ModifyAlarmPolicyInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyInfoResponse ModifyAlarmPolicyInfo(ModifyAlarmPolicyInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmPolicyInfo", ModifyAlarmPolicyInfoResponse.class);
    }

    /**
     *This API is used to modify the alarm notification template bound to an alarm policy.
     * @param req ModifyAlarmPolicyNoticeRequest
     * @return ModifyAlarmPolicyNoticeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyNoticeResponse ModifyAlarmPolicyNotice(ModifyAlarmPolicyNoticeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmPolicyNotice", ModifyAlarmPolicyNoticeResponse.class);
    }

    /**
     *This API is used to enable/disable an alarm policy.
     * @param req ModifyAlarmPolicyStatusRequest
     * @return ModifyAlarmPolicyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyStatusResponse ModifyAlarmPolicyStatus(ModifyAlarmPolicyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmPolicyStatus", ModifyAlarmPolicyStatusResponse.class);
    }

    /**
     *This API is used to modify the tasks triggered by alarm policy, which are listed by the value of the `TriggerTasks` field. If an empty array is passed in for `TriggerTasks`, it means unbinding all the trigger tasks from the policy.
     * @param req ModifyAlarmPolicyTasksRequest
     * @return ModifyAlarmPolicyTasksResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyTasksResponse ModifyAlarmPolicyTasks(ModifyAlarmPolicyTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmPolicyTasks", ModifyAlarmPolicyTasksResponse.class);
    }

    /**
     *This API is used to modify alarm recipients.
     * @param req ModifyAlarmReceiversRequest
     * @return ModifyAlarmReceiversResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmReceiversResponse ModifyAlarmReceivers(ModifyAlarmReceiversRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmReceivers", ModifyAlarmReceiversResponse.class);
    }

    /**
     *This API is used to modify the attributes of a Grafana instance.
     * @param req ModifyGrafanaInstanceRequest
     * @return ModifyGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGrafanaInstanceResponse ModifyGrafanaInstance(ModifyGrafanaInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGrafanaInstance", ModifyGrafanaInstanceResponse.class);
    }

    /**
     *This API is used to update policy group.
     * @param req ModifyPolicyGroupRequest
     * @return ModifyPolicyGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPolicyGroupResponse ModifyPolicyGroup(ModifyPolicyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPolicyGroup", ModifyPolicyGroupResponse.class);
    }

    /**
     *This API is used to modify the external labels of the associated cluster.
     * @param req ModifyPrometheusAgentExternalLabelsRequest
     * @return ModifyPrometheusAgentExternalLabelsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusAgentExternalLabelsResponse ModifyPrometheusAgentExternalLabels(ModifyPrometheusAgentExternalLabelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusAgentExternalLabels", ModifyPrometheusAgentExternalLabelsResponse.class);
    }

    /**
     *This API is used to modify a TMP 2.0 instance alerting rule.
     * @param req ModifyPrometheusAlertPolicyRequest
     * @return ModifyPrometheusAlertPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusAlertPolicyResponse ModifyPrometheusAlertPolicy(ModifyPrometheusAlertPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusAlertPolicy", ModifyPrometheusAlertPolicyResponse.class);
    }

    /**
     *This API is used to modify the Prometheus configuration. If there are no configuration items, one will be added.
     * @param req ModifyPrometheusConfigRequest
     * @return ModifyPrometheusConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusConfigResponse ModifyPrometheusConfig(ModifyPrometheusConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusConfig", ModifyPrometheusConfigResponse.class);
    }

    /**
     *This API is used to modify the global alert notification channel.
     * @param req ModifyPrometheusGlobalNotificationRequest
     * @return ModifyPrometheusGlobalNotificationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusGlobalNotificationResponse ModifyPrometheusGlobalNotification(ModifyPrometheusGlobalNotificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusGlobalNotification", ModifyPrometheusGlobalNotificationResponse.class);
    }

    /**
     *This API is used to modify the attributes of a Prometheus instance.
     * @param req ModifyPrometheusInstanceAttributesRequest
     * @return ModifyPrometheusInstanceAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusInstanceAttributesResponse ModifyPrometheusInstanceAttributes(ModifyPrometheusInstanceAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusInstanceAttributes", ModifyPrometheusInstanceAttributesResponse.class);
    }

    /**
     *This API is used to modify a Prometheus recording instance through YAML.
     * @param req ModifyPrometheusRecordRuleYamlRequest
     * @return ModifyPrometheusRecordRuleYamlResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusRecordRuleYamlResponse ModifyPrometheusRecordRuleYaml(ModifyPrometheusRecordRuleYamlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusRecordRuleYaml", ModifyPrometheusRecordRuleYamlResponse.class);
    }

    /**
     *This API is used to modify a template.
     * @param req ModifyPrometheusTempRequest
     * @return ModifyPrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusTempResponse ModifyPrometheusTemp(ModifyPrometheusTempRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusTemp", ModifyPrometheusTempResponse.class);
    }

    /**
     *This API is used to renew a monthly subscribed TCMG instance for a month without changing the instance edition. It doesn't apply to running instances.
     * @param req ResumeGrafanaInstanceRequest
     * @return ResumeGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ResumeGrafanaInstanceResponse ResumeGrafanaInstance(ResumeGrafanaInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeGrafanaInstance", ResumeGrafanaInstanceResponse.class);
    }

    /**
     *This API is used to initialize a TMP instance, which is called when the integration center is enabled.
     * @param req RunPrometheusInstanceRequest
     * @return RunPrometheusInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RunPrometheusInstanceResponse RunPrometheusInstance(RunPrometheusInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunPrometheusInstance", RunPrometheusInstanceResponse.class);
    }

    /**
     *This API is used to send a custom alarm notification.
     * @param req SendCustomAlarmMsgRequest
     * @return SendCustomAlarmMsgResponse
     * @throws TencentCloudSDKException
     */
    public SendCustomAlarmMsgResponse SendCustomAlarmMsg(SendCustomAlarmMsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendCustomAlarmMsg", SendCustomAlarmMsgResponse.class);
    }

    /**
     *This API is used to set an alarm policy as the default policy in the current policy type under the current project.
Alarm policies in the same type under the project will be set as non-default.
     * @param req SetDefaultAlarmPolicyRequest
     * @return SetDefaultAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public SetDefaultAlarmPolicyResponse SetDefaultAlarmPolicy(SetDefaultAlarmPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetDefaultAlarmPolicy", SetDefaultAlarmPolicyResponse.class);
    }

    /**
     *This API is used to sync a template to an instance or cluster. It takes effect for v2 instances.
     * @param req SyncPrometheusTempRequest
     * @return SyncPrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public SyncPrometheusTempResponse SyncPrometheusTemp(SyncPrometheusTempRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncPrometheusTemp", SyncPrometheusTempResponse.class);
    }

    /**
     *This API is used to terminate a pay-as-you-go Prometheus instance.
     * @param req TerminatePrometheusInstancesRequest
     * @return TerminatePrometheusInstancesResponse
     * @throws TencentCloudSDKException
     */
    public TerminatePrometheusInstancesResponse TerminatePrometheusInstances(TerminatePrometheusInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminatePrometheusInstances", TerminatePrometheusInstancesResponse.class);
    }

    /**
     *This API is used to delete all bound objects.
     * @param req UnBindingAllPolicyObjectRequest
     * @return UnBindingAllPolicyObjectResponse
     * @throws TencentCloudSDKException
     */
    public UnBindingAllPolicyObjectResponse UnBindingAllPolicyObject(UnBindingAllPolicyObjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnBindingAllPolicyObject", UnBindingAllPolicyObjectResponse.class);
    }

    /**
     *This API is used to delete an object that is bound to a policy.
     * @param req UnBindingPolicyObjectRequest
     * @return UnBindingPolicyObjectResponse
     * @throws TencentCloudSDKException
     */
    public UnBindingPolicyObjectResponse UnBindingPolicyObject(UnBindingPolicyObjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnBindingPolicyObject", UnBindingPolicyObjectResponse.class);
    }

    /**
     *This API is used to unbind a Grafana instance from an instance.
     * @param req UnbindPrometheusManagedGrafanaRequest
     * @return UnbindPrometheusManagedGrafanaResponse
     * @throws TencentCloudSDKException
     */
    public UnbindPrometheusManagedGrafanaResponse UnbindPrometheusManagedGrafana(UnbindPrometheusManagedGrafanaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindPrometheusManagedGrafana", UnbindPrometheusManagedGrafanaResponse.class);
    }

    /**
     *This API is used to delete a Grafana dashboard.
     * @param req UninstallGrafanaDashboardRequest
     * @return UninstallGrafanaDashboardResponse
     * @throws TencentCloudSDKException
     */
    public UninstallGrafanaDashboardResponse UninstallGrafanaDashboard(UninstallGrafanaDashboardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UninstallGrafanaDashboard", UninstallGrafanaDashboardResponse.class);
    }

    /**
     *This API is used to delete installed plugins.
     * @param req UninstallGrafanaPluginsRequest
     * @return UninstallGrafanaPluginsResponse
     * @throws TencentCloudSDKException
     */
    public UninstallGrafanaPluginsResponse UninstallGrafanaPlugins(UninstallGrafanaPluginsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UninstallGrafanaPlugins", UninstallGrafanaPluginsResponse.class);
    }

    /**
     *This API is used to update a Prometheus alerting rule.

Note that alert object and alert message are special fields of Prometheus Rule Annotations, which need to be passed in through `annotations` and correspond to `summary` and `description` keys respectively. For more information, see [Alerting rules](https://prometheus.io/docs/prometheus/latest/configuration/alerting_rules/).
     * @param req UpdateAlertRuleRequest
     * @return UpdateAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAlertRuleResponse UpdateAlertRule(UpdateAlertRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAlertRule", UpdateAlertRuleResponse.class);
    }

    /**
     *This API is used to update the status of a Prometheus alerting rule.
     * @param req UpdateAlertRuleStateRequest
     * @return UpdateAlertRuleStateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAlertRuleStateResponse UpdateAlertRuleState(UpdateAlertRuleStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAlertRuleState", UpdateAlertRuleStateResponse.class);
    }

    /**
     *This API is used to update the Grafana DNS configuration.
     * @param req UpdateDNSConfigRequest
     * @return UpdateDNSConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDNSConfigResponse UpdateDNSConfig(UpdateDNSConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDNSConfig", UpdateDNSConfigResponse.class);
    }

    /**
     *This API is used to update the exporter integration configuration.
     * @param req UpdateExporterIntegrationRequest
     * @return UpdateExporterIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateExporterIntegrationResponse UpdateExporterIntegration(UpdateExporterIntegrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateExporterIntegration", UpdateExporterIntegrationResponse.class);
    }

    /**
     *This API is used to update the Grafana configuration.
     * @param req UpdateGrafanaConfigRequest
     * @return UpdateGrafanaConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGrafanaConfigResponse UpdateGrafanaConfig(UpdateGrafanaConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateGrafanaConfig", UpdateGrafanaConfigResponse.class);
    }

    /**
     *This API is used to update Grafana environment variables.
     * @param req UpdateGrafanaEnvironmentsRequest
     * @return UpdateGrafanaEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGrafanaEnvironmentsResponse UpdateGrafanaEnvironments(UpdateGrafanaEnvironmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateGrafanaEnvironments", UpdateGrafanaEnvironmentsResponse.class);
    }

    /**
     *This API is used to update the Grafana integration configuration.
     * @param req UpdateGrafanaIntegrationRequest
     * @return UpdateGrafanaIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGrafanaIntegrationResponse UpdateGrafanaIntegration(UpdateGrafanaIntegrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateGrafanaIntegration", UpdateGrafanaIntegrationResponse.class);
    }

    /**
     *This API is used to update the Grafana notification channel.
     * @param req UpdateGrafanaNotificationChannelRequest
     * @return UpdateGrafanaNotificationChannelResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGrafanaNotificationChannelResponse UpdateGrafanaNotificationChannel(UpdateGrafanaNotificationChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateGrafanaNotificationChannel", UpdateGrafanaNotificationChannelResponse.class);
    }

    /**
     *This API is used to update the Grafana allowlist.
     * @param req UpdateGrafanaWhiteListRequest
     * @return UpdateGrafanaWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGrafanaWhiteListResponse UpdateGrafanaWhiteList(UpdateGrafanaWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateGrafanaWhiteList", UpdateGrafanaWhiteListResponse.class);
    }

    /**
     *This API is used to update the status of a Prometheus CVM agent.
     * @param req UpdatePrometheusAgentStatusRequest
     * @return UpdatePrometheusAgentStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePrometheusAgentStatusResponse UpdatePrometheusAgentStatus(UpdatePrometheusAgentStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdatePrometheusAgentStatus", UpdatePrometheusAgentStatusResponse.class);
    }

    /**
     *This API is used to update Prometheus alert rule groups.
     * @param req UpdatePrometheusAlertGroupRequest
     * @return UpdatePrometheusAlertGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePrometheusAlertGroupResponse UpdatePrometheusAlertGroup(UpdatePrometheusAlertGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdatePrometheusAlertGroup", UpdatePrometheusAlertGroupResponse.class);
    }

    /**
     *This API is used to batch update the status of alarm groups and set all rules grouped in them to the target status.
     * @param req UpdatePrometheusAlertGroupStateRequest
     * @return UpdatePrometheusAlertGroupStateResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePrometheusAlertGroupStateResponse UpdatePrometheusAlertGroupState(UpdatePrometheusAlertGroupStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdatePrometheusAlertGroupState", UpdatePrometheusAlertGroupStateResponse.class);
    }

    /**
     *This API is used to update a Prometheus scrape task.
     * @param req UpdatePrometheusScrapeJobRequest
     * @return UpdatePrometheusScrapeJobResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePrometheusScrapeJobResponse UpdatePrometheusScrapeJob(UpdatePrometheusScrapeJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdatePrometheusScrapeJob", UpdatePrometheusScrapeJobResponse.class);
    }

    /**
     *This API is used to update a Prometheus recording rule.
     * @param req UpdateRecordingRuleRequest
     * @return UpdateRecordingRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRecordingRuleResponse UpdateRecordingRule(UpdateRecordingRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRecordingRule", UpdateRecordingRuleResponse.class);
    }

    /**
     *This API is used to update the remarks and permission information of an authorized account in an overwriting manner.
     * @param req UpdateSSOAccountRequest
     * @return UpdateSSOAccountResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSSOAccountResponse UpdateSSOAccount(UpdateSSOAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateSSOAccount", UpdateSSOAccountResponse.class);
    }

    /**
     *This API is used to update a Grafana dashboard.
     * @param req UpgradeGrafanaDashboardRequest
     * @return UpgradeGrafanaDashboardResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeGrafanaDashboardResponse UpgradeGrafanaDashboard(UpgradeGrafanaDashboardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeGrafanaDashboard", UpgradeGrafanaDashboardResponse.class);
    }

    /**
     *This API is used to upgrade a Grafana instance.
     * @param req UpgradeGrafanaInstanceRequest
     * @return UpgradeGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeGrafanaInstanceResponse UpgradeGrafanaInstance(UpgradeGrafanaInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeGrafanaInstance", UpgradeGrafanaInstanceResponse.class);
    }

}
