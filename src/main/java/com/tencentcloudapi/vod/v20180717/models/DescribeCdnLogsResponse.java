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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCdnLogsResponse extends AbstractModel{

    /**
    * Total number of log download links
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Log download list for CDN nodes outside Mainland China. If global acceleration is not enabled for the domain name, ignore this parameter.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OverseaCdnLogs")
    @Expose
    private CdnLogInfo [] OverseaCdnLogs;

    /**
    * Log download list for CDN nodes in Mainland China.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DomesticCdnLogs")
    @Expose
    private CdnLogInfo [] DomesticCdnLogs;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of log download links
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return TotalCount Total number of log download links
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of log download links
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param TotalCount Total number of log download links
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Log download list for CDN nodes outside Mainland China. If global acceleration is not enabled for the domain name, ignore this parameter.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OverseaCdnLogs Log download list for CDN nodes outside Mainland China. If global acceleration is not enabled for the domain name, ignore this parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public CdnLogInfo [] getOverseaCdnLogs() {
        return this.OverseaCdnLogs;
    }

    /**
     * Set Log download list for CDN nodes outside Mainland China. If global acceleration is not enabled for the domain name, ignore this parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OverseaCdnLogs Log download list for CDN nodes outside Mainland China. If global acceleration is not enabled for the domain name, ignore this parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOverseaCdnLogs(CdnLogInfo [] OverseaCdnLogs) {
        this.OverseaCdnLogs = OverseaCdnLogs;
    }

    /**
     * Get Log download list for CDN nodes in Mainland China.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DomesticCdnLogs Log download list for CDN nodes in Mainland China.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public CdnLogInfo [] getDomesticCdnLogs() {
        return this.DomesticCdnLogs;
    }

    /**
     * Set Log download list for CDN nodes in Mainland China.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DomesticCdnLogs Log download list for CDN nodes in Mainland China.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDomesticCdnLogs(CdnLogInfo [] DomesticCdnLogs) {
        this.DomesticCdnLogs = DomesticCdnLogs;
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

    public DescribeCdnLogsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCdnLogsResponse(DescribeCdnLogsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.OverseaCdnLogs != null) {
            this.OverseaCdnLogs = new CdnLogInfo[source.OverseaCdnLogs.length];
            for (int i = 0; i < source.OverseaCdnLogs.length; i++) {
                this.OverseaCdnLogs[i] = new CdnLogInfo(source.OverseaCdnLogs[i]);
            }
        }
        if (source.DomesticCdnLogs != null) {
            this.DomesticCdnLogs = new CdnLogInfo[source.DomesticCdnLogs.length];
            for (int i = 0; i < source.DomesticCdnLogs.length; i++) {
                this.DomesticCdnLogs[i] = new CdnLogInfo(source.DomesticCdnLogs[i]);
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
        this.setParamArrayObj(map, prefix + "OverseaCdnLogs.", this.OverseaCdnLogs);
        this.setParamArrayObj(map, prefix + "DomesticCdnLogs.", this.DomesticCdnLogs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

