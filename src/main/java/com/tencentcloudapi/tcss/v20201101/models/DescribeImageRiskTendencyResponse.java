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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageRiskTendencyResponse extends AbstractModel{

    /**
    * List of new risk trends of local images
    */
    @SerializedName("ImageRiskTendencySet")
    @Expose
    private ImageRiskTendencyInfo [] ImageRiskTendencySet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of new risk trends of local images 
     * @return ImageRiskTendencySet List of new risk trends of local images
     */
    public ImageRiskTendencyInfo [] getImageRiskTendencySet() {
        return this.ImageRiskTendencySet;
    }

    /**
     * Set List of new risk trends of local images
     * @param ImageRiskTendencySet List of new risk trends of local images
     */
    public void setImageRiskTendencySet(ImageRiskTendencyInfo [] ImageRiskTendencySet) {
        this.ImageRiskTendencySet = ImageRiskTendencySet;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeImageRiskTendencyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageRiskTendencyResponse(DescribeImageRiskTendencyResponse source) {
        if (source.ImageRiskTendencySet != null) {
            this.ImageRiskTendencySet = new ImageRiskTendencyInfo[source.ImageRiskTendencySet.length];
            for (int i = 0; i < source.ImageRiskTendencySet.length; i++) {
                this.ImageRiskTendencySet[i] = new ImageRiskTendencyInfo(source.ImageRiskTendencySet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ImageRiskTendencySet.", this.ImageRiskTendencySet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

