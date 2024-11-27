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
package com.tencentcloudapi.waf.v20180125;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.waf.v20180125.models.*;

public class WafClient extends AbstractClient{
    private static String endpoint = "waf.tencentcloudapi.com";
    private static String service = "waf";
    private static String version = "2018-01-25";
    
    public WafClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public WafClient(Credential credential, String region, ClientProfile profile) {
        super(WafClient.endpoint, WafClient.version, credential, region, profile);
    }

    /**
     *Add tamper-proof URL
     * @param req AddAntiFakeUrlRequest
     * @return AddAntiFakeUrlResponse
     * @throws TencentCloudSDKException
     */
    public AddAntiFakeUrlResponse AddAntiFakeUrl(AddAntiFakeUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddAntiFakeUrl", AddAntiFakeUrlResponse.class);
    }

    /**
     *Add information leakage prevention rule
     * @param req AddAntiInfoLeakRulesRequest
     * @return AddAntiInfoLeakRulesResponse
     * @throws TencentCloudSDKException
     */
    public AddAntiInfoLeakRulesResponse AddAntiInfoLeakRules(AddAntiInfoLeakRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddAntiInfoLeakRules", AddAntiInfoLeakRulesResponse.class);
    }

    /**
     *Add access control (from custom policy)
     * @param req AddCustomRuleRequest
     * @return AddCustomRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddCustomRuleResponse AddCustomRule(AddCustomRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddCustomRule", AddCustomRuleResponse.class);
    }

    /**
     *Add precision allowlist rules
     * @param req AddCustomWhiteRuleRequest
     * @return AddCustomWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddCustomWhiteRuleResponse AddCustomWhiteRule(AddCustomWhiteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddCustomWhiteRule", AddCustomWhiteRuleResponse.class);
    }

    /**
     *Add SaaS WAF protection domain
     * @param req AddSpartaProtectionRequest
     * @return AddSpartaProtectionResponse
     * @throws TencentCloudSDKException
     */
    public AddSpartaProtectionResponse AddSpartaProtection(AddSpartaProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddSpartaProtection", AddSpartaProtectionResponse.class);
    }

    /**
     *Billing Resource Purchase, Renewal Order API
     * @param req CreateDealsRequest
     * @return CreateDealsResponse
     * @throws TencentCloudSDKException
     */
    public CreateDealsResponse CreateDeals(CreateDealsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDeals", CreateDealsResponse.class);
    }

    /**
     *Add a protection domain in CLB-WAF
     * @param req CreateHostRequest
     * @return CreateHostResponse
     * @throws TencentCloudSDKException
     */
    public CreateHostResponse CreateHost(CreateHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHost", CreateHostResponse.class);
    }

    /**
     *This API is used to add WAF IP allowlists/blocklists.
     * @param req CreateIpAccessControlRequest
     * @return CreateIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public CreateIpAccessControlResponse CreateIpAccessControl(CreateIpAccessControlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIpAccessControl", CreateIpAccessControlResponse.class);
    }

    /**
     *Delete tamper-proof URL
     * @param req DeleteAntiFakeUrlRequest
     * @return DeleteAntiFakeUrlResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAntiFakeUrlResponse DeleteAntiFakeUrl(DeleteAntiFakeUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAntiFakeUrl", DeleteAntiFakeUrlResponse.class);
    }

    /**
     *Delete information leakage prevention rule
     * @param req DeleteAntiInfoLeakRuleRequest
     * @return DeleteAntiInfoLeakRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAntiInfoLeakRuleResponse DeleteAntiInfoLeakRule(DeleteAntiInfoLeakRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAntiInfoLeakRule", DeleteAntiInfoLeakRuleResponse.class);
    }

    /**
     *WAF CC V2 deletion API
     * @param req DeleteCCRuleRequest
     * @return DeleteCCRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCCRuleResponse DeleteCCRule(DeleteCCRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCCRule", DeleteCCRuleResponse.class);
    }

    /**
     *Delete custom rule
     * @param req DeleteCustomRuleRequest
     * @return DeleteCustomRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomRuleResponse DeleteCustomRule(DeleteCustomRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCustomRule", DeleteCustomRuleResponse.class);
    }

    /**
     *Delete precision allowlist rules
     * @param req DeleteCustomWhiteRuleRequest
     * @return DeleteCustomWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomWhiteRuleResponse DeleteCustomWhiteRule(DeleteCustomWhiteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCustomWhiteRule", DeleteCustomWhiteRuleResponse.class);
    }

    /**
     *This API is used to delete a domain name protected by CLB WAF. Batch operation is supported.
     * @param req DeleteHostRequest
     * @return DeleteHostResponse
     * @throws TencentCloudSDKException
     */
    public DeleteHostResponse DeleteHost(DeleteHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteHost", DeleteHostResponse.class);
    }

