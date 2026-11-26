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
package com.tencentcloudapi.teo.v20220901;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.teo.v20220901.models.*;

public class TeoClient extends AbstractClient{
    private static String endpoint = "teo.intl.tencentcloudapi.com";
    private static String service = "teo";
    private static String version = "2022-09-01";

    public TeoClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TeoClient(Credential credential, String region, ClientProfile profile) {
        super(TeoClient.endpoint, TeoClient.version, credential, region, profile);
    }

    /**
     *When applying for a free certificate, if you need to apply through DNS delegation verification or file verification, you can call this API to initiate the certificate application and get the corresponding verification content based on the application method. The order in which to call the API is as follows:
Step 1: Call ApplyFreeCertificate to specify the verification method for the free certificate application and obtain the verification content.
Step 2: Configure the content for the corresponding domain as required for verification.
Step 3: Call CheckFreeCertificateVerification for verification. The free certificate application is completed after verification passes.
Step 4: Call ModifyHostsCertificate to configure the domain name certificate with an EdgeOne free certificate.

For the introduction to application methods, see the referenced document: Free Certificate Application Description (https://www.tencentcloud.com/document/product/1552/90437?from_cn_redirect=1) 
Description:
-Only the CNAME access mode can call this API to specify the free certificate application method. The NS/DNSPod hosting access mode uses automatic validation to apply for a free certificate, with no need to call this API.
-If you need to switch the verification method for a free certificate, you can call this API again to update it by changing the VerificationMethod field.
-A domain name can only apply for one free certificate. After calling this API, the backend will trigger the free certificate application task. You need to complete the domain name verification info configuration within 2 days, and then complete certificate authentication.
     * @param req ApplyFreeCertificateRequest
     * @return ApplyFreeCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ApplyFreeCertificateResponse ApplyFreeCertificate(ApplyFreeCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyFreeCertificate", ApplyFreeCertificateResponse.class);
    }

    /**
     *Operate a security policy template. This API is used to bind or rebind a domain name to a designated policy template, or unbind it from a designated policy template.
     * @param req BindSecurityTemplateToEntityRequest
     * @return BindSecurityTemplateToEntityResponse
     * @throws TencentCloudSDKException
     */
    public BindSecurityTemplateToEntityResponse BindSecurityTemplateToEntity(BindSecurityTemplateToEntityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindSecurityTemplateToEntity", BindSecurityTemplateToEntityResponse.class);
    }

    /**
     *Used to bind or unbind a shared CNAME for an acceleration domain name. This feature is in beta test.
     * @param req BindSharedCNAMERequest
     * @return BindSharedCNAMEResponse
     * @throws TencentCloudSDKException
     */
    public BindSharedCNAMEResponse BindSharedCNAME(BindSharedCNAMERequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindSharedCNAME", BindSharedCNAMEResponse.class);
    }

    /**
     *Bind the selected site not bound to a package to an existing package.
     * @param req BindZoneToPlanRequest
     * @return BindZoneToPlanResponse
     * @throws TencentCloudSDKException
     */
    public BindZoneToPlanResponse BindZoneToPlan(BindZoneToPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindZoneToPlan", BindZoneToPlanResponse.class);
    }

    /**
     *When the site access type is CNAME, all domain names under the site must complete CNAME record configuration as specified by the CNAME domain assigned by EdgeOne.
This API is used to obtain the CNAME domain name assigned by EdgeOne for the integrated domain name, and to validate the CNAME configuration status of the integrated domain name.
     * @param req CheckCnameStatusRequest
     * @return CheckCnameStatusResponse
     * @throws TencentCloudSDKException
     */
    public CheckCnameStatusResponse CheckCnameStatus(CheckCnameStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckCnameStatus", CheckCnameStatusResponse.class);
    }

    /**
     *This API is used to verify a free certificate and obtain the application result. If verification is passed, you can query the free certificate information for the corresponding domain through this API. If the application failed, this API will return the corresponding failure description.
After triggering the free certificate application API (https://www.tencentcloud.com/document/product/1552/90437?from_cn_redirect=1), you can check the free certificate application result through this API. Once the free certificate application is successful, you need to configure it through the domain certificate configuration API (https://www.tencentcloud.com/document/product/1552/80764?from_cn_redirect=1) to deploy the free certificate to the acceleration domain.
     * @param req CheckFreeCertificateVerificationRequest
     * @return CheckFreeCertificateVerificationResponse
     * @throws TencentCloudSDKException
     */
    public CheckFreeCertificateVerificationResponse CheckFreeCertificateVerification(CheckFreeCertificateVerificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckFreeCertificateVerification", CheckFreeCertificateVerificationResponse.class);
    }

    /**
     *This API is used to confirm that the latest origin-pull IP ranges have been updated to the origin server firewall when the origin-pull IP ranges of the multi-channel security acceleration gateway change.
     * @param req ConfirmMultiPathGatewayOriginACLRequest
     * @return ConfirmMultiPathGatewayOriginACLResponse
     * @throws TencentCloudSDKException
     */
    public ConfirmMultiPathGatewayOriginACLResponse ConfirmMultiPathGatewayOriginACL(ConfirmMultiPathGatewayOriginACLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConfirmMultiPathGatewayOriginACL", ConfirmMultiPathGatewayOriginACLResponse.class);
    }

    /**
     *This API is used to confirm that the latest origin-pull IP ranges have been updated to the origin server firewall when the origin-pull IP ranges change. After confirming the update to the latest origin-pull IP ranges, related change notifications will stop being pushed.
     * @param req ConfirmOriginACLUpdateRequest
     * @return ConfirmOriginACLUpdateResponse
     * @throws TencentCloudSDKException
     */
    public ConfirmOriginACLUpdateResponse ConfirmOriginACLUpdate(ConfirmOriginACLUpdateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConfirmOriginACLUpdate", ConfirmOriginACLUpdateResponse.class);
    }

    /**
     *After creating a site, you can create an acceleration domain name through this API. 

In CNAME mode, if site ownership verification is ongoing, this API will return domain ownership verification info. You can verify domain ownership separately. For details, see [Site/Domain Name Ownership Verification](https://www.tencentcloud.com/document/product/1552/70789?from_cn_redirect=1).
     * @param req CreateAccelerationDomainRequest
     * @return CreateAccelerationDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccelerationDomainResponse CreateAccelerationDomain(CreateAccelerationDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccelerationDomain", CreateAccelerationDomainResponse.class);
    }

    /**
     *This API is used to create an alias domain name.
This feature is only supported in the enterprise plan and is currently in beta test. To use it, please [contact us](https://www.tencentcloud.com/contact-us).
     * @param req CreateAliasDomainRequest
     * @return CreateAliasDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateAliasDomainResponse CreateAliasDomain(CreateAliasDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAliasDomain", CreateAliasDomainResponse.class);
    }

    /**
     *This API is on an earlier version. If you want to call it, switch to the latest version to create layer 4 proxy instances (https://www.tencentcloud.com/document/product/1552/103417?from_cn_redirect=1).
     * @param req CreateApplicationProxyRequest
     * @return CreateApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationProxyResponse CreateApplicationProxy(CreateApplicationProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationProxy", CreateApplicationProxyResponse.class);
    }

    /**
     *This API is on an earlier version. If you want to call it, switch to the latest version. For details, see [Create Layer 4 Proxy Forwarding Rule].
](https://www.tencentcloud.com/document/product/1552/103416?from_cn_redirect=1) .
     * @param req CreateApplicationProxyRuleRequest
     * @return CreateApplicationProxyRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationProxyRuleResponse CreateApplicationProxyRule(CreateApplicationProxyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationProxyRule", CreateApplicationProxyRuleResponse.class);
    }

    /**
     *This API is used to create key-value indexes for delivered log fields in the corresponding Tencent Cloud CLS log topic for a specified real-time log delivery task (task-id). If indexes have been created in CLS, this API will append indexes through merging.
     * @param req CreateCLSIndexRequest
     * @return CreateCLSIndexResponse
     * @throws TencentCloudSDKException
     */
    public CreateCLSIndexResponse CreateCLSIndex(CreateCLSIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCLSIndex", CreateCLSIndexResponse.class);
    }

    /**
     *In version management mode, this API is used to create a new version of a specified configuration group.
     * @param req CreateConfigGroupVersionRequest
     * @return CreateConfigGroupVersionResponse
     * @throws TencentCloudSDKException
     */
    public CreateConfigGroupVersionResponse CreateConfigGroupVersion(CreateConfigGroupVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConfigGroupVersion", CreateConfigGroupVersionResponse.class);
    }

    /**
     *This API is used to create a content identifier. You can set the description, tag, and other information. At the same time, you need to bind an enterprise package for billing data statistics. A content identifier can only be bound to one billing package, while a billing package can bind multiple content identifiers. This functionality is only available to allowlisted users.
     * @param req CreateContentIdentifierRequest
     * @return CreateContentIdentifierResponse
     * @throws TencentCloudSDKException
     */
    public CreateContentIdentifierResponse CreateContentIdentifier(CreateContentIdentifierRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateContentIdentifier", CreateContentIdentifierResponse.class);
    }

    /**
     *This API is used to create a custom group. A custom group is used to centrally manage a set of reusable matching entries. For example, you can save multiple JA3/JA4 TLS fingerprints as a TLS fingerprint group and directly reference the group in security rules, avoiding the need to maintain the same fingerprint list in multiple rules.
     * @param req CreateCustomGroupRequest
     * @return CreateCustomGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomGroupResponse CreateCustomGroup(CreateCustomGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCustomGroup", CreateCustomGroupResponse.class);
    }

    /**
     *This API is used to create a custom response page.
     * @param req CreateCustomizeErrorPageRequest
     * @return CreateCustomizeErrorPageResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomizeErrorPageResponse CreateCustomizeErrorPage(CreateCustomizeErrorPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCustomizeErrorPage", CreateCustomizeErrorPageResponse.class);
    }

    /**
     *After a site is created and accessed in NS mode, you can create DNS records through this API.
     * @param req CreateDnsRecordRequest
     * @return CreateDnsRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreateDnsRecordResponse CreateDnsRecord(CreateDnsRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDnsRecord", CreateDnsRecordResponse.class);
    }

    /**
     *This API is used to create a KV namespace at a specified site.
     * @param req CreateEdgeKVNamespaceRequest
     * @return CreateEdgeKVNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeKVNamespaceResponse CreateEdgeKVNamespace(CreateEdgeKVNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEdgeKVNamespace", CreateEdgeKVNamespaceResponse.class);
    }

    /**
     *This API is used to create and deploy an edge function to EdgeOne edge nodes.
     * @param req CreateFunctionRequest
     * @return CreateFunctionResponse
     * @throws TencentCloudSDKException
     */
    public CreateFunctionResponse CreateFunction(CreateFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFunction", CreateFunctionResponse.class);
    }

    /**
     *This API is used to create copies of a specified edge function. After creating copies, when client requests match the configured trigger rules or default domain name, you can access a specific function copy by adding EO-Function-Replica-Name:[copy name] to the request header. Each function supports creating two copies by default.
     * @param req CreateFunctionReplicaRequest
     * @return CreateFunctionReplicaResponse
     * @throws TencentCloudSDKException
     */
    public CreateFunctionReplicaResponse CreateFunctionReplica(CreateFunctionReplicaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFunctionReplica", CreateFunctionReplicaResponse.class);
    }

    /**
     *Creates a trigger rule for an edge function. It supports customized filter conditions to determine whether to execute a function. When a function needs to be executed, multiple ways are provided to select the target function, including directly specifying, selecting based on the client's associated region, and weight-based selection.
     * @param req CreateFunctionRuleRequest
     * @return CreateFunctionRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateFunctionRuleResponse CreateFunctionRule(CreateFunctionRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFunctionRule", CreateFunctionRuleResponse.class);
    }

    /**
     *Create an inference API Token for authentication when accessing the inference service. The Token content is returned only once when creating, and each site can create up to 100 tokens.
     * @param req CreateInferenceAPITokenRequest
     * @return CreateInferenceAPITokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateInferenceAPITokenResponse CreateInferenceAPIToken(CreateInferenceAPITokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInferenceAPIToken", CreateInferenceAPITokenResponse.class);
    }

    /**
     *Create an inference service domain name for accessing the inference service through a custom domain name. An inference service supports creating a maximum of 5 custom domain names.
After successful creation, complete the following steps to make the domain name function normally for external access:
1. To validate the CNAME configuration status of a domain, see the CheckCnameStatus api.
2. To verify ownership, refer to the VerifyOwnership API (https://www.tencentcloud.com/document/api/1552/98879?from_cn_redirect=1);
3. To configure domain name certificates, refer to the ModifyHostsCertificate api.
     * @param req CreateInferenceDomainRequest
     * @return CreateInferenceDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateInferenceDomainResponse CreateInferenceDomain(CreateInferenceDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInferenceDomain", CreateInferenceDomainResponse.class);
    }

    /**
     *This API is used to create an inference service. You can set the service name, listening port, container image configuration, and resource configuration. An access address is provided after successful creation.
     * @param req CreateInferenceServiceRequest
     * @return CreateInferenceServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInferenceServiceResponse CreateInferenceService(CreateInferenceServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInferenceService", CreateInferenceServiceResponse.class);
    }

    /**
     *JIT transcoding already provides preset transcoding templates to meet most needs. For personalized transcoding requirements, you can create custom transcoding templates through this API, with up to 100 custom templates.
To ensure consistency of JIT transcoding effects and avoid video output exceptions caused by template changes during EO cache or M3U8 sharding, the template cannot be modified after creation.
To learn about JIT transcoding capacity, see EdgeOne Video Instant Processing Function Introduction (https://www.tencentcloud.com/document/product/1552/111927?from_cn_redirect=1).
     * @param req CreateJustInTimeTranscodeTemplateRequest
     * @return CreateJustInTimeTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateJustInTimeTranscodeTemplateResponse CreateJustInTimeTranscodeTemplate(CreateJustInTimeTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateJustInTimeTranscodeTemplate", CreateJustInTimeTranscodeTemplateResponse.class);
    }

    /**
     *This API is used to create a layer 4 proxy instance.
     * @param req CreateL4ProxyRequest
     * @return CreateL4ProxyResponse
     * @throws TencentCloudSDKException
     */
    public CreateL4ProxyResponse CreateL4Proxy(CreateL4ProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateL4Proxy", CreateL4ProxyResponse.class);
    }

