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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGeneralStatRequest extends AbstractModel {

    /**
    * CVM type
<li>CVM: Indicates Tencent CVM.</li>
<li>BM: indicates Blackstone physical machine</li>
<li>ECM: indicates edge computing server</li>
<li>LH: indicates Tencent Cloud Lighthouse</li>
<li>Other: Indicates Hybrid cloud machines.</li>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Machine region. Example: ap-guangzhou, ap-shanghai
    */
    @SerializedName("MachineRegion")
    @Expose
    private String MachineRegion;

    /**
     * Get CVM type
<li>CVM: Indicates Tencent CVM.</li>
<li>BM: indicates Blackstone physical machine</li>
<li>ECM: indicates edge computing server</li>
<li>LH: indicates Tencent Cloud Lighthouse</li>
<li>Other: Indicates Hybrid cloud machines.</li> 
     * @return MachineType CVM type
<li>CVM: Indicates Tencent CVM.</li>
<li>BM: indicates Blackstone physical machine</li>
<li>ECM: indicates edge computing server</li>
<li>LH: indicates Tencent Cloud Lighthouse</li>
<li>Other: Indicates Hybrid cloud machines.</li>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set CVM type
<li>CVM: Indicates Tencent CVM.</li>
<li>BM: indicates Blackstone physical machine</li>
<li>ECM: indicates edge computing server</li>
<li>LH: indicates Tencent Cloud Lighthouse</li>
<li>Other: Indicates Hybrid cloud machines.</li>
     * @param MachineType CVM type
<li>CVM: Indicates Tencent CVM.</li>
<li>BM: indicates Blackstone physical machine</li>
<li>ECM: indicates edge computing server</li>
<li>LH: indicates Tencent Cloud Lighthouse</li>
<li>Other: Indicates Hybrid cloud machines.</li>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Machine region. Example: ap-guangzhou, ap-shanghai 
     * @return MachineRegion Machine region. Example: ap-guangzhou, ap-shanghai
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * Set Machine region. Example: ap-guangzhou, ap-shanghai
     * @param MachineRegion Machine region. Example: ap-guangzhou, ap-shanghai
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    public DescribeGeneralStatRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGeneralStatRequest(DescribeGeneralStatRequest source) {
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.MachineRegion != null) {
            this.MachineRegion = new String(source.MachineRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "MachineRegion", this.MachineRegion);

    }
}

