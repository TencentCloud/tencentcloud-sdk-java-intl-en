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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeQualityControlTemplatesResponse extends AbstractModel {

    /**
    * Total number of records that meet filter conditions.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Media quality inspection template details list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QualityControlTemplateSet")
    @Expose
    private QualityControlTemplate [] QualityControlTemplateSet;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of records that meet filter conditions. 
     * @return TotalCount Total number of records that meet filter conditions.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of records that meet filter conditions.
     * @param TotalCount Total number of records that meet filter conditions.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Media quality inspection template details list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QualityControlTemplateSet Media quality inspection template details list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public QualityControlTemplate [] getQualityControlTemplateSet() {
        return this.QualityControlTemplateSet;
    }

    /**
     * Set Media quality inspection template details list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QualityControlTemplateSet Media quality inspection template details list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQualityControlTemplateSet(QualityControlTemplate [] QualityControlTemplateSet) {
        this.QualityControlTemplateSet = QualityControlTemplateSet;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeQualityControlTemplatesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQualityControlTemplatesResponse(DescribeQualityControlTemplatesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.QualityControlTemplateSet != null) {
            this.QualityControlTemplateSet = new QualityControlTemplate[source.QualityControlTemplateSet.length];
            for (int i = 0; i < source.QualityControlTemplateSet.length; i++) {
                this.QualityControlTemplateSet[i] = new QualityControlTemplate(source.QualityControlTemplateSet[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "QualityControlTemplateSet.", this.QualityControlTemplateSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