    /**
     *This API is used to create Layer 4 proxy instance rules and supports individual and batch creation.
     * @param req CreateL4ProxyRulesRequest
     * @return CreateL4ProxyRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateL4ProxyRulesResponse CreateL4ProxyRules(CreateL4ProxyRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateL4ProxyRules", CreateL4ProxyRulesResponse.class);
    }

    /**
     *This API is used to create rules in the [rule engine](https://www.tencentcloud.com/document/product/1552/70901?from_cn_redirect=1), with support for batch creation.
     * @param req CreateL7AccRulesRequest
     * @return CreateL7AccRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7AccRulesResponse CreateL7AccRules(CreateL7AccRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateL7AccRules", CreateL7AccRulesResponse.class);
    }

    /**
     *This API is used to create a LoadBalancer. For details, see [Quickly Create Load Balancers](https://www.tencentcloud.com/document/product/1552/104223?from_cn_redirect=1). The load balancing feature is in beta test. If you need to use it, [contact us](https://www.tencentcloud.com/contact-us).
     * @param req CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoadBalancerResponse CreateLoadBalancer(CreateLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLoadBalancer", CreateLoadBalancerResponse.class);
    }

    /**
     *This API is used to create a log analysis download task. After creation, you can query the download task through the DescribeLogAnalysisDownloadTasks API.
Note:
1. Supports up to 50 million log entries per download.
2. Log files will be retained for 3 days.
3. If multiple tasks exist at the same time, they will be processed sequentially based on task creation time.
     * @param req CreateLogAnalysisDownloadTaskRequest
     * @return CreateLogAnalysisDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateLogAnalysisDownloadTaskResponse CreateLogAnalysisDownloadTask(CreateLogAnalysisDownloadTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLogAnalysisDownloadTask", CreateLogAnalysisDownloadTaskResponse.class);
    }

    /**
     *This API is used to create a multi-channel security acceleration gateway, including Cloud Gateway and Private Gateway. Use the DescribeMultiPathGateway interface to query the status. If the status is online, the creation succeeded.
     * @param req CreateMultiPathGatewayRequest
     * @return CreateMultiPathGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateMultiPathGatewayResponse CreateMultiPathGateway(CreateMultiPathGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMultiPathGateway", CreateMultiPathGatewayResponse.class);
    }

    /**
     *This API is used to create lines for integrating with the multi-channel security acceleration gateway, including EdgeOne Layer 4 proxy lines and custom lines.
     * @param req CreateMultiPathGatewayLineRequest
     * @return CreateMultiPathGatewayLineResponse
     * @throws TencentCloudSDKException
     */
    public CreateMultiPathGatewayLineResponse CreateMultiPathGatewayLine(CreateMultiPathGatewayLineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMultiPathGatewayLine", CreateMultiPathGatewayLineResponse.class);
    }

    /**
     *This API is used to create a key for integrating with a multi-channel security acceleration gateway. Customers integrate with the multi-channel security acceleration gateway based on key signatures. Each site contains only one key, which can be used to integrate all gateways under the site. The key can be queried through the DescribeMultiPathGatewaySecretKey API.
     * @param req CreateMultiPathGatewaySecretKeyRequest
     * @return CreateMultiPathGatewaySecretKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateMultiPathGatewaySecretKeyResponse CreateMultiPathGatewaySecretKey(CreateMultiPathGatewaySecretKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMultiPathGatewaySecretKey", CreateMultiPathGatewaySecretKeyResponse.class);
    }

    /**
     *Create an origin server group to manage origin servers by group. The origin server group configured here can be referenced in features such as **adding an acceleration domain name** and **Layer 4 proxy**.
     * @param req CreateOriginGroupRequest
     * @return CreateOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateOriginGroupResponse CreateOriginGroup(CreateOriginGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOriginGroup", CreateOriginGroupResponse.class);
    }

    /**
     *If you need to use the Edgeone product, you need to create a billing plan through this interface.
> After creating a package, you need to complete creating a site and binding the plan through [CreateZone](https://www.tencentcloud.com/document/product/1552/80719?from_cn_redirect=1) before Edgeone can provide services properly.
     * @param req CreatePlanRequest
     * @return CreatePlanResponse
     * @throws TencentCloudSDKException
     */
    public CreatePlanResponse CreatePlan(CreatePlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePlan", CreatePlanResponse.class);
    }

    /**
     *Purchase a package for the selected site not bound to a package.
     * @param req CreatePlanForZoneRequest
     * @return CreatePlanForZoneResponse
     * @throws TencentCloudSDKException
     */
    public CreatePlanForZoneResponse CreatePlanForZone(CreatePlanForZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePlanForZone", CreatePlanForZoneResponse.class);
    }

    /**
     *This API is used to create a preheating task.
     * @param req CreatePrefetchTaskRequest
     * @return CreatePrefetchTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrefetchTaskResponse CreatePrefetchTask(CreatePrefetchTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrefetchTask", CreatePrefetchTaskResponse.class);
    }

    /**
     *When origin server resources update but the node cache TTL has not expired, users still access old resources. At this point, use this API to update node resources. The following two methods can trigger updates: <li>Direct deletion: Delete the node cache without any validation. User requests trigger origin-pull.</li><li>Mark expiration: Mark node resources as expired. User requests trigger back-to-origin validation, which sends HTTP conditional requests with If-None-Match and If-Modified-Since headers. If the origin server responds with 200, the node fetches new resources from the origin and updates the cache. If the origin server responds with 304, the cache will not be updated.</li>

For details on purging cache tasks, see [Purge Cache](https://www.tencentcloud.com/document/product/1552/70759?from_cn_redirect=1).
     * @param req CreatePurgeTaskRequest
     * @return CreatePurgeTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreatePurgeTaskResponse CreatePurgeTask(CreatePurgeTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePurgeTask", CreatePurgeTaskResponse.class);
    }

    /**
     *This API is used to create a real-time log delivery task.

**Restrictions**

An entity (a Layer 7 domain name, a Layer 4 proxy instance, or an Edge Function instance) under the same combination of `LogType` and `Area` can only have one task created for each `TaskType`. The mutual exclusion rules for different `LogType` values are as follows:

| LogType | Conflicting TaskType |
|---|---|
| Layer 4 proxy logs, Edge Function execution logs | Choose one of `custom_endpoint`, `s3`, and `aws_s3` |

When `TaskType` is `log_analysis`:

<ul>
<li>Only `LogType` = `l7-access-logs` or `web-attack` is supported.</li>
<li>Under the same combination of `ZoneId` and `Area`, only one task can be created for each `LogType`.</li>
</ul>

**Recommendation**: Before creating a task, call the [DescribeRealtimeLogDeliveryTasks](https://www.tencentcloud.com/document/product/1145/59503) API to query existing tasks and avoid duplicate additions.
     * @param req CreateRealtimeLogDeliveryTaskRequest
     * @return CreateRealtimeLogDeliveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRealtimeLogDeliveryTaskResponse CreateRealtimeLogDeliveryTask(CreateRealtimeLogDeliveryTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRealtimeLogDeliveryTask", CreateRealtimeLogDeliveryTaskResponse.class);
    }

    /**
     *This API is on an earlier version for creating rule engine APIs. EdgeOne comprehensively upgraded the rule engine APIs on January 21, 2025. For details on the new API for creating layer-7 acceleration rules, refer to [CreateL7AccRules](https://www.tencentcloud.com/document/product/1552/115822?from_cn_redirect=1).
<p style="color: red;">Note: Starting from January 21, 2025, the old version APIs will stop update and iteration. New features will only be provided by the latest version interface. The existing capacity supported by the old version APIs will not be affected. To avoid data field conflicts when using the old version APIs, migrate to the new version rule engine APIs as soon as possible.</p>
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRule", CreateRuleResponse.class);
    }

    /**
     *Used to create API resources.
     * @param req CreateSecurityAPIResourceRequest
     * @return CreateSecurityAPIResourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityAPIResourceResponse CreateSecurityAPIResource(CreateSecurityAPIResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityAPIResource", CreateSecurityAPIResourceResponse.class);
    }

    /**
     *Used to create an API service.
     * @param req CreateSecurityAPIServiceRequest
     * @return CreateSecurityAPIServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityAPIServiceResponse CreateSecurityAPIService(CreateSecurityAPIServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityAPIService", CreateSecurityAPIServiceResponse.class);
    }

    /**
     *Create client authentication options.
     * @param req CreateSecurityClientAttesterRequest
     * @return CreateSecurityClientAttesterResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityClientAttesterResponse CreateSecurityClientAttester(CreateSecurityClientAttesterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityClientAttester", CreateSecurityClientAttesterResponse.class);
    }

    /**
     *Create a security IP group
     * @param req CreateSecurityIPGroupRequest
     * @return CreateSecurityIPGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityIPGroupResponse CreateSecurityIPGroup(CreateSecurityIPGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityIPGroup", CreateSecurityIPGroupResponse.class);
    }

    /**
     *This API is used to create JavaScript injection rules.
     * @param req CreateSecurityJSInjectionRuleRequest
     * @return CreateSecurityJSInjectionRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityJSInjectionRuleResponse CreateSecurityJSInjectionRule(CreateSecurityJSInjectionRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityJSInjectionRule", CreateSecurityJSInjectionRuleResponse.class);
    }

    /**
     *Used to create a shared CNAME. This feature is in beta test.
     * @param req CreateSharedCNAMERequest
     * @return CreateSharedCNAMEResponse
     * @throws TencentCloudSDKException
     */
    public CreateSharedCNAMEResponse CreateSharedCNAME(CreateSharedCNAMERequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSharedCNAME", CreateSharedCNAMEResponse.class);
    }

    /**
     *Create a security policy configuration template
     * @param req CreateWebSecurityTemplateRequest
     * @return CreateWebSecurityTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateWebSecurityTemplateResponse CreateWebSecurityTemplate(CreateWebSecurityTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWebSecurityTemplate", CreateWebSecurityTemplateResponse.class);
    }

    /**
     *EdgeOne offers three access methods: CNAME, NS, and domainless access. You need to finalize site creation through this API first. For CNAME and NS connected site scenarios, see [Quickly access EdgeOne from scratch](https://www.tencentcloud.com/document/product/1552/87601?from_cn_redirect=1). For domainless access scenarios, see [Quickly enable layer 4 proxy service](https://www.tencentcloud.com/document/product/1552/96051?from_cn_redirect=1).

> It is recommended to call this API to create a site when a package already exists under the account. Please input `PlanId` in the parameter to directly bind the site to the package. If `PlanId` is not input, the created site will be inactive and unable to provide normal services. You need to complete package binding through [BindZoneToPlan](https://www.tencentcloud.com/document/product/1552/83042?from_cn_redirect=1) before the site can provide services normally. If you currently have no bindable package, go to the console to purchase a package to finalize site creation.
     * @param req CreateZoneRequest
     * @return CreateZoneResponse
     * @throws TencentCloudSDKException
     */
    public CreateZoneResponse CreateZone(CreateZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateZone", CreateZoneResponse.class);
    }

    /**
     *Delete acceleration domain names in batches.
     * @param req DeleteAccelerationDomainsRequest
     * @return DeleteAccelerationDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccelerationDomainsResponse DeleteAccelerationDomains(DeleteAccelerationDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccelerationDomains", DeleteAccelerationDomainsResponse.class);
    }

    /**
     *Delete an alias domain name.
This feature is only supported in the enterprise plan and is currently in beta test. To use it, please [contact us](https://www.tencentcloud.com/contact-us).
     * @param req DeleteAliasDomainRequest
     * @return DeleteAliasDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAliasDomainResponse DeleteAliasDomain(DeleteAliasDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAliasDomain", DeleteAliasDomainResponse.class);
    }

    /**
     *This API is on an earlier version. If you want to call it, switch to the latest version. For details, see Deleting a Layer 4 Proxy Instance.
](https://www.tencentcloud.com/document/product/1552/103415?from_cn_redirect=1) .
     * @param req DeleteApplicationProxyRequest
     * @return DeleteApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationProxyResponse DeleteApplicationProxy(DeleteApplicationProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplicationProxy", DeleteApplicationProxyResponse.class);
    }

    /**
     *This API is on an earlier version. If you want to call it, switch to the latest version. For details, see Deleting L4 Proxy Rules (https://www.tencentcloud.com/document/product/1552/103414?from_cn_redirect=1).
     * @param req DeleteApplicationProxyRuleRequest
     * @return DeleteApplicationProxyRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationProxyRuleResponse DeleteApplicationProxyRule(DeleteApplicationProxyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplicationProxyRule", DeleteApplicationProxyRuleResponse.class);
    }

    /**
     *Delete the specified content identifier. The feature is open only in the allowlist.
     * @param req DeleteContentIdentifierRequest
     * @return DeleteContentIdentifierResponse
     * @throws TencentCloudSDKException
     */
    public DeleteContentIdentifierResponse DeleteContentIdentifier(DeleteContentIdentifierRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteContentIdentifier", DeleteContentIdentifierResponse.class);
    }