    /**
     *This API is used to delete latest versions of WAF IP allowlists/blocklists.
     * @param req DeleteIpAccessControlV2Request
     * @return DeleteIpAccessControlV2Response
     * @throws TencentCloudSDKException
     */
    public DeleteIpAccessControlV2Response DeleteIpAccessControlV2(DeleteIpAccessControlV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIpAccessControlV2", DeleteIpAccessControlV2Response.class);
    }

    /**
     *Delete CC attack session settings
     * @param req DeleteSessionRequest
     * @return DeleteSessionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSessionResponse DeleteSession(DeleteSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSession", DeleteSessionResponse.class);
    }

    /**
     *This API is used to delete a domain name protected by SaaS WAF.
     * @param req DeleteSpartaProtectionRequest
     * @return DeleteSpartaProtectionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSpartaProtectionResponse DeleteSpartaProtection(DeleteSpartaProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSpartaProtection", DeleteSpartaProtectionResponse.class);
    }

    /**
     *Obtain a tamper-proof URL
     * @param req DescribeAntiFakeRulesRequest
     * @return DescribeAntiFakeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAntiFakeRulesResponse DescribeAntiFakeRules(DescribeAntiFakeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAntiFakeRules", DescribeAntiFakeRulesResponse.class);
    }

    /**
     *Obtain the information leakage prevention rule list
     * @param req DescribeAntiInfoLeakageRulesRequest
     * @return DescribeAntiInfoLeakageRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAntiInfoLeakageRulesResponse DescribeAntiInfoLeakageRules(DescribeAntiInfoLeakageRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAntiInfoLeakageRules", DescribeAntiInfoLeakageRulesResponse.class);
    }

    /**
     *This API is used to describe the attack overview.
     * @param req DescribeAttackOverviewRequest
     * @return DescribeAttackOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackOverviewResponse DescribeAttackOverview(DescribeAttackOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackOverview", DescribeAttackOverviewResponse.class);
    }

    /**
     *Query the top N attack types for a specified domain
     * @param req DescribeAttackTypeRequest
     * @return DescribeAttackTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackTypeResponse DescribeAttackType(DescribeAttackTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackType", DescribeAttackTypeResponse.class);
    }

    /**
     *This API is used to query the IP blocklist and allowlist for WAF batch protection.
     * @param req DescribeBatchIpAccessControlRequest
     * @return DescribeBatchIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchIpAccessControlResponse DescribeBatchIpAccessControl(DescribeBatchIpAccessControlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBatchIpAccessControl", DescribeBatchIpAccessControlResponse.class);
    }

    /**
     *WAF CC V2 query API
     * @param req DescribeCCRuleRequest
     * @return DescribeCCRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCRuleResponse DescribeCCRule(DescribeCCRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCCRule", DescribeCCRuleResponse.class);
    }

    /**
     *Query CC rules based on multiple conditions
     * @param req DescribeCCRuleListRequest
     * @return DescribeCCRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCRuleListResponse DescribeCCRuleList(DescribeCCRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCCRuleList", DescribeCCRuleListResponse.class);
    }

    /**
     *Obtain certificate inspection result
     * @param req DescribeCertificateVerifyResultRequest
     * @return DescribeCertificateVerifyResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificateVerifyResultResponse DescribeCertificateVerifyResult(DescribeCertificateVerifyResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCertificateVerifyResult", DescribeCertificateVerifyResultResponse.class);
    }

    /**
     *Query SaaS WAF cipher suite information
     * @param req DescribeCiphersDetailRequest
     * @return DescribeCiphersDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCiphersDetailResponse DescribeCiphersDetail(DescribeCiphersDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCiphersDetail", DescribeCiphersDetailResponse.class);
    }

    /**
     *Obtain the access control policy list in the protection configuration
     * @param req DescribeCustomRuleListRequest
     * @return DescribeCustomRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomRuleListResponse DescribeCustomRuleList(DescribeCustomRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomRuleList", DescribeCustomRuleListResponse.class);
    }

    /**
     *Obtain the precision allowlist policy list in the protection configuration
     * @param req DescribeCustomWhiteRuleRequest
     * @return DescribeCustomWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomWhiteRuleResponse DescribeCustomWhiteRule(DescribeCustomWhiteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomWhiteRule", DescribeCustomWhiteRuleResponse.class);
    }

    /**
     *Obtain domain overview
     * @param req DescribeDomainCountInfoRequest
     * @return DescribeDomainCountInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainCountInfoResponse DescribeDomainCountInfo(DescribeDomainCountInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainCountInfo", DescribeDomainCountInfoResponse.class);
    }

    /**
     *Obtain CLB WAF domain details
     * @param req DescribeDomainDetailsClbRequest
     * @return DescribeDomainDetailsClbResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainDetailsClbResponse DescribeDomainDetailsClb(DescribeDomainDetailsClbRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainDetailsClb", DescribeDomainDetailsClbResponse.class);
    }

    /**
     *Query individual SaaS WAF domain details
     * @param req DescribeDomainDetailsSaasRequest
     * @return DescribeDomainDetailsSaasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainDetailsSaasResponse DescribeDomainDetailsSaas(DescribeDomainDetailsSaasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainDetailsSaas", DescribeDomainDetailsSaasResponse.class);
    }

    /**
     *Obtain the result of adding domain operation
     * @param req DescribeDomainVerifyResultRequest
     * @return DescribeDomainVerifyResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainVerifyResultResponse DescribeDomainVerifyResult(DescribeDomainVerifyResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainVerifyResult", DescribeDomainVerifyResultResponse.class);
    }

    /**
     *Query detailed information of all user domains
     * @param req DescribeDomainsRequest
     * @return DescribeDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainsResponse DescribeDomains(DescribeDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomains", DescribeDomainsResponse.class);
    }

    /**
     *Obtain discovered domain name list API
     * @param req DescribeFindDomainListRequest
     * @return DescribeFindDomainListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFindDomainListResponse DescribeFindDomainList(DescribeFindDomainListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFindDomainList", DescribeFindDomainListResponse.class);
    }

    /**
     *Query various conditions of cluster analysis
     * @param req DescribeHistogramRequest
     * @return DescribeHistogramResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHistogramResponse DescribeHistogram(DescribeHistogramRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHistogram", DescribeHistogramResponse.class);
    }

    /**
     *Obtain protection domain details in CLB-WAF
     * @param req DescribeHostRequest
     * @return DescribeHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostResponse DescribeHost(DescribeHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHost", DescribeHostResponse.class);
    }

    /**
     *Firstly verify when adding a domain whether a package has been purchased, whether the limit of purchased package has not been reached, and whether the domain has already been added
     * @param req DescribeHostLimitRequest
     * @return DescribeHostLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostLimitResponse DescribeHostLimit(DescribeHostLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostLimit", DescribeHostLimitResponse.class);
    }

    /**
     *Obtain protection domain list in CLB-WAF
     * @param req DescribeHostsRequest
     * @return DescribeHostsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostsResponse DescribeHosts(DescribeHostsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHosts", DescribeHostsResponse.class);
    }

    /**
     *Query detailed information of all user instances
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *WAF IP blocklist/allowlist query
     * @param req DescribeIpAccessControlRequest
     * @return DescribeIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpAccessControlResponse DescribeIpAccessControl(DescribeIpAccessControlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIpAccessControl", DescribeIpAccessControlResponse.class);
    }

    /**
     *Query the switch status of each WAF basic security module, check if each module is enabled
     * @param req DescribeModuleStatusRequest
     * @return DescribeModuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModuleStatusResponse DescribeModuleStatus(DescribeModuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModuleStatus", DescribeModuleStatusResponse.class);
    }

    /**
     *View protected object list
     * @param req DescribeObjectsRequest
     * @return DescribeObjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeObjectsResponse DescribeObjects(DescribeObjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeObjects", DescribeObjectsResponse.class);
    }

    /**
     *Query business and attack summary trends
     * @param req DescribePeakPointsRequest
     * @return DescribePeakPointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePeakPointsResponse DescribePeakPoints(DescribePeakPointsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePeakPoints", DescribePeakPointsResponse.class);
    }

    /**
     *Obtain protection status and the effective instance ID
     * @param req DescribePolicyStatusRequest
     * @return DescribePolicyStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyStatusResponse DescribePolicyStatus(DescribePolicyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePolicyStatus", DescribePolicyStatusResponse.class);
    }

    /**
     *Obtain the SaaS-type WAF protection port list
     * @param req DescribePortsRequest
     * @return DescribePortsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePortsResponse DescribePorts(DescribePortsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePorts", DescribePortsResponse.class);
    }

    /**
     *Obtain specific specification limits for each module
     * @param req DescribeRuleLimitRequest
     * @return DescribeRuleLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleLimitResponse DescribeRuleLimit(DescribeRuleLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleLimit", DescribeRuleLimitResponse.class);
    }

    /**
     *WAF session definition query API
     * @param req DescribeSessionRequest
     * @return DescribeSessionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSessionResponse DescribeSession(DescribeSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSession", DescribeSessionResponse.class);
    }

    /**
     *WAF Sparta - Obtain protection domain information
     * @param req DescribeSpartaProtectionInfoRequest
     * @return DescribeSpartaProtectionInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpartaProtectionInfoResponse DescribeSpartaProtectionInfo(DescribeSpartaProtectionInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpartaProtectionInfo", DescribeSpartaProtectionInfoResponse.class);
    }

    /**
     *This API is used to query TLS versions supported by SaaS WAF.
     * @param req DescribeTlsVersionRequest
     * @return DescribeTlsVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTlsVersionResponse DescribeTlsVersion(DescribeTlsVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTlsVersion", DescribeTlsVersionResponse.class);
    }

    /**
     *Query top 5 attack domains
     * @param req DescribeTopAttackDomainRequest
     * @return DescribeTopAttackDomainResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopAttackDomainResponse DescribeTopAttackDomain(DescribeTopAttackDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopAttackDomain", DescribeTopAttackDomainResponse.class);
    }

    /**
     *During the addition and modification of Domain Configuration for CLB-type WAF, it is required to display the supported region list for CLB-type WAF (clb-waf) through DescribeUserClbWafRegions to obtain the currently available region list for the customer.
     * @param req DescribeUserClbWafRegionsRequest
     * @return DescribeUserClbWafRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserClbWafRegionsResponse DescribeUserClbWafRegions(DescribeUserClbWafRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserClbWafRegions", DescribeUserClbWafRegionsResponse.class);
    }

    /**
     *Query Domain Information for SaaS and CLB
     * @param req DescribeUserDomainInfoRequest
     * @return DescribeUserDomainInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserDomainInfoResponse DescribeUserDomainInfo(DescribeUserDomainInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserDomainInfo", DescribeUserDomainInfoResponse.class);
    }

    /**
     *Obtain the user protection rule level
     * @param req DescribeUserLevelRequest
     * @return DescribeUserLevelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserLevelResponse DescribeUserLevel(DescribeUserLevelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserLevel", DescribeUserLevelResponse.class);
    }

    /**
     *Query VIP information based on filter criteria
     * @param req DescribeVipInfoRequest
     * @return DescribeVipInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVipInfoResponse DescribeVipInfo(DescribeVipInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVipInfo", DescribeVipInfoResponse.class);
    }

    /**
     *Obtain the webshell status of a domain
     * @param req DescribeWebshellStatusRequest
     * @return DescribeWebshellStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebshellStatusResponse DescribeWebshellStatus(DescribeWebshellStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebshellStatus", DescribeWebshellStatusResponse.class);
    }

    /**
     *Refresh a tamper-proof URL
     * @param req FreshAntiFakeUrlRequest
     * @return FreshAntiFakeUrlResponse
     * @throws TencentCloudSDKException
     */
    public FreshAntiFakeUrlResponse FreshAntiFakeUrl(FreshAntiFakeUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FreshAntiFakeUrl", FreshAntiFakeUrlResponse.class);
    }

