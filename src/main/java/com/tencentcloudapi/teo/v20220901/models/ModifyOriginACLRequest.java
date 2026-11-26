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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyOriginACLRequest extends AbstractModel {

    /**
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Origin protection mode for layer-7 accelerated domains. Default value: specific.<li>all: <strong>Automatic protection mode</strong>. All layer-7 accelerated domains in the site will be automatically added to the origin protection list, including newly added layer-7 accelerated domains;</li><li>specific: <strong>Manual protection mode</strong>. You need to manually specify the layer-7 accelerated domains to be added to origin protection (specified by the L7Hosts parameter). Resources not specified will not be added to the origin protection list. Subsequent protection resource adjustments can be made through the ModifyOriginACL API.</li>Note: When the value is all, leave L7Hosts empty; when the number of layer-7 accelerated domains under the site exceeds 200, enable protection in specific mode first, enable the remaining resources through the ModifyOriginACL API, and then switch to all through the ModifyOriginACL API.</p>
    */
    @SerializedName("L7EnableMode")
    @Expose
    private String L7EnableMode;

    /**
    * <p>Origin protection mode for layer-4 proxy instances. Default value: specific.<li>all: <strong>Automatic protection mode</strong>. All layer-4 proxy instances in the site will be automatically added to the origin protection list, including newly added layer-4 proxy instance resources;</li><li>specific: <strong>Manual protection mode</strong>. You need to manually specify the layer-4 proxy instances to be added to origin protection (specified by the L4ProxyIds parameter). Resources not specified will not be added to the origin protection list. Subsequent protection resource adjustments can be made through the ModifyOriginACL API.</li>Note: When the value is all, leave L4ProxyIds empty; when the number of layer-4 proxy instances under the site exceeds 100, enable protection in specific mode first, enable the remaining resources through the ModifyOriginACL API, and then switch to all through the ModifyOriginACL API.</p>
    */
    @SerializedName("L4EnableMode")
    @Expose
    private String L4EnableMode;

    /**
    * <p>Instances for which origin-pull from specific origin IP ranges needs to be enabled or disabled.<br>Note: This parameter is only applicable to resource adjustment in <strong>Manual protection mode</strong>; When the origin protection mode of the corresponding level is all, the resource list of this type is automatically maintained by the system. Do not include resources of this type in this parameter. For manual adjustment, switch the corresponding level to specific through L7EnableMode/L4EnableMode first.</p>
    */
    @SerializedName("OriginACLEntities")
    @Expose
    private OriginACLEntity [] OriginACLEntities;

    /**
    * <p>Origin protection origin-pull ACL control domain. If not filled in, it remains unchanged by default; Control domain information can be obtained through the DescribeAvailableOriginACLFamily API.<br>Specific values are described as follows:</p><li>gaz: Standard global AZ control domain;</li><li>mlc: Standard Chinese mainland AZ control domain;</li><li>emc: Standard global (excluding Chinese mainland) AZ control domain;</li><li>plat-gaz: Simplified global AZ control domain;</li><li>plat-mlc: Simplified Chinese mainland AZ control domain;</li><li>plat-emc: Simplified global (excluding Chinese mainland) AZ control domain;</li>
    */
    @SerializedName("OriginACLFamily")
    @Expose
    private String OriginACLFamily;

    /**
     * Get <p>Site ID.</p> 
     * @return ZoneId <p>Site ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID.</p>
     * @param ZoneId <p>Site ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Origin protection mode for layer-7 accelerated domains. Default value: specific.<li>all: <strong>Automatic protection mode</strong>. All layer-7 accelerated domains in the site will be automatically added to the origin protection list, including newly added layer-7 accelerated domains;</li><li>specific: <strong>Manual protection mode</strong>. You need to manually specify the layer-7 accelerated domains to be added to origin protection (specified by the L7Hosts parameter). Resources not specified will not be added to the origin protection list. Subsequent protection resource adjustments can be made through the ModifyOriginACL API.</li>Note: When the value is all, leave L7Hosts empty; when the number of layer-7 accelerated domains under the site exceeds 200, enable protection in specific mode first, enable the remaining resources through the ModifyOriginACL API, and then switch to all through the ModifyOriginACL API.</p> 
     * @return L7EnableMode <p>Origin protection mode for layer-7 accelerated domains. Default value: specific.<li>all: <strong>Automatic protection mode</strong>. All layer-7 accelerated domains in the site will be automatically added to the origin protection list, including newly added layer-7 accelerated domains;</li><li>specific: <strong>Manual protection mode</strong>. You need to manually specify the layer-7 accelerated domains to be added to origin protection (specified by the L7Hosts parameter). Resources not specified will not be added to the origin protection list. Subsequent protection resource adjustments can be made through the ModifyOriginACL API.</li>Note: When the value is all, leave L7Hosts empty; when the number of layer-7 accelerated domains under the site exceeds 200, enable protection in specific mode first, enable the remaining resources through the ModifyOriginACL API, and then switch to all through the ModifyOriginACL API.</p>
     */
    public String getL7EnableMode() {
        return this.L7EnableMode;
    }

    /**
     * Set <p>Origin protection mode for layer-7 accelerated domains. Default value: specific.<li>all: <strong>Automatic protection mode</strong>. All layer-7 accelerated domains in the site will be automatically added to the origin protection list, including newly added layer-7 accelerated domains;</li><li>specific: <strong>Manual protection mode</strong>. You need to manually specify the layer-7 accelerated domains to be added to origin protection (specified by the L7Hosts parameter). Resources not specified will not be added to the origin protection list. Subsequent protection resource adjustments can be made through the ModifyOriginACL API.</li>Note: When the value is all, leave L7Hosts empty; when the number of layer-7 accelerated domains under the site exceeds 200, enable protection in specific mode first, enable the remaining resources through the ModifyOriginACL API, and then switch to all through the ModifyOriginACL API.</p>
     * @param L7EnableMode <p>Origin protection mode for layer-7 accelerated domains. Default value: specific.<li>all: <strong>Automatic protection mode</strong>. All layer-7 accelerated domains in the site will be automatically added to the origin protection list, including newly added layer-7 accelerated domains;</li><li>specific: <strong>Manual protection mode</strong>. You need to manually specify the layer-7 accelerated domains to be added to origin protection (specified by the L7Hosts parameter). Resources not specified will not be added to the origin protection list. Subsequent protection resource adjustments can be made through the ModifyOriginACL API.</li>Note: When the value is all, leave L7Hosts empty; when the number of layer-7 accelerated domains under the site exceeds 200, enable protection in specific mode first, enable the remaining resources through the ModifyOriginACL API, and then switch to all through the ModifyOriginACL API.</p>
     */
    public void setL7EnableMode(String L7EnableMode) {
        this.L7EnableMode = L7EnableMode;
    }

    /**
     * Get <p>Origin protection mode for layer-4 proxy instances. Default value: specific.<li>all: <strong>Automatic protection mode</strong>. All layer-4 proxy instances in the site will be automatically added to the origin protection list, including newly added layer-4 proxy instance resources;</li><li>specific: <strong>Manual protection mode</strong>. You need to manually specify the layer-4 proxy instances to be added to origin protection (specified by the L4ProxyIds parameter). Resources not specified will not be added to the origin protection list. Subsequent protection resource adjustments can be made through the ModifyOriginACL API.</li>Note: When the value is all, leave L4ProxyIds empty; when the number of layer-4 proxy instances under the site exceeds 100, enable protection in specific mode first, enable the remaining resources through the ModifyOriginACL API, and then switch to all through the ModifyOriginACL API.</p> 
     * @return L4EnableMode <p>Origin protection mode for layer-4 proxy instances. Default value: specific.<li>all: <strong>Automatic protection mode</strong>. All layer-4 proxy instances in the site will be automatically added to the origin protection list, including newly added layer-4 proxy instance resources;</li><li>specific: <strong>Manual protection mode</strong>. You need to manually specify the layer-4 proxy instances to be added to origin protection (specified by the L4ProxyIds parameter). Resources not specified will not be added to the origin protection list. Subsequent protection resource adjustments can be made through the ModifyOriginACL API.</li>Note: When the value is all, leave L4ProxyIds empty; when the number of layer-4 proxy instances under the site exceeds 100, enable protection in specific mode first, enable the remaining resources through the ModifyOriginACL API, and then switch to all through the ModifyOriginACL API.</p>
     */
    public String getL4EnableMode() {
        return this.L4EnableMode;
    }

    /**
     * Set <p>Origin protection mode for layer-4 proxy instances. Default value: specific.<li>all: <strong>Automatic protection mode</strong>. All layer-4 proxy instances in the site will be automatically added to the origin protection list, including newly added layer-4 proxy instance resources;</li><li>specific: <strong>Manual protection mode</strong>. You need to manually specify the layer-4 proxy instances to be added to origin protection (specified by the L4ProxyIds parameter). Resources not specified will not be added to the origin protection list. Subsequent protection resource adjustments can be made through the ModifyOriginACL API.</li>Note: When the value is all, leave L4ProxyIds empty; when the number of layer-4 proxy instances under the site exceeds 100, enable protection in specific mode first, enable the remaining resources through the ModifyOriginACL API, and then switch to all through the ModifyOriginACL API.</p>
     * @param L4EnableMode <p>Origin protection mode for layer-4 proxy instances. Default value: specific.<li>all: <strong>Automatic protection mode</strong>. All layer-4 proxy instances in the site will be automatically added to the origin protection list, including newly added layer-4 proxy instance resources;</li><li>specific: <strong>Manual protection mode</strong>. You need to manually specify the layer-4 proxy instances to be added to origin protection (specified by the L4ProxyIds parameter). Resources not specified will not be added to the origin protection list. Subsequent protection resource adjustments can be made through the ModifyOriginACL API.</li>Note: When the value is all, leave L4ProxyIds empty; when the number of layer-4 proxy instances under the site exceeds 100, enable protection in specific mode first, enable the remaining resources through the ModifyOriginACL API, and then switch to all through the ModifyOriginACL API.</p>
     */
    public void setL4EnableMode(String L4EnableMode) {
        this.L4EnableMode = L4EnableMode;
    }

    /**
     * Get <p>Instances for which origin-pull from specific origin IP ranges needs to be enabled or disabled.<br>Note: This parameter is only applicable to resource adjustment in <strong>Manual protection mode</strong>; When the origin protection mode of the corresponding level is all, the resource list of this type is automatically maintained by the system. Do not include resources of this type in this parameter. For manual adjustment, switch the corresponding level to specific through L7EnableMode/L4EnableMode first.</p> 
     * @return OriginACLEntities <p>Instances for which origin-pull from specific origin IP ranges needs to be enabled or disabled.<br>Note: This parameter is only applicable to resource adjustment in <strong>Manual protection mode</strong>; When the origin protection mode of the corresponding level is all, the resource list of this type is automatically maintained by the system. Do not include resources of this type in this parameter. For manual adjustment, switch the corresponding level to specific through L7EnableMode/L4EnableMode first.</p>
     */
    public OriginACLEntity [] getOriginACLEntities() {
        return this.OriginACLEntities;
    }

    /**
     * Set <p>Instances for which origin-pull from specific origin IP ranges needs to be enabled or disabled.<br>Note: This parameter is only applicable to resource adjustment in <strong>Manual protection mode</strong>; When the origin protection mode of the corresponding level is all, the resource list of this type is automatically maintained by the system. Do not include resources of this type in this parameter. For manual adjustment, switch the corresponding level to specific through L7EnableMode/L4EnableMode first.</p>
     * @param OriginACLEntities <p>Instances for which origin-pull from specific origin IP ranges needs to be enabled or disabled.<br>Note: This parameter is only applicable to resource adjustment in <strong>Manual protection mode</strong>; When the origin protection mode of the corresponding level is all, the resource list of this type is automatically maintained by the system. Do not include resources of this type in this parameter. For manual adjustment, switch the corresponding level to specific through L7EnableMode/L4EnableMode first.</p>
     */
    public void setOriginACLEntities(OriginACLEntity [] OriginACLEntities) {
        this.OriginACLEntities = OriginACLEntities;
    }

    /**
     * Get <p>Origin protection origin-pull ACL control domain. If not filled in, it remains unchanged by default; Control domain information can be obtained through the DescribeAvailableOriginACLFamily API.<br>Specific values are described as follows:</p><li>gaz: Standard global AZ control domain;</li><li>mlc: Standard Chinese mainland AZ control domain;</li><li>emc: Standard global (excluding Chinese mainland) AZ control domain;</li><li>plat-gaz: Simplified global AZ control domain;</li><li>plat-mlc: Simplified Chinese mainland AZ control domain;</li><li>plat-emc: Simplified global (excluding Chinese mainland) AZ control domain;</li> 
     * @return OriginACLFamily <p>Origin protection origin-pull ACL control domain. If not filled in, it remains unchanged by default; Control domain information can be obtained through the DescribeAvailableOriginACLFamily API.<br>Specific values are described as follows:</p><li>gaz: Standard global AZ control domain;</li><li>mlc: Standard Chinese mainland AZ control domain;</li><li>emc: Standard global (excluding Chinese mainland) AZ control domain;</li><li>plat-gaz: Simplified global AZ control domain;</li><li>plat-mlc: Simplified Chinese mainland AZ control domain;</li><li>plat-emc: Simplified global (excluding Chinese mainland) AZ control domain;</li>
     */
    public String getOriginACLFamily() {
        return this.OriginACLFamily;
    }

    /**
     * Set <p>Origin protection origin-pull ACL control domain. If not filled in, it remains unchanged by default; Control domain information can be obtained through the DescribeAvailableOriginACLFamily API.<br>Specific values are described as follows:</p><li>gaz: Standard global AZ control domain;</li><li>mlc: Standard Chinese mainland AZ control domain;</li><li>emc: Standard global (excluding Chinese mainland) AZ control domain;</li><li>plat-gaz: Simplified global AZ control domain;</li><li>plat-mlc: Simplified Chinese mainland AZ control domain;</li><li>plat-emc: Simplified global (excluding Chinese mainland) AZ control domain;</li>
     * @param OriginACLFamily <p>Origin protection origin-pull ACL control domain. If not filled in, it remains unchanged by default; Control domain information can be obtained through the DescribeAvailableOriginACLFamily API.<br>Specific values are described as follows:</p><li>gaz: Standard global AZ control domain;</li><li>mlc: Standard Chinese mainland AZ control domain;</li><li>emc: Standard global (excluding Chinese mainland) AZ control domain;</li><li>plat-gaz: Simplified global AZ control domain;</li><li>plat-mlc: Simplified Chinese mainland AZ control domain;</li><li>plat-emc: Simplified global (excluding Chinese mainland) AZ control domain;</li>
     */
    public void setOriginACLFamily(String OriginACLFamily) {
        this.OriginACLFamily = OriginACLFamily;
    }

    public ModifyOriginACLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOriginACLRequest(ModifyOriginACLRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.L7EnableMode != null) {
            this.L7EnableMode = new String(source.L7EnableMode);
        }
        if (source.L4EnableMode != null) {
            this.L4EnableMode = new String(source.L4EnableMode);
        }
        if (source.OriginACLEntities != null) {
            this.OriginACLEntities = new OriginACLEntity[source.OriginACLEntities.length];
            for (int i = 0; i < source.OriginACLEntities.length; i++) {
                this.OriginACLEntities[i] = new OriginACLEntity(source.OriginACLEntities[i]);
            }
        }
        if (source.OriginACLFamily != null) {
            this.OriginACLFamily = new String(source.OriginACLFamily);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "L7EnableMode", this.L7EnableMode);
        this.setParamSimple(map, prefix + "L4EnableMode", this.L4EnableMode);
        this.setParamArrayObj(map, prefix + "OriginACLEntities.", this.OriginACLEntities);
        this.setParamSimple(map, prefix + "OriginACLFamily", this.OriginACLFamily);

    }
}