    /**
     *This API is used to delete a custom response page.
     * @param req DeleteCustomErrorPageRequest
     * @return DeleteCustomErrorPageResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomErrorPageResponse DeleteCustomErrorPage(DeleteCustomErrorPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCustomErrorPage", DeleteCustomErrorPageResponse.class);
    }

    /**
     *This API is used to delete a specified custom group. If the group is referenced by a rule, deletion is not allowed. Remove the reference first.
     * @param req DeleteCustomGroupRequest
     * @return DeleteCustomGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomGroupResponse DeleteCustomGroup(DeleteCustomGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCustomGroup", DeleteCustomGroupResponse.class);
    }

    /**
     *You can use this API to delete DNS records in batches.
     * @param req DeleteDnsRecordsRequest
     * @return DeleteDnsRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDnsRecordsResponse DeleteDnsRecords(DeleteDnsRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDnsRecords", DeleteDnsRecordsResponse.class);
    }

    /**
     *This API is used to delete a specified KV namespace. After deletion, all key-value pair data in the namespace will be cleared and cannot be recovered. If the namespace is referenced by an edge function, unbind the relationship before deletion.
     * @param req DeleteEdgeKVNamespaceRequest
     * @return DeleteEdgeKVNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeKVNamespaceResponse DeleteEdgeKVNamespace(DeleteEdgeKVNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEdgeKVNamespace", DeleteEdgeKVNamespaceResponse.class);
    }

    /**
     *This API is used to delete an edge function. Once deleted, the function cannot be recovered, and associated trigger rules, environment variables, and replicas are also deleted.
     * @param req DeleteFunctionRequest
     * @return DeleteFunctionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFunctionResponse DeleteFunction(DeleteFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFunction", DeleteFunctionResponse.class);
    }

    /**
     *This API is used to delete a specified edge function replica.
     * @param req DeleteFunctionReplicaRequest
     * @return DeleteFunctionReplicaResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFunctionReplicaResponse DeleteFunctionReplica(DeleteFunctionReplicaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFunctionReplica", DeleteFunctionReplicaResponse.class);
    }

    /**
     *This API is used to delete a trigger rule for an edge function.
     * @param req DeleteFunctionRulesRequest
     * @return DeleteFunctionRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFunctionRulesResponse DeleteFunctionRules(DeleteFunctionRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFunctionRules", DeleteFunctionRulesResponse.class);
    }

    /**
     *Delete an inference API Token. Once deleted, the Token expires immediately, and requests using it to access the inference service will not pass authentication.
     * @param req DeleteInferenceAPITokenRequest
     * @return DeleteInferenceAPITokenResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInferenceAPITokenResponse DeleteInferenceAPIToken(DeleteInferenceAPITokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInferenceAPIToken", DeleteInferenceAPITokenResponse.class);
    }

    /**
     *Delete a just in time transcoding template based on the unique template identifier under the site ID.
     * @param req DeleteJustInTimeTranscodeTemplatesRequest
     * @return DeleteJustInTimeTranscodeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteJustInTimeTranscodeTemplatesResponse DeleteJustInTimeTranscodeTemplates(DeleteJustInTimeTranscodeTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteJustInTimeTranscodeTemplates", DeleteJustInTimeTranscodeTemplatesResponse.class);
    }

    /**
     *This API is used to delete a layer 4 proxy instance.
     * @param req DeleteL4ProxyRequest
     * @return DeleteL4ProxyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteL4ProxyResponse DeleteL4Proxy(DeleteL4ProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteL4Proxy", DeleteL4ProxyResponse.class);
    }

    /**
     *This API is used to delete l4 proxy rules and supports both individual and batch operation.
     * @param req DeleteL4ProxyRulesRequest
     * @return DeleteL4ProxyRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteL4ProxyRulesResponse DeleteL4ProxyRules(DeleteL4ProxyRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteL4ProxyRules", DeleteL4ProxyRulesResponse.class);
    }

    /**
     *This API is used to delete rules from the rule engine (https://www.tencentcloud.com/document/product/1552/70901?from_cn_redirect=1). Batch deletion supported.
     * @param req DeleteL7AccRulesRequest
     * @return DeleteL7AccRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteL7AccRulesResponse DeleteL7AccRules(DeleteL7AccRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteL7AccRules", DeleteL7AccRulesResponse.class);
    }

    /**
     *This API is used to delete a load balancing instance. If the load balancing instance is referenced by other services, such as a Layer 4 proxy, it cannot be deleted. Remove the reference relationship first. The load balancer feature is in beta test. If you need to use it, contact us (https://www.tencentcloud.com/online?from_cn_redirect=1-service).
     * @param req DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancerResponse DeleteLoadBalancer(DeleteLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoadBalancer", DeleteLoadBalancerResponse.class);
    }

    /**
     *This API is used to delete multi-channel security acceleration gateways, including private gateways and Cloud Gateways.
     * @param req DeleteMultiPathGatewayRequest
     * @return DeleteMultiPathGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMultiPathGatewayResponse DeleteMultiPathGateway(DeleteMultiPathGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMultiPathGateway", DeleteMultiPathGatewayResponse.class);
    }

    /**
     *This API is used to delete lines integrated with multi-channel security acceleration gateways. Only custom lines support deletion.
     * @param req DeleteMultiPathGatewayLineRequest
     * @return DeleteMultiPathGatewayLineResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMultiPathGatewayLineResponse DeleteMultiPathGatewayLine(DeleteMultiPathGatewayLineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMultiPathGatewayLine", DeleteMultiPathGatewayLineResponse.class);
    }

    /**
     *Delete an origin group. If the origin group is still referenced by a service (for example, Layer 4 proxy, DNS, load balancing, or a rule), deletion is not allowed.
     * @param req DeleteOriginGroupRequest
     * @return DeleteOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOriginGroupResponse DeleteOriginGroup(DeleteOriginGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOriginGroup", DeleteOriginGroupResponse.class);
    }

    /**
     *This API is used to delete a real-time log delivery task.
     * @param req DeleteRealtimeLogDeliveryTaskRequest
     * @return DeleteRealtimeLogDeliveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRealtimeLogDeliveryTaskResponse DeleteRealtimeLogDeliveryTask(DeleteRealtimeLogDeliveryTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRealtimeLogDeliveryTask", DeleteRealtimeLogDeliveryTaskResponse.class);
    }

    /**
     *This API is on an earlier version for deleting rule engine APIs. EdgeOne completed a comprehensive upgrade of rule engine APIs on January 21, 2025. For details on the new API for deleting L7 acceleration rules, see [DeleteL7AccRules](https://www.tencentcloud.com/document/product/1552/115821?from_cn_redirect=1).
<p style="color: red;">Note: Starting from January 21, 2025, the old version API will stop update and iteration. New features will only be provided in the new version API, and the existing capabilities supported by the old version API will not be affected. To avoid data field conflicts when using the old version API, migrate to the new version rule engine API as soon as possible.</p>
     * @param req DeleteRulesRequest
     * @return DeleteRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRulesResponse DeleteRules(DeleteRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRules", DeleteRulesResponse.class);
    }

    /**
     *Used to delete API resources.
     * @param req DeleteSecurityAPIResourceRequest
     * @return DeleteSecurityAPIResourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityAPIResourceResponse DeleteSecurityAPIResource(DeleteSecurityAPIResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityAPIResource", DeleteSecurityAPIResourceResponse.class);
    }

    /**
     *Used to delete an API service.
     * @param req DeleteSecurityAPIServiceRequest
     * @return DeleteSecurityAPIServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityAPIServiceResponse DeleteSecurityAPIService(DeleteSecurityAPIServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityAPIService", DeleteSecurityAPIServiceResponse.class);
    }

    /**
     *Delete client authentication options.
     * @param req DeleteSecurityClientAttesterRequest
     * @return DeleteSecurityClientAttesterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityClientAttesterResponse DeleteSecurityClientAttester(DeleteSecurityClientAttesterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityClientAttester", DeleteSecurityClientAttesterResponse.class);
    }

    /**
     *Delete a specified IP group. If a rule references the IP group, deletion is not allowed.
     * @param req DeleteSecurityIPGroupRequest
     * @return DeleteSecurityIPGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityIPGroupResponse DeleteSecurityIPGroup(DeleteSecurityIPGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityIPGroup", DeleteSecurityIPGroupResponse.class);
    }

    /**
     *This API is used to delete JavaScript injection rules.
     * @param req DeleteSecurityJSInjectionRuleRequest
     * @return DeleteSecurityJSInjectionRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityJSInjectionRuleResponse DeleteSecurityJSInjectionRule(DeleteSecurityJSInjectionRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityJSInjectionRule", DeleteSecurityJSInjectionRuleResponse.class);
    }

    /**
     *Used to delete a shared CNAME. This feature is in beta test.
     * @param req DeleteSharedCNAMERequest
     * @return DeleteSharedCNAMEResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSharedCNAMEResponse DeleteSharedCNAME(DeleteSharedCNAMERequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSharedCNAME", DeleteSharedCNAMEResponse.class);
    }

    /**
     *Delete a security policy configuration template
     * @param req DeleteWebSecurityTemplateRequest
     * @return DeleteWebSecurityTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebSecurityTemplateResponse DeleteWebSecurityTemplate(DeleteWebSecurityTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWebSecurityTemplate", DeleteWebSecurityTemplateResponse.class);
    }

    /**
     *Delete a site.
     * @param req DeleteZoneRequest
     * @return DeleteZoneResponse
     * @throws TencentCloudSDKException
     */
    public DeleteZoneResponse DeleteZone(DeleteZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteZone", DeleteZoneResponse.class);
    }

