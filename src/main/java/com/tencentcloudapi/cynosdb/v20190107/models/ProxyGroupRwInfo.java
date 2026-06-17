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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyGroupRwInfo extends AbstractModel {

    /**
    * <p>Consistency Type eventual-final consistency,global-global consistency,session-session consistency</p>
    */
    @SerializedName("ConsistencyType")
    @Expose
    private String ConsistencyType;

    /**
    * <p>Consistency timeout</p>
    */
    @SerializedName("ConsistencyTimeOut")
    @Expose
    private Long ConsistencyTimeOut;

    /**
    * <p>Weight mode system-system-assigned, custom-custom</p>
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * <p>Whether fault migration is enabled</p>
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * <p>Automatically add read-only instance, yes-yes, no-no</p>
    */
    @SerializedName("AutoAddRo")
    @Expose
    private String AutoAddRo;

    /**
    * <p>Instance weight array</p>
    */
    @SerializedName("InstanceWeights")
    @Expose
    private ProxyInstanceWeight [] InstanceWeights;

    /**
    * <p>Whether to enable the read-write node, yes - enable, no - disable</p>
    */
    @SerializedName("OpenRw")
    @Expose
    private String OpenRw;

    /**
    * <p>Read-write attribute, value range: READWRITE, READONLY</p>
    */
    @SerializedName("RwType")
    @Expose
    private String RwType;

    /**
    * <p>Transaction split</p>
    */
    @SerializedName("TransSplit")
    @Expose
    private Boolean TransSplit;

    /**
    * <p>Connection mode, available values: balance, nearby</p>
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
    * <p>Whether to treat the libra node as an ordinary RO node</p>
    */
    @SerializedName("ApNodeAsRoNode")
    @Expose
    private Boolean ApNodeAsRoNode;

    /**
    * <p>Whether to forward to other nodes when a libra node fault occurs</p>
    */
    @SerializedName("ApQueryToOtherNode")
    @Expose
    private Boolean ApQueryToOtherNode;

    /**
    * <p>Auto load</p><p>Enumeration value:</p><ul><li>static: Static load</li><li>dynamic: Dynamic load</li></ul>
    */
    @SerializedName("LoadBalanceMode")
    @Expose
    private String LoadBalanceMode;

    /**
     * Get <p>Consistency Type eventual-final consistency,global-global consistency,session-session consistency</p> 
     * @return ConsistencyType <p>Consistency Type eventual-final consistency,global-global consistency,session-session consistency</p>
     */
    public String getConsistencyType() {
        return this.ConsistencyType;
    }

    /**
     * Set <p>Consistency Type eventual-final consistency,global-global consistency,session-session consistency</p>
     * @param ConsistencyType <p>Consistency Type eventual-final consistency,global-global consistency,session-session consistency</p>
     */
    public void setConsistencyType(String ConsistencyType) {
        this.ConsistencyType = ConsistencyType;
    }

    /**
     * Get <p>Consistency timeout</p> 
     * @return ConsistencyTimeOut <p>Consistency timeout</p>
     */
    public Long getConsistencyTimeOut() {
        return this.ConsistencyTimeOut;
    }

    /**
     * Set <p>Consistency timeout</p>
     * @param ConsistencyTimeOut <p>Consistency timeout</p>
     */
    public void setConsistencyTimeOut(Long ConsistencyTimeOut) {
        this.ConsistencyTimeOut = ConsistencyTimeOut;
    }

    /**
     * Get <p>Weight mode system-system-assigned, custom-custom</p> 
     * @return WeightMode <p>Weight mode system-system-assigned, custom-custom</p>
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set <p>Weight mode system-system-assigned, custom-custom</p>
     * @param WeightMode <p>Weight mode system-system-assigned, custom-custom</p>
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get <p>Whether fault migration is enabled</p> 
     * @return FailOver <p>Whether fault migration is enabled</p>
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set <p>Whether fault migration is enabled</p>
     * @param FailOver <p>Whether fault migration is enabled</p>
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get <p>Automatically add read-only instance, yes-yes, no-no</p> 
     * @return AutoAddRo <p>Automatically add read-only instance, yes-yes, no-no</p>
     */
    public String getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set <p>Automatically add read-only instance, yes-yes, no-no</p>
     * @param AutoAddRo <p>Automatically add read-only instance, yes-yes, no-no</p>
     */
    public void setAutoAddRo(String AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get <p>Instance weight array</p> 
     * @return InstanceWeights <p>Instance weight array</p>
     */
    public ProxyInstanceWeight [] getInstanceWeights() {
        return this.InstanceWeights;
    }

    /**
     * Set <p>Instance weight array</p>
     * @param InstanceWeights <p>Instance weight array</p>
     */
    public void setInstanceWeights(ProxyInstanceWeight [] InstanceWeights) {
        this.InstanceWeights = InstanceWeights;
    }

    /**
     * Get <p>Whether to enable the read-write node, yes - enable, no - disable</p> 
     * @return OpenRw <p>Whether to enable the read-write node, yes - enable, no - disable</p>
     */
    public String getOpenRw() {
        return this.OpenRw;
    }

    /**
     * Set <p>Whether to enable the read-write node, yes - enable, no - disable</p>
     * @param OpenRw <p>Whether to enable the read-write node, yes - enable, no - disable</p>
     */
    public void setOpenRw(String OpenRw) {
        this.OpenRw = OpenRw;
    }

    /**
     * Get <p>Read-write attribute, value range: READWRITE, READONLY</p> 
     * @return RwType <p>Read-write attribute, value range: READWRITE, READONLY</p>
     */
    public String getRwType() {
        return this.RwType;
    }

    /**
     * Set <p>Read-write attribute, value range: READWRITE, READONLY</p>
     * @param RwType <p>Read-write attribute, value range: READWRITE, READONLY</p>
     */
    public void setRwType(String RwType) {
        this.RwType = RwType;
    }

    /**
     * Get <p>Transaction split</p> 
     * @return TransSplit <p>Transaction split</p>
     */
    public Boolean getTransSplit() {
        return this.TransSplit;
    }

    /**
     * Set <p>Transaction split</p>
     * @param TransSplit <p>Transaction split</p>
     */
    public void setTransSplit(Boolean TransSplit) {
        this.TransSplit = TransSplit;
    }

    /**
     * Get <p>Connection mode, available values: balance, nearby</p> 
     * @return AccessMode <p>Connection mode, available values: balance, nearby</p>
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set <p>Connection mode, available values: balance, nearby</p>
     * @param AccessMode <p>Connection mode, available values: balance, nearby</p>
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get <p>Whether to treat the libra node as an ordinary RO node</p> 
     * @return ApNodeAsRoNode <p>Whether to treat the libra node as an ordinary RO node</p>
     */
    public Boolean getApNodeAsRoNode() {
        return this.ApNodeAsRoNode;
    }

    /**
     * Set <p>Whether to treat the libra node as an ordinary RO node</p>
     * @param ApNodeAsRoNode <p>Whether to treat the libra node as an ordinary RO node</p>
     */
    public void setApNodeAsRoNode(Boolean ApNodeAsRoNode) {
        this.ApNodeAsRoNode = ApNodeAsRoNode;
    }

    /**
     * Get <p>Whether to forward to other nodes when a libra node fault occurs</p> 
     * @return ApQueryToOtherNode <p>Whether to forward to other nodes when a libra node fault occurs</p>
     */
    public Boolean getApQueryToOtherNode() {
        return this.ApQueryToOtherNode;
    }

    /**
     * Set <p>Whether to forward to other nodes when a libra node fault occurs</p>
     * @param ApQueryToOtherNode <p>Whether to forward to other nodes when a libra node fault occurs</p>
     */
    public void setApQueryToOtherNode(Boolean ApQueryToOtherNode) {
        this.ApQueryToOtherNode = ApQueryToOtherNode;
    }

    /**
     * Get <p>Auto load</p><p>Enumeration value:</p><ul><li>static: Static load</li><li>dynamic: Dynamic load</li></ul> 
     * @return LoadBalanceMode <p>Auto load</p><p>Enumeration value:</p><ul><li>static: Static load</li><li>dynamic: Dynamic load</li></ul>
     */
    public String getLoadBalanceMode() {
        return this.LoadBalanceMode;
    }

    /**
     * Set <p>Auto load</p><p>Enumeration value:</p><ul><li>static: Static load</li><li>dynamic: Dynamic load</li></ul>
     * @param LoadBalanceMode <p>Auto load</p><p>Enumeration value:</p><ul><li>static: Static load</li><li>dynamic: Dynamic load</li></ul>
     */
    public void setLoadBalanceMode(String LoadBalanceMode) {
        this.LoadBalanceMode = LoadBalanceMode;
    }

    public ProxyGroupRwInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyGroupRwInfo(ProxyGroupRwInfo source) {
        if (source.ConsistencyType != null) {
            this.ConsistencyType = new String(source.ConsistencyType);
        }
        if (source.ConsistencyTimeOut != null) {
            this.ConsistencyTimeOut = new Long(source.ConsistencyTimeOut);
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.FailOver != null) {
            this.FailOver = new String(source.FailOver);
        }
        if (source.AutoAddRo != null) {
            this.AutoAddRo = new String(source.AutoAddRo);
        }
        if (source.InstanceWeights != null) {
            this.InstanceWeights = new ProxyInstanceWeight[source.InstanceWeights.length];
            for (int i = 0; i < source.InstanceWeights.length; i++) {
                this.InstanceWeights[i] = new ProxyInstanceWeight(source.InstanceWeights[i]);
            }
        }
        if (source.OpenRw != null) {
            this.OpenRw = new String(source.OpenRw);
        }
        if (source.RwType != null) {
            this.RwType = new String(source.RwType);
        }
        if (source.TransSplit != null) {
            this.TransSplit = new Boolean(source.TransSplit);
        }
        if (source.AccessMode != null) {
            this.AccessMode = new String(source.AccessMode);
        }
        if (source.ApNodeAsRoNode != null) {
            this.ApNodeAsRoNode = new Boolean(source.ApNodeAsRoNode);
        }
        if (source.ApQueryToOtherNode != null) {
            this.ApQueryToOtherNode = new Boolean(source.ApQueryToOtherNode);
        }
        if (source.LoadBalanceMode != null) {
            this.LoadBalanceMode = new String(source.LoadBalanceMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsistencyType", this.ConsistencyType);
        this.setParamSimple(map, prefix + "ConsistencyTimeOut", this.ConsistencyTimeOut);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamSimple(map, prefix + "AutoAddRo", this.AutoAddRo);
        this.setParamArrayObj(map, prefix + "InstanceWeights.", this.InstanceWeights);
        this.setParamSimple(map, prefix + "OpenRw", this.OpenRw);
        this.setParamSimple(map, prefix + "RwType", this.RwType);
        this.setParamSimple(map, prefix + "TransSplit", this.TransSplit);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamSimple(map, prefix + "ApNodeAsRoNode", this.ApNodeAsRoNode);
        this.setParamSimple(map, prefix + "ApQueryToOtherNode", this.ApQueryToOtherNode);
        this.setParamSimple(map, prefix + "LoadBalanceMode", this.LoadBalanceMode);

    }
}

