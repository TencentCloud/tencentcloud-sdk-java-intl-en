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
package com.tencentcloudapi.tcsas.v20250106;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tcsas.v20250106.models.*;

public class TcsasClient extends AbstractClient{
    private static String endpoint = "tcsas.intl.tencentcloudapi.com";
    private static String service = "tcsas";
    private static String version = "2025-01-06";

    public TcsasClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TcsasClient(Credential credential, String region, ClientProfile profile) {
        super(TcsasClient.endpoint, TcsasClient.version, credential, region, profile);
    }

    /**
     *This API is used to retrieve the detailed mini game monthly active user data.
     * @param req DescribeMNGMAUDataDetailRequest
     * @return DescribeMNGMAUDataDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNGMAUDataDetailResponse DescribeMNGMAUDataDetail(DescribeMNGMAUDataDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNGMAUDataDetail", DescribeMNGMAUDataDetailResponse.class);
    }

    /**
     *This API is used to retrieve mini game monthly active user data in a line chart format.
     * @param req DescribeMNGMAULineChartRequest
     * @return DescribeMNGMAULineChartResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNGMAULineChartResponse DescribeMNGMAULineChart(DescribeMNGMAULineChartRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNGMAULineChart", DescribeMNGMAULineChartResponse.class);
    }

    /**
     *This API is used to retrieve MAU comparison data for a mini game between two months.
     * @param req DescribeMNGMAUMonthlyComparisonMetricCardRequest
     * @return DescribeMNGMAUMonthlyComparisonMetricCardResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNGMAUMonthlyComparisonMetricCardResponse DescribeMNGMAUMonthlyComparisonMetricCard(DescribeMNGMAUMonthlyComparisonMetricCardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNGMAUMonthlyComparisonMetricCard", DescribeMNGMAUMonthlyComparisonMetricCardResponse.class);
    }

    /**
     *This API is used to retrieve the detailed mini program monthly active user data.
     * @param req DescribeMNPMAUDataDetailRequest
     * @return DescribeMNPMAUDataDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPMAUDataDetailResponse DescribeMNPMAUDataDetail(DescribeMNPMAUDataDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPMAUDataDetail", DescribeMNPMAUDataDetailResponse.class);
    }

    /**
     *This API is used to retrieve mini program monthly active user data in a line chart format.
     * @param req DescribeMNPMAULineChartRequest
     * @return DescribeMNPMAULineChartResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPMAULineChartResponse DescribeMNPMAULineChart(DescribeMNPMAULineChartRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPMAULineChart", DescribeMNPMAULineChartResponse.class);
    }

    /**
     *This API is used to retrieve MAU comparison data for a mini program between two months.
     * @param req DescribeMNPMAUMetricCardRequest
     * @return DescribeMNPMAUMetricCardResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPMAUMetricCardResponse DescribeMNPMAUMetricCard(DescribeMNPMAUMetricCardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPMAUMetricCard", DescribeMNPMAUMetricCardResponse.class);
    }

}
