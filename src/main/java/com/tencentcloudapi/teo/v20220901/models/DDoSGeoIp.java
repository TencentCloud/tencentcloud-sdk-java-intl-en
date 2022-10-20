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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSGeoIp extends AbstractModel{

    /**
    * Whether to clear the blocklist of the region. Values:
<li>`off`: Clear the blocklist of the region.</li>
<li>`on`: Perform no operations.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Region information. For more information on the ID, see [DescribeSecurityPolicyRegions](https://tcloud4api.woa.com/document/product/1657/81247?!preview&!document=1).
    */
    @SerializedName("RegionIds")
    @Expose
    private Long [] RegionIds;

    /**
     * Get Whether to clear the blocklist of the region. Values:
<li>`off`: Clear the blocklist of the region.</li>
<li>`on`: Perform no operations.</li> 
     * @return Switch Whether to clear the blocklist of the region. Values:
<li>`off`: Clear the blocklist of the region.</li>
<li>`on`: Perform no operations.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to clear the blocklist of the region. Values:
<li>`off`: Clear the blocklist of the region.</li>
<li>`on`: Perform no operations.</li>
     * @param Switch Whether to clear the blocklist of the region. Values:
<li>`off`: Clear the blocklist of the region.</li>
<li>`on`: Perform no operations.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Region information. For more information on the ID, see [DescribeSecurityPolicyRegions](https://tcloud4api.woa.com/document/product/1657/81247?!preview&!document=1). 
     * @return RegionIds Region information. For more information on the ID, see [DescribeSecurityPolicyRegions](https://tcloud4api.woa.com/document/product/1657/81247?!preview&!document=1).
     */
    public Long [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set Region information. For more information on the ID, see [DescribeSecurityPolicyRegions](https://tcloud4api.woa.com/document/product/1657/81247?!preview&!document=1).
     * @param RegionIds Region information. For more information on the ID, see [DescribeSecurityPolicyRegions](https://tcloud4api.woa.com/document/product/1657/81247?!preview&!document=1).
     */
    public void setRegionIds(Long [] RegionIds) {
        this.RegionIds = RegionIds;
    }

    public DDoSGeoIp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSGeoIp(DDoSGeoIp source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.RegionIds != null) {
            this.RegionIds = new Long[source.RegionIds.length];
            for (int i = 0; i < source.RegionIds.length; i++) {
                this.RegionIds[i] = new Long(source.RegionIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "RegionIds.", this.RegionIds);

    }
}

