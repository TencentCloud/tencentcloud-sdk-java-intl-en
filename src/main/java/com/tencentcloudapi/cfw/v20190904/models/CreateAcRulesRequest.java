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

public class CreateAcRulesRequest extends AbstractModel {

    /**
    * Creates rule data
    */
    @SerializedName("Data")
    @Expose
    private RuleInfoData [] Data;

    /**
    * 0: add (default); 1: insert
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Edge ID
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * Access control rule status
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 0: add; 1: overwrite
    */
    @SerializedName("Overwrite")
    @Expose
    private Long Overwrite;

    /**
    * NAT instance ID, required when the parameter Area exists
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * portScan: from port scanning; patchImport: from batch import
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * NAT region
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get Creates rule data 
     * @return Data Creates rule data
     */
    public RuleInfoData [] getData() {
        return this.Data;
    }

    /**
     * Set Creates rule data
     * @param Data Creates rule data
     */
    public void setData(RuleInfoData [] Data) {
        this.Data = Data;
    }

    /**
     * Get 0: add (default); 1: insert 
     * @return Type 0: add (default); 1: insert
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0: add (default); 1: insert
     * @param Type 0: add (default); 1: insert
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Edge ID 
     * @return EdgeId Edge ID
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set Edge ID
     * @param EdgeId Edge ID
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get Access control rule status 
     * @return Enable Access control rule status
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Access control rule status
     * @param Enable Access control rule status
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 0: add; 1: overwrite 
     * @return Overwrite 0: add; 1: overwrite
     */
    public Long getOverwrite() {
        return this.Overwrite;
    }

    /**
     * Set 0: add; 1: overwrite
     * @param Overwrite 0: add; 1: overwrite
     */
    public void setOverwrite(Long Overwrite) {
        this.Overwrite = Overwrite;
    }

    /**
     * Get NAT instance ID, required when the parameter Area exists 
     * @return InstanceId NAT instance ID, required when the parameter Area exists
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set NAT instance ID, required when the parameter Area exists
     * @param InstanceId NAT instance ID, required when the parameter Area exists
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get portScan: from port scanning; patchImport: from batch import 
     * @return From portScan: from port scanning; patchImport: from batch import
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set portScan: from port scanning; patchImport: from batch import
     * @param From portScan: from port scanning; patchImport: from batch import
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get NAT region 
     * @return Area NAT region
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set NAT region
     * @param Area NAT region
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public CreateAcRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAcRulesRequest(CreateAcRulesRequest source) {
        if (source.Data != null) {
            this.Data = new RuleInfoData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new RuleInfoData(source.Data[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Overwrite != null) {
            this.Overwrite = new Long(source.Overwrite);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Overwrite", this.Overwrite);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