    /**
     *In version management mode, this API is used for version release. You can release a version to the testing environment or production environment by EnvId. The version management feature is in beta test and currently only available to the allowlist.
     * @param req DeployConfigGroupVersionRequest
     * @return DeployConfigGroupVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeployConfigGroupVersionResponse DeployConfigGroupVersion(DeployConfigGroupVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeployConfigGroupVersion", DeployConfigGroupVersionResponse.class);
    }

    /**
     *This API is used to view domain information under a site, including acceleration domain names, origin servers, and domain name status. You can view information of all domains under a site, or specify filter conditions to query specific domain information.
     * @param req DescribeAccelerationDomainsRequest
     * @return DescribeAccelerationDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccelerationDomainsResponse DescribeAccelerationDomains(DescribeAccelerationDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccelerationDomains", DescribeAccelerationDomainsResponse.class);
    }

    /**
     *Query the list of alias domain names.
This feature is only supported in the enterprise plan and is currently in beta test. To use it, please [contact us](https://www.tencentcloud.com/contact-us).
     * @param req DescribeAliasDomainsRequest
     * @return DescribeAliasDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAliasDomainsResponse DescribeAliasDomains(DescribeAliasDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAliasDomains", DescribeAliasDomainsResponse.class);
    }

    /**
     *This API is on an earlier version. If you want to call it, switch to the latest version. The latest version splits into two APIs: one for querying the Layer 4 proxy instance list and the other for querying Layer 4 forwarding rules. For details, see [Query Layer 4 Proxy Instance List](https://www.tencentcloud.com/document/product/1552/103413?from_cn_redirect=1) and [Query Layer 4 Proxy Forwarding Rule List](https://www.tencentcloud.com/document/product/1552/103412?from_cn_redirect=1).
     * @param req DescribeApplicationProxiesRequest
     * @return DescribeApplicationProxiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationProxiesResponse DescribeApplicationProxies(DescribeApplicationProxiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationProxies", DescribeApplicationProxiesResponse.class);
    }

    /**
     *Queries the list of available custom configurations for site rule engine operations.
     * @param req DescribeAvailableCustomActionsForRuleEngineRequest
     * @return DescribeAvailableCustomActionsForRuleEngineResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableCustomActionsForRuleEngineResponse DescribeAvailableCustomActionsForRuleEngine(DescribeAvailableCustomActionsForRuleEngineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAvailableCustomActionsForRuleEngine", DescribeAvailableCustomActionsForRuleEngineResponse.class);
    }

    /**
     *This API is used to query detailed information about the origin protection IP range control domain, including the version number and specific IP range information.
The main difference between standard control domain and streamlined control domain is the number of IP ranges provided. The latter has fewer IP ranges, but has some usage restrictions. For specific restrictions, consult the product. The format description is as follows:
Standard control domain:
<li>gaz: standard global control domain;</li>
<li>mlc: Standard China control domain;</li>
<li>emc: standard overseas (worldwide excluding China) control domain;</li>
Streamline the control domain.
<li>plat-gaz: simplified global control domain;</li>
<li>plat-mlc: Simplified China control domain;</li>
<li>plat-emc: Simplified overseas (global excluding China) control domain;</li>
<li>plat-specific-gaz: custom edition global availability zone control domain;</li>
<li>plat-specific-mlc: custom edition for controlling the Chinese mainland availability zone control domain;</li>
<li>plat-specific-emc: custom edition control domain for availability zones worldwide (excluding Chinese mainland);</li>
Abbreviation description:
<li>gaz:Global AZ Availability Zone;</li>
<li>mlc:mainlandChina;</li>
<li>emc:Exclude mainlandChina.</li>
     * @param req DescribeAvailableOriginACLFamilyRequest
     * @return DescribeAvailableOriginACLFamilyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableOriginACLFamilyResponse DescribeAvailableOriginACLFamily(DescribeAvailableOriginACLFamilyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAvailableOriginACLFamily", DescribeAvailableOriginACLFamilyResponse.class);
    }

    /**
     *Query the list of available package information for the current account.
     * @param req DescribeAvailablePlansRequest
     * @return DescribeAvailablePlansResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailablePlansResponse DescribeAvailablePlans(DescribeAvailablePlansRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAvailablePlans", DescribeAvailablePlansResponse.class);
    }

    /**
     *Query billing data via this API.
     * @param req DescribeBillingDataRequest
     * @return DescribeBillingDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillingDataResponse DescribeBillingData(DescribeBillingDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillingData", DescribeBillingDataResponse.class);
    }

    /**
     *In version management mode, this API is used to obtain detailed version information, including version ID, description, status, creation time, associated configuration group information, and the content of the version configuration file. The version management feature is in beta test and currently only available to the allowlist.
     * @param req DescribeConfigGroupVersionDetailRequest
     * @return DescribeConfigGroupVersionDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigGroupVersionDetailResponse DescribeConfigGroupVersionDetail(DescribeConfigGroupVersionDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigGroupVersionDetail", DescribeConfigGroupVersionDetailResponse.class);
    }

    /**
     *In version management mode, this API is used to query the version list of a specified configuration group. The version management feature is in beta test and currently only available to the allowlist.
     * @param req DescribeConfigGroupVersionsRequest
     * @return DescribeConfigGroupVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigGroupVersionsResponse DescribeConfigGroupVersions(DescribeConfigGroupVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigGroupVersions", DescribeConfigGroupVersionsResponse.class);
    }

    /**
     *This API is used to query content identifiers in batches. They can be filtered by ID, description, status, or tags. Deleted content identifiers queried by status are only retained for three months. This feature is only open in the allowlist.
     * @param req DescribeContentIdentifiersRequest
     * @return DescribeContentIdentifiersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContentIdentifiersResponse DescribeContentIdentifiers(DescribeContentIdentifiersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeContentIdentifiers", DescribeContentIdentifiersResponse.class);
    }

    /**
     *Query the content management API quota
     * @param req DescribeContentQuotaRequest
     * @return DescribeContentQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContentQuotaResponse DescribeContentQuota(DescribeContentQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeContentQuota", DescribeContentQuotaResponse.class);
    }

    /**
     *This API is used to query the custom error page list.
     * @param req DescribeCustomErrorPagesRequest
     * @return DescribeCustomErrorPagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomErrorPagesResponse DescribeCustomErrorPages(DescribeCustomErrorPagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomErrorPages", DescribeCustomErrorPagesResponse.class);
    }

    /**
     *This API is used to query the detailed information of a custom group, including all entries in the group (returned with pagination via Limit/Offset). The DescribeCustomGroups list API returns up to the first 500 entries for each group. To obtain all entries, use this API. The GroupId can be obtained from the response of CreateCustomGroup or by querying DescribeCustomGroups.
     * @param req DescribeCustomGroupRequest
     * @return DescribeCustomGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomGroupResponse DescribeCustomGroup(DescribeCustomGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomGroup", DescribeCustomGroupResponse.class);
    }

    /**
     *This API is used to obtain the security policy configuration that uses a custom group.
     * @param req DescribeCustomGroupReferencesRequest
     * @return DescribeCustomGroupReferencesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomGroupReferencesResponse DescribeCustomGroupReferences(DescribeCustomGroupReferencesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomGroupReferences", DescribeCustomGroupReferencesResponse.class);
    }

    /**
     *This API is used to query the list of custom groups under a specified site. This API returns only the first 500 entries of each custom group. To query all entries in a group, use the DescribeSecurityCustomGroup API.
     * @param req DescribeCustomGroupsRequest
     * @return DescribeCustomGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomGroupsResponse DescribeCustomGroups(DescribeCustomGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomGroups", DescribeCustomGroupsResponse.class);
    }

    /**
     *This API is used to query DDoS attack time-series data.
     * @param req DescribeDDoSAttackDataRequest
     * @return DescribeDDoSAttackDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackDataResponse DescribeDDoSAttackData(DescribeDDoSAttackDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDoSAttackData", DescribeDDoSAttackDataResponse.class);
    }

    /**
     *This API is used to query the list of DDoS attack events.
     * @param req DescribeDDoSAttackEventRequest
     * @return DescribeDDoSAttackEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackEventResponse DescribeDDoSAttackEvent(DescribeDDoSAttackEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDoSAttackEvent", DescribeDDoSAttackEventResponse.class);
    }

    /**
     *This API is used to query Top-ranked data of DDoS attacks.
     * @param req DescribeDDoSAttackTopDataRequest
     * @return DescribeDDoSAttackTopDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackTopDataResponse DescribeDDoSAttackTopData(DescribeDDoSAttackTopDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDoSAttackTopData", DescribeDDoSAttackTopDataResponse.class);
    }

    /**
     *This API is used to query exclusive DDoS protection info of a site.
     * @param req DescribeDDoSProtectionRequest
     * @return DescribeDDoSProtectionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSProtectionResponse DescribeDDoSProtection(DescribeDDoSProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDoSProtection", DescribeDDoSProtectionResponse.class);
    }

    /**
     *Query the default certificate list
<p style="color: red;">Note: This earlier version interface is no longer updated. New features will only be provided in the latest version interface. Existing capacities supported by the earlier version interface will not be affected. To query the cert configured for a domain name, please use DescribeAccelerationDomains.</p>
     * @param req DescribeDefaultCertificatesRequest
     * @return DescribeDefaultCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefaultCertificatesResponse DescribeDefaultCertificates(DescribeDefaultCertificatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDefaultCertificates", DescribeDefaultCertificatesResponse.class);
    }

    /**
     *In version management mode, this API is used to query the version release history of production/test environments. The version management feature is in beta test and currently only available to the allowlist.
     * @param req DescribeDeployHistoryRequest
     * @return DescribeDeployHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeployHistoryResponse DescribeDeployHistory(DescribeDeployHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeployHistory", DescribeDeployHistoryResponse.class);
    }

    /**
     *This API is used to view DNS records under a site, including DNS record names, record types, and record content. It supports specifying filter conditions to query specific DNS records.
     * @param req DescribeDnsRecordsRequest
     * @return DescribeDnsRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDnsRecordsResponse DescribeDnsRecords(DescribeDnsRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDnsRecords", DescribeDnsRecordsResponse.class);
    }

    /**
     *Queries the KV namespace list under a specified site. Supports pagination, sorting, and conditional filtering. Returns basic namespace info, storage capacity utilization, and reference relationships. If no data is found, an empty array is returned.
     * @param req DescribeEdgeKVNamespacesRequest
     * @return DescribeEdgeKVNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeKVNamespacesResponse DescribeEdgeKVNamespaces(DescribeEdgeKVNamespacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeKVNamespaces", DescribeEdgeKVNamespacesResponse.class);
    }

    /**
     *In version management mode, this API is used to query environment information, including the environment ID, type, and current effective version. The version management feature is in beta test and currently only available to the allowlist.
     * @param req DescribeEnvironmentsRequest
     * @return DescribeEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentsResponse DescribeEnvironments(DescribeEnvironmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvironments", DescribeEnvironmentsResponse.class);
    }

    /**
     *This API is used to query the component binding list of a specified edge function. It supports pagination and conditional filtering, and returns detailed information such as the bound component type, variable name, and configuration parameters. The currently supported binding component type is KV namespace (kv_namespace).
     * @param req DescribeFunctionComponentBindingsRequest
     * @return DescribeFunctionComponentBindingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFunctionComponentBindingsResponse DescribeFunctionComponentBindings(DescribeFunctionComponentBindingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFunctionComponentBindings", DescribeFunctionComponentBindingsResponse.class);
    }

    /**
     *This API is used to query the replica list of edge functions.
     * @param req DescribeFunctionReplicasRequest
     * @return DescribeFunctionReplicasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFunctionReplicasResponse DescribeFunctionReplicas(DescribeFunctionReplicasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFunctionReplicas", DescribeFunctionReplicasResponse.class);
    }

    /**
     *This API is used to query the list of trigger rules for an edge function. It supports filtering by rule ID, function ID, rule description, and so on.
     * @param req DescribeFunctionRulesRequest
     * @return DescribeFunctionRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFunctionRulesResponse DescribeFunctionRules(DescribeFunctionRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFunctionRules", DescribeFunctionRulesResponse.class);
    }

    /**
     *This API is used to query the runtime environment of an edge function, including environment variables.
     * @param req DescribeFunctionRuntimeEnvironmentRequest
     * @return DescribeFunctionRuntimeEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFunctionRuntimeEnvironmentResponse DescribeFunctionRuntimeEnvironment(DescribeFunctionRuntimeEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFunctionRuntimeEnvironment", DescribeFunctionRuntimeEnvironmentResponse.class);
    }

    /**
     *This API is used to query the list of edge functions. It supports filtering by function ID, name, description, and so on.
     * @param req DescribeFunctionsRequest
     * @return DescribeFunctionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFunctionsResponse DescribeFunctions(DescribeFunctionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFunctions", DescribeFunctionsResponse.class);
    }

    /**
     *This API is on an earlier version. EdgeOne has completed a comprehensive upgrade of rule engine APIs. You can use [DescribeL7AccSetting](https://www.tencentcloud.com/document/product/1552/115819?from_cn_redirect=1) and [DescribeL7AccRules](https://www.tencentcloud.com/document/product/1552/115820?from_cn_redirect=1) to obtain detailed configuration of a domain.
     * @param req DescribeHostsSettingRequest
     * @return DescribeHostsSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostsSettingResponse DescribeHostsSetting(DescribeHostsSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostsSetting", DescribeHostsSettingResponse.class);
    }

    /**
     *This API is used to obtain policy settings that use IP grouping.
     * @param req DescribeIPGroupReferencesRequest
     * @return DescribeIPGroupReferencesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIPGroupReferencesResponse DescribeIPGroupReferences(DescribeIPGroupReferencesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIPGroupReferences", DescribeIPGroupReferencesResponse.class);
    }

    /**
     *This API is used to query if the IP is an EdgeOne IP.
     * @param req DescribeIPRegionRequest
     * @return DescribeIPRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIPRegionResponse DescribeIPRegion(DescribeIPRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIPRegion", DescribeIPRegionResponse.class);
    }

    /**
     *Queries verification information of a site.
     * @param req DescribeIdentificationsRequest
     * @return DescribeIdentificationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIdentificationsResponse DescribeIdentifications(DescribeIdentificationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIdentifications", DescribeIdentificationsResponse.class);
    }

    /**
     *Queries the list of reasoning API tokens and returns the Token ID, name, content, and creation time. Paging query is supported.
     * @param req DescribeInferenceAPITokensRequest
     * @return DescribeInferenceAPITokensResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInferenceAPITokensResponse DescribeInferenceAPITokens(DescribeInferenceAPITokensRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInferenceAPITokens", DescribeInferenceAPITokensResponse.class);
    }

    /**
     *This API is used to query the inference service domain name list and return the Cname address, ownership verification, and certificate information of the domain.
     * @param req DescribeInferenceDomainsRequest
     * @return DescribeInferenceDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInferenceDomainsResponse DescribeInferenceDomains(DescribeInferenceDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInferenceDomains", DescribeInferenceDomainsResponse.class);
    }

    /**
     *This API is used to query the inference hardware specification list and return the CPU, memory, GPU, and video memory configurations of each specification. You can select the required specification from the list when creating a service.
     * @param req DescribeInferenceHardwareSpecificationsRequest
     * @return DescribeInferenceHardwareSpecificationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInferenceHardwareSpecificationsResponse DescribeInferenceHardwareSpecifications(DescribeInferenceHardwareSpecificationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInferenceHardwareSpecifications", DescribeInferenceHardwareSpecificationsResponse.class);
    }

    /**
     *This API is used to query the logs of a specified deployment of an inference service, return log content and generation time, and support time range search, pagination, and sorting.
     * @param req DescribeInferenceServiceDeploymentLogsRequest
     * @return DescribeInferenceServiceDeploymentLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInferenceServiceDeploymentLogsResponse DescribeInferenceServiceDeploymentLogs(DescribeInferenceServiceDeploymentLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInferenceServiceDeploymentLogs", DescribeInferenceServiceDeploymentLogsResponse.class);
    }

    /**
     *This API is used to query the deployment history list of an inference service. It returns the operation type, status, duration, configuration snapshot, and whether it is the currently effective configuration for each deployment. Pagination and sorting are supported.
     * @param req DescribeInferenceServiceDeploymentRecordsRequest
     * @return DescribeInferenceServiceDeploymentRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInferenceServiceDeploymentRecordsResponse DescribeInferenceServiceDeploymentRecords(DescribeInferenceServiceDeploymentRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInferenceServiceDeploymentRecords", DescribeInferenceServiceDeploymentRecordsResponse.class);
    }

    /**
     *This API is used to query the monitoring data of inference services, supporting indicators such as CPU, memory, GPU, video memory utilization, and instance count. You can specify the time range and aggregation granularity, and query data from the most recent 30 days.
     * @param req DescribeInferenceServiceMonitorDataRequest
     * @return DescribeInferenceServiceMonitorDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInferenceServiceMonitorDataResponse DescribeInferenceServiceMonitorData(DescribeInferenceServiceMonitorDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInferenceServiceMonitorData", DescribeInferenceServiceMonitorDataResponse.class);
    }

    /**
     *This API is used to query the inference service list, support filtering by service name, service ID, and status, and return the service configuration, running state, number of instances, and inference access address.
     * @param req DescribeInferenceServicesRequest
     * @return DescribeInferenceServicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInferenceServicesResponse DescribeInferenceServices(DescribeInferenceServicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInferenceServices", DescribeInferenceServicesResponse.class);
    }

    /**
     *This API is used to retrieve the transcoding template detail list based on the just in time transcoding template name, template type, or unique ID. The returned results include all eligible custom templates and preset templates.
     * @param req DescribeJustInTimeTranscodeTemplatesRequest
     * @return DescribeJustInTimeTranscodeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJustInTimeTranscodeTemplatesResponse DescribeJustInTimeTranscodeTemplates(DescribeJustInTimeTranscodeTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJustInTimeTranscodeTemplates", DescribeJustInTimeTranscodeTemplatesResponse.class);
    }

    /**
     *This API is used to query the layer 4 proxy instance list.
     * @param req DescribeL4ProxyRequest
     * @return DescribeL4ProxyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL4ProxyResponse DescribeL4Proxy(DescribeL4ProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeL4Proxy", DescribeL4ProxyResponse.class);
    }

    /**
     *This API is used to query the forwarding rule list under a Layer 4 proxy instance.
     * @param req DescribeL4ProxyRulesRequest
     * @return DescribeL4ProxyRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL4ProxyRulesResponse DescribeL4ProxyRules(DescribeL4ProxyRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeL4ProxyRules", DescribeL4ProxyRulesResponse.class);
    }

    /**
     *This API is used to query the rule list of the [rule engine](https://www.tencentcloud.com/document/product/1552/70901?from_cn_redirect=1).
     * @param req DescribeL7AccRulesRequest
     * @return DescribeL7AccRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL7AccRulesResponse DescribeL7AccRules(DescribeL7AccRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeL7AccRules", DescribeL7AccRulesResponse.class);
    }

    /**
     *This API is used to query the global configuration of site acceleration.
     * @param req DescribeL7AccSettingRequest
     * @return DescribeL7AccSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL7AccSettingResponse DescribeL7AccSetting(DescribeL7AccSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeL7AccSetting", DescribeL7AccSettingResponse.class);
    }

    /**
     *This API is used to query the load balancing instance list. The load balancer feature is in beta test. If you need to use it, [contact us](https://www.tencentcloud.com/contact-us).
     * @param req DescribeLoadBalancerListRequest
     * @return DescribeLoadBalancerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancerListResponse DescribeLoadBalancerList(DescribeLoadBalancerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancerList", DescribeLoadBalancerListResponse.class);
    }

    /**
     *This API is used to query log analysis details. The data comes from the log data pushed by real-time log push tasks under the site with the destination "log-analysis".
     * @param req DescribeLogAnalysisDetailRequest
     * @return DescribeLogAnalysisDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogAnalysisDetailResponse DescribeLogAnalysisDetail(DescribeLogAnalysisDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogAnalysisDetail", DescribeLogAnalysisDetailResponse.class);
    }

    /**
     *This API is used to query the log download task list for log analysis. Note: Only download task records from the last three days are retained.
     * @param req DescribeLogAnalysisDownloadTasksRequest
     * @return DescribeLogAnalysisDownloadTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogAnalysisDownloadTasksResponse DescribeLogAnalysisDownloadTasks(DescribeLogAnalysisDownloadTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogAnalysisDownloadTasks", DescribeLogAnalysisDownloadTasksResponse.class);
    }

    /**
     *This API is used to query log analysis statistics results. Users append an SQL aggregation statement after the query statement ([retrieval condition] | [SQL statement]). The backend executes the aggregation and returns columnar statistics results (column definition + data row).
     * @param req DescribeLogAnalysisStatisticsRequest
     * @return DescribeLogAnalysisStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogAnalysisStatisticsResponse DescribeLogAnalysisStatistics(DescribeLogAnalysisStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogAnalysisStatistics", DescribeLogAnalysisStatisticsResponse.class);
    }

    /**
     *This API is used to query details of a multi-channel security acceleration gateway, such as name, Gateway ID, IP, port, and type.
     * @param req DescribeMultiPathGatewayRequest
     * @return DescribeMultiPathGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMultiPathGatewayResponse DescribeMultiPathGateway(DescribeMultiPathGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMultiPathGateway", DescribeMultiPathGatewayResponse.class);
    }

    /**
     *This API is used to query lines connected to the multi-channel security acceleration gateway, including direct connections, EdgeOne Layer 4 proxy lines, and custom lines.
     * @param req DescribeMultiPathGatewayLineRequest
     * @return DescribeMultiPathGatewayLineResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMultiPathGatewayLineResponse DescribeMultiPathGatewayLine(DescribeMultiPathGatewayLineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMultiPathGatewayLine", DescribeMultiPathGatewayLineResponse.class);
    }

    /**
     *This API is used to query the binding relationship between a multi-channel security acceleration gateway instance and origin IP ranges, as well as origin IP range details. If the MultiPathGatewayNextOriginACL field has a return value, synchronize the latest origin IP ranges to the origin server firewall settings.
     * @param req DescribeMultiPathGatewayOriginACLRequest
     * @return DescribeMultiPathGatewayOriginACLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMultiPathGatewayOriginACLResponse DescribeMultiPathGatewayOriginACL(DescribeMultiPathGatewayOriginACLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMultiPathGatewayOriginACL", DescribeMultiPathGatewayOriginACLResponse.class);
    }

    /**
     *This API is used to query the available region list of user-created multi-channel security acceleration gateways.
     * @param req DescribeMultiPathGatewayRegionsRequest
     * @return DescribeMultiPathGatewayRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMultiPathGatewayRegionsResponse DescribeMultiPathGatewayRegions(DescribeMultiPathGatewayRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMultiPathGatewayRegions", DescribeMultiPathGatewayRegionsResponse.class);
    }

    /**
     *This API is used to query the key for integrating a multi-channel security acceleration gateway. Customers sign with the integration key to access the multi-channel security acceleration gateway.
     * @param req DescribeMultiPathGatewaySecretKeyRequest
     * @return DescribeMultiPathGatewaySecretKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMultiPathGatewaySecretKeyResponse DescribeMultiPathGatewaySecretKey(DescribeMultiPathGatewaySecretKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMultiPathGatewaySecretKey", DescribeMultiPathGatewaySecretKeyResponse.class);
    }

    /**
     *This API is used to query the list of user-created multi-channel security acceleration gateways. Pagination is supported.
     * @param req DescribeMultiPathGatewaysRequest
     * @return DescribeMultiPathGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMultiPathGatewaysResponse DescribeMultiPathGateways(DescribeMultiPathGatewaysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMultiPathGateways", DescribeMultiPathGatewaysResponse.class);
    }

    /**
     *This API is used to query the binding relationship between L7 acceleration domains/L4 proxy instances and origin IP ranges under a site, as well as origin IP range details. If you want to periodically get the latest version of origin IP ranges through an automation script, you can poll this API at a low frequency (once every three days is recommended). If the NextOriginACL field has a return value, synchronize the latest origin IP ranges to the origin server firewall configuration.
     * @param req DescribeOriginACLRequest
     * @return DescribeOriginACLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOriginACLResponse DescribeOriginACL(DescribeOriginACLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOriginACL", DescribeOriginACLResponse.class);
    }

    /**
     *This API is used to query the origin server group list.
     * @param req DescribeOriginGroupRequest
     * @return DescribeOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOriginGroupResponse DescribeOriginGroup(DescribeOriginGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOriginGroup", DescribeOriginGroupResponse.class);
    }

    /**
     *This API is used to query the health status of origin server groups under a load balancing instance. The load balancer feature is in beta test. If you need to use it, [contact us](https://www.tencentcloud.com/contact-us).
     * @param req DescribeOriginGroupHealthStatusRequest
     * @return DescribeOriginGroupHealthStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOriginGroupHealthStatusResponse DescribeOriginGroupHealthStatus(DescribeOriginGroupHealthStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOriginGroupHealthStatus", DescribeOriginGroupHealthStatusResponse.class);
    }

    /**
     *This API is on an earlier version for origin protection queries. EdgeOne comprehensively upgraded the origin protection APIs on June 27, 2025. For details on the new version of the origin protection query API, refer to [DescribeOriginACL](https://www.tencentcloud.com/document/product/1552/120408?from_cn_redirect=1).

<p style="color: red;">Note: Starting from June 27, 2025, earlier version APIs will stop update and iteration, and new features will only be provided in the new version of APIs. To avoid data field conflicts when using earlier version APIs, migrate to the new version of origin protection APIs as soon as possible.</p>
     * @param req DescribeOriginProtectionRequest
     * @return DescribeOriginProtectionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOriginProtectionResponse DescribeOriginProtection(DescribeOriginProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOriginProtection", DescribeOriginProtectionResponse.class);
    }

    /**
     *This API is used to query layer-7 monitoring time series traffic Data. This API is to be deprecated. Please use the <a href="https://www.tencentcloud.com/document/product/1552/80648?from_cn_redirect=1">DescribeTimingL7AnalysisData</a> API.
     * @param req DescribeOverviewL7DataRequest
     * @return DescribeOverviewL7DataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOverviewL7DataResponse DescribeOverviewL7Data(DescribeOverviewL7DataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOverviewL7Data", DescribeOverviewL7DataResponse.class);
    }

    /**
     *Query the package information list with pagination.
     * @param req DescribePlansRequest
     * @return DescribePlansResponse
     * @throws TencentCloudSDKException
     */
    public DescribePlansResponse DescribePlans(DescribePlansRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePlans", DescribePlansResponse.class);
    }