    /**
     *Billing Resource Purchase, Renewal Order API
     * @param req GenerateDealsAndPayNewRequest
     * @return GenerateDealsAndPayNewResponse
     * @throws TencentCloudSDKException
     */
    public GenerateDealsAndPayNewResponse GenerateDealsAndPayNew(GenerateDealsAndPayNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateDealsAndPayNew", GenerateDealsAndPayNewResponse.class);
    }

    /**
     *This API is used to generate a bar chart for the generation time of attack logs.
     * @param req GetAttackHistogramRequest
     * @return GetAttackHistogramResponse
     * @throws TencentCloudSDKException
     */
    public GetAttackHistogramResponse GetAttackHistogram(GetAttackHistogramRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAttackHistogram", GetAttackHistogramResponse.class);
    }

    /**
     *Display total attack count by querying based on conditions
     * @param req GetAttackTotalCountRequest
     * @return GetAttackTotalCountResponse
     * @throws TencentCloudSDKException
     */
    public GetAttackTotalCountResponse GetAttackTotalCount(GetAttackTotalCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAttackTotalCount", GetAttackTotalCountResponse.class);
    }

    /**
     *Obtain the elastic QPS limit of package instances
     * @param req GetInstanceQpsLimitRequest
     * @return GetInstanceQpsLimitResponse
     * @throws TencentCloudSDKException
     */
    public GetInstanceQpsLimitResponse GetInstanceQpsLimit(GetInstanceQpsLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetInstanceQpsLimit", GetInstanceQpsLimitResponse.class);
    }

