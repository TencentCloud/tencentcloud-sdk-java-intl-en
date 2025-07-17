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
package com.tencentcloudapi.region.v20220627;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.region.v20220627.models.*;

public class RegionClient extends AbstractClient{
    private static String endpoint = "region.intl.tencentcloudapi.com";
    private static String service = "region";
    private static String version = "2022-06-27";

    public RegionClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public RegionClient(Credential credential, String region, ClientProfile profile) {
        super(RegionClient.endpoint, RegionClient.version, credential, region, profile);
    }

    /**
     *This interface (DescribeProducts) is used for querying product information in each supported region list.
     * @param req DescribeProductsRequest
     * @return DescribeProductsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductsResponse DescribeProducts(DescribeProductsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProducts", DescribeProductsResponse.class);
    }

    /**
     *This interface (DescribeRegions) is used for querying the supported regions of each product.
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegions", DescribeRegionsResponse.class);
    }

    /**
     *This interface (DescribeZones) is used for querying product availability zone information.
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZones", DescribeZonesResponse.class);
    }

}