    /**
     *This API is used to query origin-pull rate limits. This feature is in beta test for allowlisted users.
     * @param req DescribePrefetchOriginLimitRequest
     * @return DescribePrefetchOriginLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrefetchOriginLimitResponse DescribePrefetchOriginLimit(DescribePrefetchOriginLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrefetchOriginLimit", DescribePrefetchOriginLimitResponse.class);
    }

    /**
     *This API is used to query the commit history and execution progress of preheating tasks. Tasks submitted via the CreatePrefetchTasks API can be queried through this API.
     * @param req DescribePrefetchTasksRequest
     * @return DescribePrefetchTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrefetchTasksResponse DescribePrefetchTasks(DescribePrefetchTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrefetchTasks", DescribePrefetchTasksResponse.class);
    }

    /**
     *This API is used to query submitted URL refresh and directory refresh records and task progress. All tasks submitted via the CreatePurgeTasks API can be queried through this API.
     * @param req DescribePurgeTasksRequest
     * @return DescribePurgeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePurgeTasksResponse DescribePurgeTasks(DescribePurgeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePurgeTasks", DescribePurgeTasksResponse.class);
    }

    /**
     *This API is used to query real-time log delivery task list.
     * @param req DescribeRealtimeLogDeliveryTasksRequest
     * @return DescribeRealtimeLogDeliveryTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealtimeLogDeliveryTasksResponse DescribeRealtimeLogDeliveryTasks(DescribeRealtimeLogDeliveryTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRealtimeLogDeliveryTasks", DescribeRealtimeLogDeliveryTasksResponse.class);
    }

    /**
     *This API is on an earlier version for querying rule engine rules. EdgeOne comprehensively upgraded the rule engine APIs on January 21, 2025. For details on the new version API for querying L7 acceleration rules, see [DescribeL7AccRules](https://www.tencentcloud.com/document/product/1552/115820?from_cn_redirect=1).
<p style="color: red;">Note: Starting from January 21, 2025, the legacy version API will stop update and iteration. New features will only be provided in the new version API. The existing capacity supported by the legacy version API will not be affected. To avoid data field conflicts when using the legacy version API, migrate to the new version rule engine API as soon as possible.</p>
     * @param req DescribeRulesRequest
     * @return DescribeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesResponse DescribeRules(DescribeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRules", DescribeRulesResponse.class);
    }

    /**
     *This API is on an earlier version. EdgeOne has completed a comprehensive upgrade of rule engine APIs. For details, see [RuleEngineAction](https://www.tencentcloud.com/document/product/1552/80721?from_cn_redirect=1#RuleEngineAction).
     * @param req DescribeRulesSettingRequest
     * @return DescribeRulesSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesSettingResponse DescribeRulesSetting(DescribeRulesSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRulesSetting", DescribeRulesSettingResponse.class);
    }

    /**
     *Query API resources under a site.
     * @param req DescribeSecurityAPIResourceRequest
     * @return DescribeSecurityAPIResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityAPIResourceResponse DescribeSecurityAPIResource(DescribeSecurityAPIResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityAPIResource", DescribeSecurityAPIResourceResponse.class);
    }

    /**
     *Query API services under a site.
     * @param req DescribeSecurityAPIServiceRequest
     * @return DescribeSecurityAPIServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityAPIServiceResponse DescribeSecurityAPIService(DescribeSecurityAPIServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityAPIService", DescribeSecurityAPIServiceResponse.class);
    }

    /**
     *Query client authentication option configurations.
     * @param req DescribeSecurityClientAttesterRequest
     * @return DescribeSecurityClientAttesterResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityClientAttesterResponse DescribeSecurityClientAttester(DescribeSecurityClientAttesterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityClientAttester", DescribeSecurityClientAttesterResponse.class);
    }

    /**
     *This API is used to query the configuration information of a security IP group, including its ID, name, and content. In the query result of this API, each IP group returns up to 2,000 IPs or CIDR blocks. If an ultra-large IP group exceeds 2,000 IPs or CIDR blocks, call DescribeSecurityIPGroupContent for paging query.
     * @param req DescribeSecurityIPGroupRequest
     * @return DescribeSecurityIPGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityIPGroupResponse DescribeSecurityIPGroup(DescribeSecurityIPGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityIPGroup", DescribeSecurityIPGroupResponse.class);
    }

    /**
     *This API is used to query the IP address list in a specified IP group by page. When the number of IP addresses in an IP group exceeds 2000, you can use this API to perform a paging query to obtain the complete IP address list.
     * @param req DescribeSecurityIPGroupContentRequest
     * @return DescribeSecurityIPGroupContentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityIPGroupContentResponse DescribeSecurityIPGroupContent(DescribeSecurityIPGroupContentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityIPGroupContent", DescribeSecurityIPGroupContentResponse.class);
    }

    /**
     *This API is deprecated and will be discontinued on June 30, 2024. Please use the API for querying security IP groups.
](https://www.tencentcloud.com/document/product/1552/105866?from_cn_redirect=1).

This API is used to query the configuration information of an IP group, including the IP group name, IP group content, and the site the IP group belongs to.
     * @param req DescribeSecurityIPGroupInfoRequest
     * @return DescribeSecurityIPGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityIPGroupInfoResponse DescribeSecurityIPGroupInfo(DescribeSecurityIPGroupInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityIPGroupInfo", DescribeSecurityIPGroupInfoResponse.class);
    }

    /**
     *This API is used to query JavaScript injection rules.
     * @param req DescribeSecurityJSInjectionRuleRequest
     * @return DescribeSecurityJSInjectionRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityJSInjectionRuleResponse DescribeSecurityJSInjectionRule(DescribeSecurityJSInjectionRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityJSInjectionRule", DescribeSecurityJSInjectionRuleResponse.class);
    }

    /**
     *Query security protection configuration details.
     * @param req DescribeSecurityPolicyRequest
     * @return DescribeSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPolicyResponse DescribeSecurityPolicy(DescribeSecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityPolicy", DescribeSecurityPolicyResponse.class);
    }

    /**
     *This API is used to query the binding relationship list of a specified policy template.
     * @param req DescribeSecurityTemplateBindingsRequest
     * @return DescribeSecurityTemplateBindingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityTemplateBindingsResponse DescribeSecurityTemplateBindings(DescribeSecurityTemplateBindingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityTemplateBindings", DescribeSecurityTemplateBindingsResponse.class);
    }

    /**
     *This API is used to query the shared CNAME list, supporting fuzzy search, pagination, and sorting.
     * @param req DescribeSharedCNAMERequest
     * @return DescribeSharedCNAMEResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSharedCNAMEResponse DescribeSharedCNAME(DescribeSharedCNAMERequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSharedCNAME", DescribeSharedCNAMEResponse.class);
    }

    /**
     *This API is used to query the time series data of edge function analysis. Note that the data queried by this API has a delay of about 10 minutes. It is recommended to pull data from at least 10 minutes before the current time.
     * @param req DescribeTimingFunctionAnalysisDataRequest
     * @return DescribeTimingFunctionAnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingFunctionAnalysisDataResponse DescribeTimingFunctionAnalysisData(DescribeTimingFunctionAnalysisDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimingFunctionAnalysisData", DescribeTimingFunctionAnalysisDataResponse.class);
    }

    /**
     *<p>This API is used to query the L4 time series Data list.</p>
     * @param req DescribeTimingL4DataRequest
     * @return DescribeTimingL4DataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL4DataResponse DescribeTimingL4Data(DescribeTimingL4DataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimingL4Data", DescribeTimingL4DataResponse.class);
    }

    /**
     *This API is used to query time series data of the L7 domain name business.
Note:
1. This API queries data with a delay of about 10 minutes. It is advisable to pull data from 10 minutes before the current time.
2. This interface returns post-protection traffic request data by default. Users can use `Filters.mitigatedByWebSecurity` to custom query defended data.
     * @param req DescribeTimingL7AnalysisDataRequest
     * @return DescribeTimingL7AnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL7AnalysisDataResponse DescribeTimingL7AnalysisData(DescribeTimingL7AnalysisDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimingL7AnalysisData", DescribeTimingL7AnalysisDataResponse.class);
    }

    /**
     *This API is used to query L7 cache analysis time series traffic data. This API is to be deprecated. Please use the <a href="https://www.tencentcloud.com/document/product/1552/80648?from_cn_redirect=1">DescribeTimingL7AnalysisData</a> API.
     * @param req DescribeTimingL7CacheDataRequest
     * @return DescribeTimingL7CacheDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL7CacheDataResponse DescribeTimingL7CacheData(DescribeTimingL7CacheDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimingL7CacheData", DescribeTimingL7CacheDataResponse.class);
    }

    /**
     *This API is used to query the origin-pull time series data of an L7 domain.
You can choose to group queries by specifying the query dimension <code>DimensionName</code>, which returns multiple groups of time series data. For detailed directions and usage limits, see [How to Use APIs to Implement Group Query in a Single Call](https://www.tencentcloud.com/document/product/1552/127501?from_cn_redirect=1).
     * @param req DescribeTimingL7OriginPullDataRequest
     * @return DescribeTimingL7OriginPullDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL7OriginPullDataResponse DescribeTimingL7OriginPullData(DescribeTimingL7OriginPullDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimingL7OriginPullData", DescribeTimingL7OriginPullDataResponse.class);
    }

    /**
     *This API is used to query the topN data of Edge Functions by a specified dimension. Note that the data returned by this API has a delay of about 10 minutes. We recommend that you query the data generated at least 10 minutes before the current time.
     * @param req DescribeTopFunctionAnalysisDataRequest
     * @return DescribeTopFunctionAnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopFunctionAnalysisDataResponse DescribeTopFunctionAnalysisData(DescribeTopFunctionAnalysisDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopFunctionAnalysisData", DescribeTopFunctionAnalysisDataResponse.class);
    }

    /**
     *This API is used to query the top N data of the L7 domain name business by specified dimension.
Note:
1. This API queries data with a delay of about 10 minutes. It is recommended to pull data from 10 minutes before the current time.
2. This interface returns post-protection traffic request data by default. Users can use `Filters.mitigatedByWebSecurity` to custom query defended data.
     * @param req DescribeTopL7AnalysisDataRequest
     * @return DescribeTopL7AnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopL7AnalysisDataResponse DescribeTopL7AnalysisData(DescribeTopL7AnalysisDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopL7AnalysisData", DescribeTopL7AnalysisDataResponse.class);
    }

    /**
     *This API is used to query L7 cache analysis topN data. This API is to be deprecated. Please use the <a href="https://www.tencentcloud.com/document/product/1552/80646?from_cn_redirect=1"> DescribeTopL7AnalysisData</a> API.
     * @param req DescribeTopL7CacheDataRequest
     * @return DescribeTopL7CacheDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopL7CacheDataResponse DescribeTopL7CacheData(DescribeTopL7CacheDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopL7CacheData", DescribeTopL7CacheDataResponse.class);
    }

    /**
     *Queries security policy configuration template details
     * @param req DescribeWebSecurityTemplateRequest
     * @return DescribeWebSecurityTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebSecurityTemplateResponse DescribeWebSecurityTemplate(DescribeWebSecurityTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebSecurityTemplate", DescribeWebSecurityTemplateResponse.class);
    }

    /**
     *Queries the security policy configuration template list.
     * @param req DescribeWebSecurityTemplatesRequest
     * @return DescribeWebSecurityTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebSecurityTemplatesResponse DescribeWebSecurityTemplates(DescribeWebSecurityTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebSecurityTemplates", DescribeWebSecurityTemplatesResponse.class);
    }

    /**
     *This API is used to query the results of site configuration item import via the site configuration import API.
     * @param req DescribeZoneConfigImportResultRequest
     * @return DescribeZoneConfigImportResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneConfigImportResultResponse DescribeZoneConfigImportResult(DescribeZoneConfigImportResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZoneConfigImportResult", DescribeZoneConfigImportResultResponse.class);
    }

    /**
     *This API is used to query site-level custom variable configurations, including variable definitions and variable operations. If not configured, both variable definitions and variable operations return empty lists.

If needed, call the DescribeL7AccRules API to query rule-level custom variables.
     * @param req DescribeZoneCustomVariablesRequest
     * @return DescribeZoneCustomVariablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneCustomVariablesResponse DescribeZoneCustomVariables(DescribeZoneCustomVariablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZoneCustomVariables", DescribeZoneCustomVariablesResponse.class);
    }

    /**
     *This API is on an earlier version. EdgeOne has completed a comprehensive upgrade of rule engine APIs. For details, see [DescribeL7AccSetting](https://www.tencentcloud.com/document/product/1552/115819?from_cn_redirect=1).
     * @param req DescribeZoneSettingRequest
     * @return DescribeZoneSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneSettingResponse DescribeZoneSetting(DescribeZoneSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZoneSetting", DescribeZoneSettingResponse.class);
    }

    /**
     *This API is used to query site information you have permission to access. You can filter sites based on different query conditions.
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZones", DescribeZonesResponse.class);
    }

    /**
     *This API is used to terminate a billing plan when you need to stop billing for an Edgeone plan.
> The following conditions must be met to terminate a billing plan:
1. The plan has expired (except for the Enterprise Edition Plan);
2. All sites under the package have been shut down or deleted.

> The site status can be queried through the [Query Site List](https://www.tencentcloud.com/document/product/1552/80713?from_cn_redirect=1) interface.
A site can be deactivated by switching the site to a closed status through the [Switch Site Status](https://www.tencentcloud.com/document/product/1552/80707?from_cn_redirect=1) interface.
A site can be deleted by using the Delete Site API.
     * @param req DestroyPlanRequest
     * @return DestroyPlanResponse
     * @throws TencentCloudSDKException
     */
    public DestroyPlanResponse DestroyPlan(DestroyPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyPlan", DestroyPlanResponse.class);
    }