    /**
     *This API is used to import IP allowlists/blocklists.
     * @param req ImportIpAccessControlRequest
     * @return ImportIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public ImportIpAccessControlResponse ImportIpAccessControl(ImportIpAccessControlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportIpAccessControl", ImportIpAccessControlResponse.class);
    }

    /**
     *Edit a tamper-proof URL
     * @param req ModifyAntiFakeUrlRequest
     * @return ModifyAntiFakeUrlResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAntiFakeUrlResponse ModifyAntiFakeUrl(ModifyAntiFakeUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAntiFakeUrl", ModifyAntiFakeUrlResponse.class);
    }

    /**
     *Toggle tamper-proof switch
     * @param req ModifyAntiFakeUrlStatusRequest
     * @return ModifyAntiFakeUrlStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAntiFakeUrlStatusResponse ModifyAntiFakeUrlStatus(ModifyAntiFakeUrlStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAntiFakeUrlStatus", ModifyAntiFakeUrlStatusResponse.class);
    }

    /**
     *Information leakage prevention toggle rule switch
     * @param req ModifyAntiInfoLeakRuleStatusRequest
     * @return ModifyAntiInfoLeakRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAntiInfoLeakRuleStatusResponse ModifyAntiInfoLeakRuleStatus(ModifyAntiInfoLeakRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAntiInfoLeakRuleStatus", ModifyAntiInfoLeakRuleStatusResponse.class);
    }

    /**
     *Edit an information leakage prevention rule
     * @param req ModifyAntiInfoLeakRulesRequest
     * @return ModifyAntiInfoLeakRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAntiInfoLeakRulesResponse ModifyAntiInfoLeakRules(ModifyAntiInfoLeakRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAntiInfoLeakRules", ModifyAntiInfoLeakRulesResponse.class);
    }

    /**
     *API analysis page switch
     * @param req ModifyApiAnalyzeStatusRequest
     * @return ModifyApiAnalyzeStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApiAnalyzeStatusResponse ModifyApiAnalyzeStatus(ModifyApiAnalyzeStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApiAnalyzeStatus", ModifyApiAnalyzeStatusResponse.class);
    }

    /**
     *Bot_V2 bot master switch update
     * @param req ModifyBotStatusRequest
     * @return ModifyBotStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBotStatusResponse ModifyBotStatus(ModifyBotStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBotStatus", ModifyBotStatusResponse.class);
    }

    /**
     *This API is used to edit a custom rule.
     * @param req ModifyCustomRuleRequest
     * @return ModifyCustomRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomRuleResponse ModifyCustomRule(ModifyCustomRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCustomRule", ModifyCustomRuleResponse.class);
    }

    /**
     *Enable or disable access control (from custom policy)
     * @param req ModifyCustomRuleStatusRequest
     * @return ModifyCustomRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomRuleStatusResponse ModifyCustomRuleStatus(ModifyCustomRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCustomRuleStatus", ModifyCustomRuleStatusResponse.class);
    }

    /**
     *This API is used to edit a precise allowlist.
     * @param req ModifyCustomWhiteRuleRequest
     * @return ModifyCustomWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomWhiteRuleResponse ModifyCustomWhiteRule(ModifyCustomWhiteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCustomWhiteRule", ModifyCustomWhiteRuleResponse.class);
    }

    /**
     *Enable or disable a precision allowlist
     * @param req ModifyCustomWhiteRuleStatusRequest
     * @return ModifyCustomWhiteRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomWhiteRuleStatusResponse ModifyCustomWhiteRuleStatus(ModifyCustomWhiteRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCustomWhiteRuleStatus", ModifyCustomWhiteRuleStatusResponse.class);
    }

    /**
     *Toggle the IPv6 switch
     * @param req ModifyDomainIpv6StatusRequest
     * @return ModifyDomainIpv6StatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainIpv6StatusResponse ModifyDomainIpv6Status(ModifyDomainIpv6StatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainIpv6Status", ModifyDomainIpv6StatusResponse.class);
    }

    /**
     *This API is used to modify the domain shipping status.
     * @param req ModifyDomainPostActionRequest
     * @return ModifyDomainPostActionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainPostActionResponse ModifyDomainPostAction(ModifyDomainPostActionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainPostAction", ModifyDomainPostActionResponse.class);
    }

    /**
     *Enable or disable access log for domain list
     * @param req ModifyDomainsCLSStatusRequest
     * @return ModifyDomainsCLSStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainsCLSStatusResponse ModifyDomainsCLSStatus(ModifyDomainsCLSStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainsCLSStatus", ModifyDomainsCLSStatusResponse.class);
    }

    /**
     *This API is used to edit the configuration of domain names protected by CLB WAF.
     * @param req ModifyHostRequest
     * @return ModifyHostResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostResponse ModifyHost(ModifyHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHost", ModifyHostResponse.class);
    }

    /**
     *This API is used to set the traffic mode for domain names protected by CLB WAF. The mode can be mirror mode or cleaning mode.
     * @param req ModifyHostFlowModeRequest
     * @return ModifyHostFlowModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostFlowModeResponse ModifyHostFlowMode(ModifyHostFlowModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHostFlowMode", ModifyHostFlowModeResponse.class);
    }

    /**
     *Set CLB WAF protection domain status
     * @param req ModifyHostModeRequest
     * @return ModifyHostModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostModeResponse ModifyHostMode(ModifyHostModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHostMode", ModifyHostModeResponse.class);
    }

    /**
     *This API is used to enable or disable CLB WAF for a protected domain name.
Batch operation is supported.
     * @param req ModifyHostStatusRequest
     * @return ModifyHostStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostStatusResponse ModifyHostStatus(ModifyHostStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHostStatus", ModifyHostStatusResponse.class);
    }

    /**
     *Modify the QPS elastic billing switch for an instance
     * @param req ModifyInstanceElasticModeRequest
     * @return ModifyInstanceElasticModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceElasticModeResponse ModifyInstanceElasticMode(ModifyInstanceElasticModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceElasticMode", ModifyInstanceElasticModeResponse.class);
    }

    /**
     *Modify instance name
     * @param req ModifyInstanceNameRequest
     * @return ModifyInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceNameResponse ModifyInstanceName(ModifyInstanceNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceName", ModifyInstanceNameResponse.class);
    }

    /**
     *Set elastic QPS limit for package instances
     * @param req ModifyInstanceQpsLimitRequest
     * @return ModifyInstanceQpsLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceQpsLimitResponse ModifyInstanceQpsLimit(ModifyInstanceQpsLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceQpsLimit", ModifyInstanceQpsLimitResponse.class);
    }

    /**
     *Enable or disable auto-renewal for instance
     * @param req ModifyInstanceRenewFlagRequest
     * @return ModifyInstanceRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceRenewFlagResponse ModifyInstanceRenewFlag(ModifyInstanceRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceRenewFlag", ModifyInstanceRenewFlagResponse.class);
    }

    /**
     *This API is used to edit WAF IP allowlists/blocklists.
     * @param req ModifyIpAccessControlRequest
     * @return ModifyIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIpAccessControlResponse ModifyIpAccessControl(ModifyIpAccessControlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIpAccessControl", ModifyIpAccessControlResponse.class);
    }

    /**
     *Set the switch for the basic security module under a certain domain
     * @param req ModifyModuleStatusRequest
     * @return ModifyModuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModuleStatusResponse ModifyModuleStatus(ModifyModuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModuleStatus", ModifyModuleStatusResponse.class);
    }

    /**
     *Modify protection object
     * @param req ModifyObjectRequest
     * @return ModifyObjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyObjectResponse ModifyObject(ModifyObjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyObject", ModifyObjectResponse.class);
    }

    /**
     *This API is used to obtain the enabling status of the basic security protection module of WAF.
     * @param req ModifyProtectionStatusRequest
     * @return ModifyProtectionStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProtectionStatusResponse ModifyProtectionStatus(ModifyProtectionStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProtectionStatus", ModifyProtectionStatusResponse.class);
    }

    /**
     *This API is used to edit the configuration of domain names protected by SaaS WAF.
     * @param req ModifySpartaProtectionRequest
     * @return ModifySpartaProtectionResponse
     * @throws TencentCloudSDKException
     */
    public ModifySpartaProtectionResponse ModifySpartaProtection(ModifySpartaProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySpartaProtection", ModifySpartaProtectionResponse.class);
    }

