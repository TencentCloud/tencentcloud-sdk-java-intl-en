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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatFwInstance extends AbstractModel {

    /**
    * NAT instance ID
    */
    @SerializedName("NatinsId")
    @Expose
    private String NatinsId;

    /**
    * NAT instance name
    */
    @SerializedName("NatinsName")
    @Expose
    private String NatinsName;

    /**
    * Instance region
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 0: create new; 1: use existing
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("FwMode")
    @Expose
    private Long FwMode;

    /**
    * 0: normal; 1: creating
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * NAT public IP
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("NatIp")
    @Expose
    private String NatIp;

    /**
     * Get NAT instance ID 
     * @return NatinsId NAT instance ID
     */
    public String getNatinsId() {
        return this.NatinsId;
    }

    /**
     * Set NAT instance ID
     * @param NatinsId NAT instance ID
     */
    public void setNatinsId(String NatinsId) {
        this.NatinsId = NatinsId;
    }

    /**
     * Get NAT instance name 
     * @return NatinsName NAT instance name
     */
    public String getNatinsName() {
        return this.NatinsName;
    }

    /**
     * Set NAT instance name
     * @param NatinsName NAT instance name
     */
    public void setNatinsName(String NatinsName) {
        this.NatinsName = NatinsName;
    }

    /**
     * Get Instance region
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Region Instance region
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance region
Note: This field may return `null`, indicating that no valid value was found.
     * @param Region Instance region
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 0: create new; 1: use existing
Note: This field may return `null`, indicating that no valid value was found. 
     * @return FwMode 0: create new; 1: use existing
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getFwMode() {
        return this.FwMode;
    }

    /**
     * Set 0: create new; 1: use existing
Note: This field may return `null`, indicating that no valid value was found.
     * @param FwMode 0: create new; 1: use existing
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setFwMode(Long FwMode) {
        this.FwMode = FwMode;
    }

    /**
     * Get 0: normal; 1: creating
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Status 0: normal; 1: creating
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0: normal; 1: creating
Note: This field may return `null`, indicating that no valid value was found.
     * @param Status 0: normal; 1: creating
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get NAT public IP
Note: This field may return `null`, indicating that no valid value was found. 
     * @return NatIp NAT public IP
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getNatIp() {
        return this.NatIp;
    }

    /**
     * Set NAT public IP
Note: This field may return `null`, indicating that no valid value was found.
     * @param NatIp NAT public IP
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setNatIp(String NatIp) {
        this.NatIp = NatIp;
    }

    public NatFwInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatFwInstance(NatFwInstance source) {
        if (source.NatinsId != null) {
            this.NatinsId = new String(source.NatinsId);
        }
        if (source.NatinsName != null) {
            this.NatinsName = new String(source.NatinsName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.FwMode != null) {
            this.FwMode = new Long(source.FwMode);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.NatIp != null) {
            this.NatIp = new String(source.NatIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatinsId", this.NatinsId);
        this.setParamSimple(map, prefix + "NatinsName", this.NatinsName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "FwMode", this.FwMode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NatIp", this.NatIp);

    }
}

