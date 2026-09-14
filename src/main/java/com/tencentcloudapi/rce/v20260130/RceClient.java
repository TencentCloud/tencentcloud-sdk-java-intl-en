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
package com.tencentcloudapi.rce.v20260130;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.rce.v20260130.models.*;

public class RceClient extends AbstractClient{
    private static String endpoint = "rce.intl.tencentcloudapi.com";
    private static String service = "rce";
    private static String version = "2026-01-30";

    public RceClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public RceClient(Credential credential, String region, ClientProfile profile) {
        super(RceClient.endpoint, RceClient.version, credential, region, profile);
    }

    /**
     *Device Risk assessment - Premium
     * @param req AssessDeviceRiskPremiumProRequest
     * @return AssessDeviceRiskPremiumProResponse
     * @throws TencentCloudSDKException
     */
    public AssessDeviceRiskPremiumProResponse AssessDeviceRiskPremiumPro(AssessDeviceRiskPremiumProRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssessDeviceRiskPremiumPro", AssessDeviceRiskPremiumProResponse.class);
    }

    /**
     *Device Risk Assessment - Basic
     * @param req AssessDeviceRiskProRequest
     * @return AssessDeviceRiskProResponse
     * @throws TencentCloudSDKException
     */
    public AssessDeviceRiskProResponse AssessDeviceRiskPro(AssessDeviceRiskProRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssessDeviceRiskPro", AssessDeviceRiskProResponse.class);
    }

    /**
     *Environment Risk Assessment
     * @param req AssessEnvironmentRiskRequest
     * @return AssessEnvironmentRiskResponse
     * @throws TencentCloudSDKException
     */
    public AssessEnvironmentRiskResponse AssessEnvironmentRisk(AssessEnvironmentRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssessEnvironmentRisk", AssessEnvironmentRiskResponse.class);
    }

    /**
     *Used to obtain real-time risk information for events. It evaluates and returns risk decision results, risk scores, and risk tags based on device risk, environmental risk, account risk, behavioral risk, and historical reported event data for critical events in your business.
     * @param req AssessRiskRequest
     * @return AssessRiskResponse
     * @throws TencentCloudSDKException
     */
    public AssessRiskResponse AssessRisk(AssessRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssessRisk", AssessRiskResponse.class);
    }

    /**
     *Used to report events that do not require real-time decision-making in your business. Our engine will perform computations and apply machine learning to mine risk features from these events, which are then used to support real-time event risk assessment.
     * @param req ReportEventRequest
     * @return ReportEventResponse
     * @throws TencentCloudSDKException
     */
    public ReportEventResponse ReportEvent(ReportEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReportEvent", ReportEventResponse.class);
    }

}