    /**
     *This API is used to disable origin protection for a site. Once disabled, resources related to the origin will no longer use only the origin IP range provided by origin protection to request your origin, and update notifications on origin IP ranges will stop simultaneously.
     * @param req DisableOriginACLRequest
     * @return DisableOriginACLResponse
     * @throws TencentCloudSDKException
     */
    public DisableOriginACLResponse DisableOriginACL(DisableOriginACLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableOriginACL", DisableOriginACLResponse.class);
    }

    /**
     *This API is used to obtain the offline log download link for a Layer 4 proxy business.
**Note:** EO stores offline logs and provides a download service only when the offline log feature is enabled. For specific features, see the [document](https://www.tencentcloud.com/document/product/1552/73660?from_cn_redirect=1).
     * @param req DownloadL4LogsRequest
     * @return DownloadL4LogsResponse
     * @throws TencentCloudSDKException
     */
    public DownloadL4LogsResponse DownloadL4Logs(DownloadL4LogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadL4Logs", DownloadL4LogsResponse.class);
    }

    /**
     *This API is used to obtain the offline log download link for an L7 domain.
**Note:** EO stores offline logs and provides a download service only when the offline log feature is enabled. For specific features, see the [document](https://www.tencentcloud.com/document/product/1552/73660?from_cn_redirect=1).
     * @param req DownloadL7LogsRequest
     * @return DownloadL7LogsResponse
     * @throws TencentCloudSDKException
     */
    public DownloadL7LogsResponse DownloadL7Logs(DownloadL7LogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadL7Logs", DownloadL7LogsResponse.class);
    }

    /**
     *This API is used to define the structure of a complete site configuration for reference only. Note: This API does not return actual data.
     * @param req DummyParseZoneFullConfigRequest
     * @return DummyParseZoneFullConfigResponse
     * @throws TencentCloudSDKException
     */
    public DummyParseZoneFullConfigResponse DummyParseZoneFullConfig(DummyParseZoneFullConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DummyParseZoneFullConfig", DummyParseZoneFullConfigResponse.class);
    }

    /**
     *This API is used to delete one or more key-value pair data in a specified namespace. Batch deletion supported. Data cannot be recovered after deletion.
     * @param req EdgeKVDeleteRequest
     * @return EdgeKVDeleteResponse
     * @throws TencentCloudSDKException
     */
    public EdgeKVDeleteResponse EdgeKVDelete(EdgeKVDeleteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EdgeKVDelete", EdgeKVDeleteResponse.class);
    }

    /**
     *This API is used to batch read key values from a specified namespace. It supports querying up to 20 keys in a single query.
     * @param req EdgeKVGetRequest
     * @return EdgeKVGetResponse
     * @throws TencentCloudSDKException
     */
    public EdgeKVGetResponse EdgeKVGet(EdgeKVGetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EdgeKVGet", EdgeKVGetResponse.class);
    }

    /**
     *This API is used to list all keys in the specified namespace, with prefix filtering supported. Cursor-based traversal is implemented, and the next cursor is returned for continued querying. It is suitable for traversing all keys in a namespace.
     * @param req EdgeKVListRequest
     * @return EdgeKVListResponse
     * @throws TencentCloudSDKException
     */
    public EdgeKVListResponse EdgeKVList(EdgeKVListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EdgeKVList", EdgeKVListResponse.class);
    }

    /**
     *This API is used to write key-value pair data to a specified namespace, with support for setting expiration time. If the key already exists, the original value is overwritten. If not, a new key-value pair is created.
     * @param req EdgeKVPutRequest
     * @return EdgeKVPutResponse
     * @throws TencentCloudSDKException
     */
    public EdgeKVPutResponse EdgeKVPut(EdgeKVPutRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EdgeKVPut", EdgeKVPutResponse.class);
    }

    /**
     *This API is used to enable origin protection for a site for the first time. After it is enabled, EdgeOne will use specific origin-pull IP ranges to pull from the origin for layer-7 acceleration domains/layer-4 proxy instances.
This API supports two modes: **Automatic Protection Mode** and **Specified Protection Mode**. <li>When **Automatic Protection Mode** is used (L7EnableMode/L4EnableMode is set to all), the acceleration domain list and layer-4 proxy instances under the site will be automatically added to the origin protection list in real time without manual intervention;</li><li>When **Specified Protection Mode** is used (L7EnableMode/L4EnableMode is set to specific), you need to manually specify the resources to be added to origin protection. Unspecified resources will not be added to the origin protection list. If resource adjustment is required, you need to actively call the ModifyOriginACL API to make adjustments.</li>

Instructions for using the Specified Protection Mode:
<li>The maximum number of layer-7 acceleration domains that can be submitted at a time is 200, and the maximum number of layer-4 proxy instances is 100. Mixed submission of layer-7 acceleration domains/layer-4 proxy instances is supported, with a maximum total of 200 instances;</li>
<li>When more than 200 resources need to be enabled, you need to first configure the resources of the first shard through this API, and then configure the remaining shards through the ModifyOriginACL API. For example, if 500 layer-7 acceleration domains need to be added, first use this API to set 200 domains, and then use the ModifyOriginACL API to configure the remaining 300 domains in two batches, with no more than 200 domains per batch.</li>

Note:
- When enabling, accounts on the allowlist can select other origin-pull IP range versions, such as the simplified version, to achieve the effect of pulling from the origin with fewer IP ranges.
- Calling this API is deemed as your agreement to the [Special Agreement on Enabling Origin Protection](https://www.tencentcloud.com/document/product/1552/120141?from_cn_redirect=1);
- Origin-pull IP ranges are subject to change from time to time. EdgeOne will send notifications 14 days, 7 days, 3 days, and 1 day before the change through one or more methods such as in-site messages, SMS, and emails. To ensure that you can receive notifications of origin-pull IP range changes, make sure that you have selected message notifications related to the EdgeOne product in the [Tencent Cloud Message Center Console](https://console.cloud.tencent.com/message) and configured the correct message recipients. For configuration methods, refer to [Message Subscription Management](https://www.tencentcloud.com/document/product/567/43476?from_cn_redirect=1).
     * @param req EnableOriginACLRequest
     * @return EnableOriginACLResponse
     * @throws TencentCloudSDKException
     */
    public EnableOriginACLResponse EnableOriginACL(EnableOriginACLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableOriginACL", EnableOriginACLResponse.class);
    }

    /**
     *This API is used to export site configuration by users based on desired configuration items. The exported configuration is used for import via the site configuration import API.
     * @param req ExportZoneConfigRequest
     * @return ExportZoneConfigResponse
     * @throws TencentCloudSDKException
     */
    public ExportZoneConfigResponse ExportZoneConfig(ExportZoneConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportZoneConfig", ExportZoneConfigResponse.class);
    }

