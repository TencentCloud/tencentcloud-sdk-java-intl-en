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

public class DescribeAssetImageVirusListResponse extends AbstractModel{

    /**
    * List of viruses in the image
    */
    @SerializedName("List")
    @Expose
    private ImageVirusInfo [] List;

    /**
    * Total number
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Virus scanning status
`0`: Not scanned.
`1`: Scanning.
`2`: Scanned.
`3`: Scan error.
`4`: Scan canceled.
    */
    @SerializedName("VirusScanStatus")
    @Expose
    private Long VirusScanStatus;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of viruses in the image 
     * @return List List of viruses in the image
     */
    public ImageVirusInfo [] getList() {
        return this.List;
    }

    /**
     * Set List of viruses in the image
     * @param List List of viruses in the image
     */
    public void setList(ImageVirusInfo [] List) {
        this.List = List;
    }

    /**
     * Get Total number 
     * @return TotalCount Total number
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number
     * @param TotalCount Total number
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Virus scanning status
`0`: Not scanned.
`1`: Scanning.
`2`: Scanned.
`3`: Scan error.
`4`: Scan canceled. 
     * @return VirusScanStatus Virus scanning status
`0`: Not scanned.
`1`: Scanning.
`2`: Scanned.
`3`: Scan error.
`4`: Scan canceled.
     */
    public Long getVirusScanStatus() {
        return this.VirusScanStatus;
    }

    /**
     * Set Virus scanning status
`0`: Not scanned.
`1`: Scanning.
`2`: Scanned.
`3`: Scan error.
`4`: Scan canceled.
     * @param VirusScanStatus Virus scanning status
`0`: Not scanned.
`1`: Scanning.
`2`: Scanned.
`3`: Scan error.
`4`: Scan canceled.
     */
    public void setVirusScanStatus(Long VirusScanStatus) {
        this.VirusScanStatus = VirusScanStatus;
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

    public DescribeAssetImageVirusListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageVirusListResponse(DescribeAssetImageVirusListResponse source) {
        if (source.List != null) {
            this.List = new ImageVirusInfo[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new ImageVirusInfo(source.List[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.VirusScanStatus != null) {
            this.VirusScanStatus = new Long(source.VirusScanStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "VirusScanStatus", this.VirusScanStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