    /**
     *Set WAF protection status
     * @param req ModifySpartaProtectionModeRequest
     * @return ModifySpartaProtectionModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySpartaProtectionModeResponse ModifySpartaProtectionMode(ModifySpartaProtectionModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySpartaProtectionMode", ModifySpartaProtectionModeResponse.class);
    }

    /**
     *Modify the user protection rule level
     * @param req ModifyUserLevelRequest
     * @return ModifyUserLevelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserLevelResponse ModifyUserLevel(ModifyUserLevelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserLevel", ModifyUserLevelResponse.class);
    }

    /**
     *Modify user protection rules, turn on/off specific rules
     * @param req ModifyUserSignatureRuleRequest
     * @return ModifyUserSignatureRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserSignatureRuleResponse ModifyUserSignatureRule(ModifyUserSignatureRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserSignatureRule", ModifyUserSignatureRuleResponse.class);
    }

    /**
     *Set the Webshell status of a domain.
     * @param req ModifyWebshellStatusRequest
     * @return ModifyWebshellStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebshellStatusResponse ModifyWebshellStatus(ModifyWebshellStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebshellStatus", ModifyWebshellStatusResponse.class);
    }

    /**
     *Refresh integration check results. The backend will generate integration check tasks
     * @param req RefreshAccessCheckResultRequest
     * @return RefreshAccessCheckResultResponse
     * @throws TencentCloudSDKException
     */
    public RefreshAccessCheckResultResponse RefreshAccessCheckResult(RefreshAccessCheckResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RefreshAccessCheckResult", RefreshAccessCheckResultResponse.class);
    }

    /**
     *The new version of the CLS API has parameter changes, with query changed to query_string to support Lucene syntax for API search queries.
     * @param req SearchAttackLogRequest
     * @return SearchAttackLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchAttackLogResponse SearchAttackLog(SearchAttackLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchAttackLog", SearchAttackLogResponse.class);
    }

    /**
     *Toggle elasticity switch
     * @param req SwitchElasticModeRequest
     * @return SwitchElasticModeResponse
     * @throws TencentCloudSDKException
     */
    public SwitchElasticModeResponse SwitchElasticMode(SwitchElasticModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchElasticMode", SwitchElasticModeResponse.class);
    }

    /**
     *WAF CC V2 upsert API
     * @param req UpsertCCRuleRequest
     * @return UpsertCCRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpsertCCRuleResponse UpsertCCRule(UpsertCCRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpsertCCRule", UpsertCCRuleResponse.class);
    }

    /**
     *WAF session definition upsert API
     * @param req UpsertSessionRequest
     * @return UpsertSessionResponse
     * @throws TencentCloudSDKException
     */
    public UpsertSessionResponse UpsertSession(UpsertSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpsertSession", UpsertSessionResponse.class);
    }

}