    /**
     *This API is used to operate the runtime environment of an edge function. It supports related settings for environment variables.
After the environment variables are set, they can be used in the function code and function replica code. For details, see [Edge Functions Referencing Environment Variables](https://www.tencentcloud.com/document/product/1552/109151?from_cn_redirect=1#0151fd9a-8b0e-407b-ae37-54553a60ded6).
     * @param req HandleFunctionRuntimeEnvironmentRequest
     * @return HandleFunctionRuntimeEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public HandleFunctionRuntimeEnvironmentResponse HandleFunctionRuntimeEnvironment(HandleFunctionRuntimeEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "HandleFunctionRuntimeEnvironment", HandleFunctionRuntimeEnvironmentResponse.class);
    }

    /**
     *Used to verify site ownership.
     * @param req IdentifyZoneRequest
     * @return IdentifyZoneResponse
     * @throws TencentCloudSDKException
     */
    public IdentifyZoneResponse IdentifyZone(IdentifyZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IdentifyZone", IdentifyZoneResponse.class);
    }

    /**
     *This API is used to quickly import site configuration files. After the import is initiated, the API will return the corresponding task ID (TaskId). Users need to use the site configuration import result query API to obtain the results of this import task.
     * @param req ImportZoneConfigRequest
     * @return ImportZoneConfigResponse
     * @throws TencentCloudSDKException
     */
    public ImportZoneConfigResponse ImportZoneConfig(ImportZoneConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportZoneConfig", ImportZoneConfigResponse.class);
    }

    /**
     *This API is used to purchase additional quotas when the number of sites bound to your plan, the number of rules under "Web Protection - Custom Rules - Precision Matching Policy", or the rules under "Web Protection - Rate Limiting - Precision Rate Limiting Module" reach the plan's quota limit.
> This interface only supports the Enterprise Edition Plan.
     * @param req IncreasePlanQuotaRequest
     * @return IncreasePlanQuotaResponse
     * @throws TencentCloudSDKException
     */
    public IncreasePlanQuotaResponse IncreasePlanQuota(IncreasePlanQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IncreasePlanQuota", IncreasePlanQuotaResponse.class);
    }

    /**
     *Modify acceleration domain name information
     * @param req ModifyAccelerationDomainRequest
     * @return ModifyAccelerationDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccelerationDomainResponse ModifyAccelerationDomain(ModifyAccelerationDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccelerationDomain", ModifyAccelerationDomainResponse.class);
    }

    /**
     *Batch modify accelerated domain status
     * @param req ModifyAccelerationDomainStatusesRequest
     * @return ModifyAccelerationDomainStatusesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccelerationDomainStatusesResponse ModifyAccelerationDomainStatuses(ModifyAccelerationDomainStatusesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccelerationDomainStatuses", ModifyAccelerationDomainStatusesResponse.class);
    }

    /**
     *Modify an alias domain name.
This feature is only supported in the enterprise plan and is currently in beta test. To use it, please [contact us](https://www.tencentcloud.com/contact-us).
     * @param req ModifyAliasDomainRequest
     * @return ModifyAliasDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAliasDomainResponse ModifyAliasDomain(ModifyAliasDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAliasDomain", ModifyAliasDomainResponse.class);
    }

    /**
     *Modify the status of an alias domain name.
This feature is only supported in the enterprise plan and is currently in beta test. To use it, please [contact us](https://www.tencentcloud.com/contact-us).
     * @param req ModifyAliasDomainStatusRequest
     * @return ModifyAliasDomainStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAliasDomainStatusResponse ModifyAliasDomainStatus(ModifyAliasDomainStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAliasDomainStatus", ModifyAliasDomainStatusResponse.class);
    }

    /**
     *This API is on an earlier version. If you want to call it, switch to the latest version. For details, refer to [Modify Layer 4 Proxy Instance].
](https://www.tencentcloud.com/document/product/1552/103411?from_cn_redirect=1) .
     * @param req ModifyApplicationProxyRequest
     * @return ModifyApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyResponse ModifyApplicationProxy(ModifyApplicationProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationProxy", ModifyApplicationProxyResponse.class);
    }

    /**
     *This API is on an earlier version. If you want to call it, switch to the latest version. For details, see Modifying Layer 4 Proxy Forwarding Rules.
](https://www.tencentcloud.com/document/product/1552/103410?from_cn_redirect=1) .
     * @param req ModifyApplicationProxyRuleRequest
     * @return ModifyApplicationProxyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyRuleResponse ModifyApplicationProxyRule(ModifyApplicationProxyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationProxyRule", ModifyApplicationProxyRuleResponse.class);
    }

    /**
     *This API is on an earlier version. If you want to call it, switch to the latest version. For details, see Modifying Layer 4 Proxy Forwarding Rule Status.
](https://www.tencentcloud.com/document/product/1552/103409?from_cn_redirect=1) .
     * @param req ModifyApplicationProxyRuleStatusRequest
     * @return ModifyApplicationProxyRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyRuleStatusResponse ModifyApplicationProxyRuleStatus(ModifyApplicationProxyRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationProxyRuleStatus", ModifyApplicationProxyRuleStatusResponse.class);
    }

    /**
     *This API is on an earlier version. If you want to call it, switch to the latest version. For details, see [modify layer 4 proxy instance status](https://www.tencentcloud.com/document/product/1552/103408?from_cn_redirect=1).
     * @param req ModifyApplicationProxyStatusRequest
     * @return ModifyApplicationProxyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyStatusResponse ModifyApplicationProxyStatus(ModifyApplicationProxyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationProxyStatus", ModifyApplicationProxyStatusResponse.class);
    }

    /**
     *Modification content identifier. Only description modification is supported. The feature is open in the allowlist only.
     * @param req ModifyContentIdentifierRequest
     * @return ModifyContentIdentifierResponse
     * @throws TencentCloudSDKException
     */
    public ModifyContentIdentifierResponse ModifyContentIdentifier(ModifyContentIdentifierRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyContentIdentifier", ModifyContentIdentifierResponse.class);
    }

    /**
     *This API is used to modify a custom response page.
     * @param req ModifyCustomErrorPageRequest
     * @return ModifyCustomErrorPageResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomErrorPageResponse ModifyCustomErrorPage(ModifyCustomErrorPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCustomErrorPage", ModifyCustomErrorPageResponse.class);
    }

    /**
     *This API is used to modify the content of a custom group. GroupType cannot be modified after creation. When modifying entries in the group, you can specify replacement, append, or removal operations through GroupItemOperation.
     * @param req ModifyCustomGroupRequest
     * @return ModifyCustomGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomGroupResponse ModifyCustomGroup(ModifyCustomGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCustomGroup", ModifyCustomGroupResponse.class);
    }

    /**
     *Modify exclusive DDoS protection for a site.
     * @param req ModifyDDoSProtectionRequest
     * @return ModifyDDoSProtectionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSProtectionResponse ModifyDDoSProtection(ModifyDDoSProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDDoSProtection", ModifyDDoSProtectionResponse.class);
    }

    /**
     *You can use this API to batch modify DNS records.
     * @param req ModifyDnsRecordsRequest
     * @return ModifyDnsRecordsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDnsRecordsResponse ModifyDnsRecords(ModifyDnsRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDnsRecords", ModifyDnsRecordsResponse.class);
    }

    /**
     *You can use this API to batch modify the status of DNS records and enable or disable records in batches.
     * @param req ModifyDnsRecordsStatusRequest
     * @return ModifyDnsRecordsStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDnsRecordsStatusResponse ModifyDnsRecordsStatus(ModifyDnsRecordsStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDnsRecordsStatus", ModifyDnsRecordsStatusResponse.class);
    }

    /**
     *This API is used to modify the attribute information of a specified KV namespace. Currently, only namespace description modification is supported.
     * @param req ModifyEdgeKVNamespaceRequest
     * @return ModifyEdgeKVNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdgeKVNamespaceResponse ModifyEdgeKVNamespace(ModifyEdgeKVNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdgeKVNamespace", ModifyEdgeKVNamespaceResponse.class);
    }

    /**
     *This API is used to modify an edge function. It supports modifying the function content and description. The function will take effect immediately after modification and redeployment.
     * @param req ModifyFunctionRequest
     * @return ModifyFunctionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFunctionResponse ModifyFunction(ModifyFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFunction", ModifyFunctionResponse.class);
    }

    /**
     *Modify the binding relationship between edge functions and components. Four operation modes are supported: bind, bind-override, unbind, and rebind. Manage function component binding relationships by specifying the operation type and component list.
     * @param req ModifyFunctionComponentBindingsRequest
     * @return ModifyFunctionComponentBindingsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFunctionComponentBindingsResponse ModifyFunctionComponentBindings(ModifyFunctionComponentBindingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFunctionComponentBindings", ModifyFunctionComponentBindingsResponse.class);
    }

    /**
     *This API is used to modify the content and description of a specified edge function replica.
     * @param req ModifyFunctionReplicaRequest
     * @return ModifyFunctionReplicaResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFunctionReplicaResponse ModifyFunctionReplica(ModifyFunctionReplicaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFunctionReplica", ModifyFunctionReplicaResponse.class);
    }

    /**
     *This API is used to modify a trigger rule for an edge function. It supports modifying rule conditions, execution functions, and description. You can first use the DescribeFunctionRules API to get the RuleId of the rule to be modified, then input the modified rule content. The original rule content will be overwritten.
     * @param req ModifyFunctionRuleRequest
     * @return ModifyFunctionRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFunctionRuleResponse ModifyFunctionRule(ModifyFunctionRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFunctionRule", ModifyFunctionRuleResponse.class);
    }

    /**
     *This API is used to modify the priority of trigger rules for an edge function.
     * @param req ModifyFunctionRulePriorityRequest
     * @return ModifyFunctionRulePriorityResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFunctionRulePriorityResponse ModifyFunctionRulePriority(ModifyFunctionRulePriorityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFunctionRulePriority", ModifyFunctionRulePriorityResponse.class);
    }

    /**
     *After domain name creation is completed, you can configure a self-owned certificate for the domain name, or alternatively use the free certificate (https://www.tencentcloud.com/document/product/1552/90437?from_cn_redirect=1) offered by EdgeOne.
If you need to configure a self-owned certificate, upload the certificate to the [SSL certificate console](https://console.cloud.tencent.com/certoverview) first, then import the corresponding certificate ID in this API. For details, see [Deploy self-owned certificates to EdgeOne domain names].
](https://www.tencentcloud.com/document/product/1552/88874?from_cn_redirect=1).
     * @param req ModifyHostsCertificateRequest
     * @return ModifyHostsCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostsCertificateResponse ModifyHostsCertificate(ModifyHostsCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHostsCertificate", ModifyHostsCertificateResponse.class);
    }

    /**
     *Modify an inference service to support updates to the listening port, request path, container image, resource configuration, and description. Only passed parameters will be modified, while unpassed parameters remain unchanged.
     * @param req ModifyInferenceServiceRequest
     * @return ModifyInferenceServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInferenceServiceResponse ModifyInferenceService(ModifyInferenceServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInferenceService", ModifyInferenceServiceResponse.class);
    }

    /**
     *This API is used to modify the configuration of a layer 4 proxy instance.
     * @param req ModifyL4ProxyRequest
     * @return ModifyL4ProxyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4ProxyResponse ModifyL4Proxy(ModifyL4ProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL4Proxy", ModifyL4ProxyResponse.class);
    }

    /**
     *This API is used to modify Layer 4 proxy forwarding rules, supporting both individual and batch modification.
     * @param req ModifyL4ProxyRulesRequest
     * @return ModifyL4ProxyRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4ProxyRulesResponse ModifyL4ProxyRules(ModifyL4ProxyRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL4ProxyRules", ModifyL4ProxyRulesResponse.class);
    }

    /**
     *This API is used to enable or disable the status of layer-4 proxy rules, supporting both individual and batch operation.
     * @param req ModifyL4ProxyRulesStatusRequest
     * @return ModifyL4ProxyRulesStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4ProxyRulesStatusResponse ModifyL4ProxyRulesStatus(ModifyL4ProxyRulesStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL4ProxyRulesStatus", ModifyL4ProxyRulesStatusResponse.class);
    }

    /**
     *This API is used to enable or disable an L4 proxy instance.
     * @param req ModifyL4ProxyStatusRequest
     * @return ModifyL4ProxyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4ProxyStatusResponse ModifyL4ProxyStatus(ModifyL4ProxyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL4ProxyStatus", ModifyL4ProxyStatusResponse.class);
    }

    /**
     *This API is used to modify a rule in the [rule engine](https://www.tencentcloud.com/document/product/1552/70901?from_cn_redirect=1). Only one rule can be modified at a time.
     * @param req ModifyL7AccRuleRequest
     * @return ModifyL7AccRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL7AccRuleResponse ModifyL7AccRule(ModifyL7AccRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL7AccRule", ModifyL7AccRuleResponse.class);
    }

    /**
     *This API is used to modify the priority of the rule list in the rule engine (https://www.tencentcloud.com/document/product/1552/70901?from_cn_redirect=1). It requires the input of the complete rule ID list under the site ID. The rule ID list can be obtained through the API for querying layer-7 acceleration rules (https://www.tencentcloud.com/document/product/1552/115820?from_cn_redirect=1). The final priority order will be adjusted to the order of the rule ID list, executed from front to back.
     * @param req ModifyL7AccRulePriorityRequest
     * @return ModifyL7AccRulePriorityResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL7AccRulePriorityResponse ModifyL7AccRulePriority(ModifyL7AccRulePriorityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL7AccRulePriority", ModifyL7AccRulePriorityResponse.class);
    }

    /**
     *This API is used to modify the global configuration of site acceleration.
     * @param req ModifyL7AccSettingRequest
     * @return ModifyL7AccSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL7AccSettingResponse ModifyL7AccSetting(ModifyL7AccSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL7AccSetting", ModifyL7AccSettingResponse.class);
    }

    /**
     *This API is used to modify LoadBalancer configuration. The load balancing feature is in beta test. If you need to use it, [contact us](https://www.tencentcloud.com/contact-us).
     * @param req ModifyLoadBalancerRequest
     * @return ModifyLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerResponse ModifyLoadBalancer(ModifyLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancer", ModifyLoadBalancerResponse.class);
    }

    /**
     *This API is used to modify multi-channel security acceleration gateway information, such as name, gateway ID, IP, and port.
     * @param req ModifyMultiPathGatewayRequest
     * @return ModifyMultiPathGatewayResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMultiPathGatewayResponse ModifyMultiPathGateway(ModifyMultiPathGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMultiPathGateway", ModifyMultiPathGatewayResponse.class);
    }

    /**
     *This API is used to modify the configuration for connecting lines to the multi-channel security acceleration gateway, including EdgeOne Layer 4 proxy lines and custom lines.
     * @param req ModifyMultiPathGatewayLineRequest
     * @return ModifyMultiPathGatewayLineResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMultiPathGatewayLineResponse ModifyMultiPathGatewayLine(ModifyMultiPathGatewayLineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMultiPathGatewayLine", ModifyMultiPathGatewayLineResponse.class);
    }

    /**
     *This API is used to modify the key for integrating a multi-channel security acceleration gateway. Customers sign with the integration key to access the multi-channel security acceleration gateway. After modification, the original key becomes invalid.
     * @param req ModifyMultiPathGatewaySecretKeyRequest
     * @return ModifyMultiPathGatewaySecretKeyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMultiPathGatewaySecretKeyResponse ModifyMultiPathGatewaySecretKey(ModifyMultiPathGatewaySecretKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMultiPathGatewaySecretKey", ModifyMultiPathGatewaySecretKeyResponse.class);
    }

    /**
     *This API is used to update the multi-channel security gateway status.
     * @param req ModifyMultiPathGatewayStatusRequest
     * @return ModifyMultiPathGatewayStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMultiPathGatewayStatusResponse ModifyMultiPathGatewayStatus(ModifyMultiPathGatewayStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMultiPathGatewayStatus", ModifyMultiPathGatewayStatusResponse.class);
    }

    /**
     *This API is used to modify the origin protection configuration of a site. The following operations are supported: <li>**Resource addition and deletion**: enable or disable origin-pull from specific origin IP ranges for layer-7 accelerated domains/layer-4 proxy instances. This applies to resource adjustment in **specified protection mode**, and unspecified resources will not change;</li><li>**Mode switching**: adjust the origin protection mode of layer-7 accelerated domains/layer-4 proxy instances. After switching to all, the list of accelerated domains or layer-4 proxy instances under the site will be automatically added to the origin protection list in real time, and subsequent resource changes will also be automatically adjusted without manual intervention; after switching to specific, only the mode is changed, and resources already included in protection remain unchanged;</li><li>**IP range version switching**: for whitelisted customers, it supports switching to other available origin protection IP range versions, such as the simplified version, to reduce origin-pull IP ranges.</li>

Instructions for specified protection mode:
<li>The maximum number of layer-7 accelerated domains that can be submitted at a time is 200, and the maximum number of layer-4 proxy instances is 100. Mixed submission of layer-7 accelerated domains/layer-4 proxy instances is supported, with a maximum total of 200 instances;</li>
<li>When more than 200 resources need to be changed, submit them in batches through this API. For example, to add 500 layer-7 accelerated domains, first submit 200 domains through this API, and then submit the remaining 300 domains in two batches, with no more than 200 domains each time.</li>
     * @param req ModifyOriginACLRequest
     * @return ModifyOriginACLResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOriginACLResponse ModifyOriginACL(ModifyOriginACLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOriginACL", ModifyOriginACLResponse.class);
    }

    /**
     *Modify origin group configuration. Newly submitted origin records will overwrite the original origin records in the origin group.
     * @param req ModifyOriginGroupRequest
     * @return ModifyOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOriginGroupResponse ModifyOriginGroup(ModifyOriginGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOriginGroup", ModifyOriginGroupResponse.class);
    }

    /**
     *Modify the plan settings. Currently, only the auto-renewal switch of prepaid plans can be modified.
     * @param req ModifyPlanRequest
     * @return ModifyPlanResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPlanResponse ModifyPlan(ModifyPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPlan", ModifyPlanResponse.class);
    }

    /**
     *This API is used to configure origin-pull rate limiting. This feature is in allowlist beta test.
This API is used to create, modify, and delete preheated origin-pull rate limits. Each account supports up to 100 limits.
     * @param req ModifyPrefetchOriginLimitRequest
     * @return ModifyPrefetchOriginLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrefetchOriginLimitResponse ModifyPrefetchOriginLimit(ModifyPrefetchOriginLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrefetchOriginLimit", ModifyPrefetchOriginLimitResponse.class);
    }

    /**
     *This API is used to modify the configuration of a real-time log delivery task. It has the following limits:
<ul>
<li>The destination type (`TaskType`) of a real-time log delivery task cannot be modified;</li>
<li>The data delivery type (`LogType`) cannot be modified;</li>
<li>The data delivery region (`Area`) cannot be modified;</li>
<li>When the destination of the original real-time log delivery task is Tencent Cloud CLS, the destination details such as the log set and log topic cannot be modified.</li>
</ul>
     * @param req ModifyRealtimeLogDeliveryTaskRequest
     * @return ModifyRealtimeLogDeliveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRealtimeLogDeliveryTaskResponse ModifyRealtimeLogDeliveryTask(ModifyRealtimeLogDeliveryTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRealtimeLogDeliveryTask", ModifyRealtimeLogDeliveryTaskResponse.class);
    }

    /**
     *This API is on an earlier version for modifying rule engine APIs. EdgeOne comprehensively upgraded rule engine-related APIs on January 21, 2025. For details on the new version API for modifying layer-7 acceleration rules, refer to [ModifyL7AccRule](https://www.tencentcloud.com/document/product/1552/115818?from_cn_redirect=1).
<p style="color: red;">Note: Starting from January 21, 2025, the legacy version API will stop update and iteration. New features will only be provided in the latest version API. The existing capacity supported by the legacy version API will not be affected. To avoid data field conflict when using the legacy version API, migrate to the latest version rule engine API as soon as possible.</p>
     * @param req ModifyRuleRequest
     * @return ModifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleResponse ModifyRule(ModifyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRule", ModifyRuleResponse.class);
    }

    /**
     *This API is used to modify API resources.
     * @param req ModifySecurityAPIResourceRequest
     * @return ModifySecurityAPIResourceResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityAPIResourceResponse ModifySecurityAPIResource(ModifySecurityAPIResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityAPIResource", ModifySecurityAPIResourceResponse.class);
    }

    /**
     *This API is used to modify API services.
     * @param req ModifySecurityAPIServiceRequest
     * @return ModifySecurityAPIServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityAPIServiceResponse ModifySecurityAPIService(ModifySecurityAPIServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityAPIService", ModifySecurityAPIServiceResponse.class);
    }

    /**
     *Modify client authentication options.
     * @param req ModifySecurityClientAttesterRequest
     * @return ModifySecurityClientAttesterResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityClientAttesterResponse ModifySecurityClientAttester(ModifySecurityClientAttesterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityClientAttester", ModifySecurityClientAttesterResponse.class);
    }

    /**
     *Modifies a security IP group.
     * @param req ModifySecurityIPGroupRequest
     * @return ModifySecurityIPGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityIPGroupResponse ModifySecurityIPGroup(ModifySecurityIPGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityIPGroup", ModifySecurityIPGroupResponse.class);
    }

    /**
     *This API is used to modify JavaScript injection rules.
     * @param req ModifySecurityJSInjectionRuleRequest
     * @return ModifySecurityJSInjectionRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityJSInjectionRuleResponse ModifySecurityJSInjectionRule(ModifySecurityJSInjectionRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityJSInjectionRule", ModifySecurityJSInjectionRuleResponse.class);
    }

    /**
     *Modify Web & Bot security configuration.
     * @param req ModifySecurityPolicyRequest
     * @return ModifySecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityPolicyResponse ModifySecurityPolicy(ModifySecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityPolicy", ModifySecurityPolicyResponse.class);
    }

    /**
     *This API is used to modify a shared CNAME. Currently, it only supports modifying the description and settings of a shared CNAME, and associating an IP SSL domain name with an IP SSL shared CNAME. Once created, a shared CNAME itself cannot be modified. This feature is in beta test.
     * @param req ModifySharedCNAMERequest
     * @return ModifySharedCNAMEResponse
     * @throws TencentCloudSDKException
     */
    public ModifySharedCNAMEResponse ModifySharedCNAME(ModifySharedCNAMERequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySharedCNAME", ModifySharedCNAMEResponse.class);
    }

