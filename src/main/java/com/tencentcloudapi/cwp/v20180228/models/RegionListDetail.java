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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionListDetail extends AbstractModel {

    /**
    * Machine type
CVM, Tencent Cloud Virtual Machine
LH, TencentCloud Lighthouse
ECM, Tencent Cloud Edge Computing Machine
BM, Tencent BM 1.0
Other, Other servers (non-Tencent Cloud)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 0 Tencent Cloud
1 IDC
2 Alibaba Cloud
3 Huawei Cloud
4 Amazon
5 Microsoft
6 Google
7 Oracle
8 Digital Ocean
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CloudFrom")
    @Expose
    private Long CloudFrom;

    /**
    * List of regions
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionList")
    @Expose
    private RegionInfo [] RegionList;

    /**
     * Get Machine type
CVM, Tencent Cloud Virtual Machine
LH, TencentCloud Lighthouse
ECM, Tencent Cloud Edge Computing Machine
BM, Tencent BM 1.0
Other, Other servers (non-Tencent Cloud)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineType Machine type
CVM, Tencent Cloud Virtual Machine
LH, TencentCloud Lighthouse
ECM, Tencent Cloud Edge Computing Machine
BM, Tencent BM 1.0
Other, Other servers (non-Tencent Cloud)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Machine type
CVM, Tencent Cloud Virtual Machine
LH, TencentCloud Lighthouse
ECM, Tencent Cloud Edge Computing Machine
BM, Tencent BM 1.0
Other, Other servers (non-Tencent Cloud)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineType Machine type
CVM, Tencent Cloud Virtual Machine
LH, TencentCloud Lighthouse
ECM, Tencent Cloud Edge Computing Machine
BM, Tencent BM 1.0
Other, Other servers (non-Tencent Cloud)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 0 Tencent Cloud
1 IDC
2 Alibaba Cloud
3 Huawei Cloud
4 Amazon
5 Microsoft
6 Google
7 Oracle
8 Digital Ocean
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CloudFrom 0 Tencent Cloud
1 IDC
2 Alibaba Cloud
3 Huawei Cloud
4 Amazon
5 Microsoft
6 Google
7 Oracle
8 Digital Ocean
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCloudFrom() {
        return this.CloudFrom;
    }

    /**
     * Set 0 Tencent Cloud
1 IDC
2 Alibaba Cloud
3 Huawei Cloud
4 Amazon
5 Microsoft
6 Google
7 Oracle
8 Digital Ocean
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CloudFrom 0 Tencent Cloud
1 IDC
2 Alibaba Cloud
3 Huawei Cloud
4 Amazon
5 Microsoft
6 Google
7 Oracle
8 Digital Ocean
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCloudFrom(Long CloudFrom) {
        this.CloudFrom = CloudFrom;
    }

    /**
     * Get List of regions
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionList List of regions
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RegionInfo [] getRegionList() {
        return this.RegionList;
    }

    /**
     * Set List of regions
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionList List of regions
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionList(RegionInfo [] RegionList) {
        this.RegionList = RegionList;
    }

    public RegionListDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionListDetail(RegionListDetail source) {
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.CloudFrom != null) {
            this.CloudFrom = new Long(source.CloudFrom);
        }
        if (source.RegionList != null) {
            this.RegionList = new RegionInfo[source.RegionList.length];
            for (int i = 0; i < source.RegionList.length; i++) {
                this.RegionList[i] = new RegionInfo(source.RegionList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "CloudFrom", this.CloudFrom);
        this.setParamArrayObj(map, prefix + "RegionList.", this.RegionList);

    }
}

