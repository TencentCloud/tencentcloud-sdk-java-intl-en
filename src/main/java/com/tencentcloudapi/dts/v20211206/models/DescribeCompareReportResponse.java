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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCompareReportResponse extends AbstractModel {

    /**
    * Summary information of data consistency check
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Abstract")
    @Expose
    private CompareAbstractInfo Abstract;

    /**
    * Data consistency check details
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Detail")
    @Expose
    private CompareDetailInfo Detail;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Summary information of data consistency check
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Abstract Summary information of data consistency check
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CompareAbstractInfo getAbstract() {
        return this.Abstract;
    }

    /**
     * Set Summary information of data consistency check
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Abstract Summary information of data consistency check
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAbstract(CompareAbstractInfo Abstract) {
        this.Abstract = Abstract;
    }

    /**
     * Get Data consistency check details
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Detail Data consistency check details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CompareDetailInfo getDetail() {
        return this.Detail;
    }

    /**
     * Set Data consistency check details
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Detail Data consistency check details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetail(CompareDetailInfo Detail) {
        this.Detail = Detail;
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

    public DescribeCompareReportResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCompareReportResponse(DescribeCompareReportResponse source) {
        if (source.Abstract != null) {
            this.Abstract = new CompareAbstractInfo(source.Abstract);
        }
        if (source.Detail != null) {
            this.Detail = new CompareDetailInfo(source.Detail);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Abstract.", this.Abstract);
        this.setParamObj(map, prefix + "Detail.", this.Detail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