    /**
     *Modifies a security policy configuration template
     * @param req ModifyWebSecurityTemplateRequest
     * @return ModifyWebSecurityTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebSecurityTemplateResponse ModifyWebSecurityTemplate(ModifyWebSecurityTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebSecurityTemplate", ModifyWebSecurityTemplateResponse.class);
    }

    /**
     *Modifies site information.
     * @param req ModifyZoneRequest
     * @return ModifyZoneResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneResponse ModifyZone(ModifyZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyZone", ModifyZoneResponse.class);
    }

    /**
     *This API is used to manage site-level custom variables, supporting the creation, modification, and deletion of variable definitions and variable operations. The submitted list will override the corresponding existing configuration. To clear the configuration, pass in an empty list. Configuration items not passed in remain unchanged. The default values for variable definitions and variable operations are both empty.

For rule-level custom variable related operations, call the CreateL7AccRules or ModifyL7AccRule API.
     * @param req ModifyZoneCustomVariablesRequest
     * @return ModifyZoneCustomVariablesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneCustomVariablesResponse ModifyZoneCustomVariables(ModifyZoneCustomVariablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyZoneCustomVariables", ModifyZoneCustomVariablesResponse.class);
    }

    /**
     *This API is on an earlier version. EdgeOne has completed a comprehensive upgrade of rule engine APIs. For details, see [ModifyL7AccSetting](https://www.tencentcloud.com/document/product/1552/115817?from_cn_redirect=1).
     * @param req ModifyZoneSettingRequest
     * @return ModifyZoneSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneSettingResponse ModifyZoneSetting(ModifyZoneSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyZoneSetting", ModifyZoneSettingResponse.class);
    }

    /**
     *Used to enable or disable a site.
     * @param req ModifyZoneStatusRequest
     * @return ModifyZoneStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneStatusResponse ModifyZoneStatus(ModifyZoneStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyZoneStatus", ModifyZoneStatusResponse.class);
    }

    /**
     *This API is used to modify the working mode of each configuration module under a site. Each configuration module of a site can enable version management mode or immediate effect mode by configuration group dimension. For details, see Version Management (https://www.tencentcloud.com/document/product/1552/113690?from_cn_redirect=1).
     * @param req ModifyZoneWorkModeRequest
     * @return ModifyZoneWorkModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneWorkModeResponse ModifyZoneWorkMode(ModifyZoneWorkModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyZoneWorkMode", ModifyZoneWorkModeResponse.class);
    }

    /**
     *Operate an inference service domain name. You can stop, enable, and delete it. Resources cannot be recovered after deletion.
     * @param req OperateInferenceDomainRequest
     * @return OperateInferenceDomainResponse
     * @throws TencentCloudSDKException
     */
    public OperateInferenceDomainResponse OperateInferenceDomain(OperateInferenceDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OperateInferenceDomain", OperateInferenceDomainResponse.class);
    }

    /**
     *Operate an inference service. You can stop, start, and delete it. Resources cannot be recovered after deletion.
     * @param req OperateInferenceServiceRequest
     * @return OperateInferenceServiceResponse
     * @throws TencentCloudSDKException
     */
    public OperateInferenceServiceResponse OperateInferenceService(OperateInferenceServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OperateInferenceService", OperateInferenceServiceResponse.class);
    }

    /**
     *This API is used to refresh the key of a multi-channel security acceleration gateway. Customers integrate with the multi-channel security acceleration gateway based on key signatures. Each site contains only one key, which can be used to integrate all gateways under the site. After the key is refreshed, the original key becomes invalid.
     * @param req RefreshMultiPathGatewaySecretKeyRequest
     * @return RefreshMultiPathGatewaySecretKeyResponse
     * @throws TencentCloudSDKException
     */
    public RefreshMultiPathGatewaySecretKeyResponse RefreshMultiPathGatewaySecretKey(RefreshMultiPathGatewaySecretKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RefreshMultiPathGatewaySecretKey", RefreshMultiPathGatewaySecretKeyResponse.class);
    }

    /**
     *When your plan needs to be extended, you can use this API to renew it. Plan renewal is only supported for the Personal, Basic, and Standard Editions.
> For cost details, refer to [Plan Cost](https://www.tencentcloud.com/document/product/1552/94158?from_cn_redirect=1).
     * @param req RenewPlanRequest
     * @return RenewPlanResponse
     * @throws TencentCloudSDKException
     */
    public RenewPlanResponse RenewPlan(RenewPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewPlan", RenewPlanResponse.class);
    }

    /**
     *When you need features available only in higher-tier plans, you can upgrade your plan through this interface. Upgrades are only supported for Personal and Basic Edition Plans.
> For differences between different types of Edgeone billing plans, see Edgeone billing plan comparison (https://www.tencentcloud.com/document/product/1552/94165?from_cn_redirect=1)
For billing package upgrade rules and pricing details, see Edgeone billing package upgrade instructions (https://www.tencentcloud.com/document/product/1552/95291?from_cn_redirect=1)
If your plan needs to upgrade to the Enterprise Edition, please [contact us](https://www.tencentcloud.com/contact-us).
     * @param req UpgradePlanRequest
     * @return UpgradePlanResponse
     * @throws TencentCloudSDKException
     */
    public UpgradePlanResponse UpgradePlan(UpgradePlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradePlan", UpgradePlanResponse.class);
    }

    /**
     *In CNAME access mode, you need to verify the ownership of the site or domain name. This API is used to trigger the verification. If the site passes ownership verification, no need to verify again when adding domains subsequently. For details, see [Site/Domain Name Ownership Verification](https://www.tencentcloud.com/document/product/1552/70789?from_cn_redirect=1).

In NS access mode, you can also query through this API whether the NS server switch is successful. For details, see [Modify DNS Server](https://www.tencentcloud.com/document/product/1552/90452?from_cn_redirect=1).
     * @param req VerifyOwnershipRequest
     * @return VerifyOwnershipResponse
     * @throws TencentCloudSDKException
     */
    public VerifyOwnershipResponse VerifyOwnership(VerifyOwnershipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyOwnership", VerifyOwnershipResponse.class);
    }

}
