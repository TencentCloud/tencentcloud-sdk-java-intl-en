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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdjustCdbProxyAddressRequest extends AbstractModel {

    /**
    * <p>Proxy group ID, which can be obtained through the <a href="https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1">DescribeCdbProxyInfo</a> API.</p>
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * <p>Weight allocation mode,<br>system Auto-Assignment: "system", custom: "custom"</p>
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * <p>Whether delay removal is enabled. Value: "true" | "false"</p>
    */
    @SerializedName("IsKickOut")
    @Expose
    private Boolean IsKickOut;

    /**
    * <p>Minimum retention quantity, minimum value: 0.<br>Description: Valid only when IsKickOut is true.</p>
    */
    @SerializedName("MinCount")
    @Expose
    private Long MinCount;

    /**
    * <p>Delay removal threshold, minimum value: 1, value ranges from 1 to 10000, integer.</p>
    */
    @SerializedName("MaxDelay")
    @Expose
    private Long MaxDelay;

    /**
    * <p>Whether fault migration is enabled, value: "true" | "false"</p>
    */
    @SerializedName("FailOver")
    @Expose
    private Boolean FailOver;

    /**
    * <p>Automatically add RO. Parameter: "true" | "false"</p>
    */
    @SerializedName("AutoAddRo")
    @Expose
    private Boolean AutoAddRo;

    /**
    * <p>Whether it is read-only. Value: "true" | "false".</p>
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
    * <p>Proxy group address ID. Obtain through the <a href="https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1">DescribeCdbProxyInfo</a> API.</p>
    */
    @SerializedName("ProxyAddressId")
    @Expose
    private String ProxyAddressId;

    /**
    * <p>Whether transaction splitting is enabled. Value: "true" | "false". Default value: false.</p>
    */
    @SerializedName("TransSplit")
    @Expose
    private Boolean TransSplit;

    /**
    * <p>Whether the connection pool is enabled. Off by default.<br>Note: If you need to use the database proxy connection pool capability, the kernel minor version of the MySQL 8.0 primary instance must be at least MySQL 8.0 20230630.</p>
    */
    @SerializedName("ConnectionPool")
    @Expose
    private Boolean ConnectionPool;

    /**
    * <p>Read-write weight allocation. If WeightMode is passed in as system, the passed-in weight does not take effect and the default weight is assigned by the system.</p>
    */
    @SerializedName("ProxyAllocation")
    @Expose
    private ProxyAllocation [] ProxyAllocation;

    /**
    * <p>Whether self-adaptive load balancing is enabled. Off by default.</p>
    */
    @SerializedName("AutoLoadBalance")
    @Expose
    private Boolean AutoLoadBalance;

    /**
    * <p>Access mode: nearby - proximity access, balance - balanced allocation. Default is proximity access.</p>
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
    * <p>Whether to forward to other nodes in case of a libra node fault</p>
    */
    @SerializedName("ApQueryToOtherNode")
    @Expose
    private Boolean ApQueryToOtherNode;

    /**
     * Get <p>Proxy group ID, which can be obtained through the <a href="https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1">DescribeCdbProxyInfo</a> API.</p> 
     * @return ProxyGroupId <p>Proxy group ID, which can be obtained through the <a href="https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1">DescribeCdbProxyInfo</a> API.</p>
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set <p>Proxy group ID, which can be obtained through the <a href="https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1">DescribeCdbProxyInfo</a> API.</p>
     * @param ProxyGroupId <p>Proxy group ID, which can be obtained through the <a href="https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1">DescribeCdbProxyInfo</a> API.</p>
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get <p>Weight allocation mode,<br>system Auto-Assignment: "system", custom: "custom"</p> 
     * @return WeightMode <p>Weight allocation mode,<br>system Auto-Assignment: "system", custom: "custom"</p>
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set <p>Weight allocation mode,<br>system Auto-Assignment: "system", custom: "custom"</p>
     * @param WeightMode <p>Weight allocation mode,<br>system Auto-Assignment: "system", custom: "custom"</p>
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get <p>Whether delay removal is enabled. Value: "true" | "false"</p> 
     * @return IsKickOut <p>Whether delay removal is enabled. Value: "true" | "false"</p>
     */
    public Boolean getIsKickOut() {
        return this.IsKickOut;
    }

    /**
     * Set <p>Whether delay removal is enabled. Value: "true" | "false"</p>
     * @param IsKickOut <p>Whether delay removal is enabled. Value: "true" | "false"</p>
     */
    public void setIsKickOut(Boolean IsKickOut) {
        this.IsKickOut = IsKickOut;
    }

    /**
     * Get <p>Minimum retention quantity, minimum value: 0.<br>Description: Valid only when IsKickOut is true.</p> 
     * @return MinCount <p>Minimum retention quantity, minimum value: 0.<br>Description: Valid only when IsKickOut is true.</p>
     */
    public Long getMinCount() {
        return this.MinCount;
    }

    /**
     * Set <p>Minimum retention quantity, minimum value: 0.<br>Description: Valid only when IsKickOut is true.</p>
     * @param MinCount <p>Minimum retention quantity, minimum value: 0.<br>Description: Valid only when IsKickOut is true.</p>
     */
    public void setMinCount(Long MinCount) {
        this.MinCount = MinCount;
    }

    /**
     * Get <p>Delay removal threshold, minimum value: 1, value ranges from 1 to 10000, integer.</p> 
     * @return MaxDelay <p>Delay removal threshold, minimum value: 1, value ranges from 1 to 10000, integer.</p>
     */
    public Long getMaxDelay() {
        return this.MaxDelay;
    }

    /**
     * Set <p>Delay removal threshold, minimum value: 1, value ranges from 1 to 10000, integer.</p>
     * @param MaxDelay <p>Delay removal threshold, minimum value: 1, value ranges from 1 to 10000, integer.</p>
     */
    public void setMaxDelay(Long MaxDelay) {
        this.MaxDelay = MaxDelay;
    }

    /**
     * Get <p>Whether fault migration is enabled, value: "true" | "false"</p> 
     * @return FailOver <p>Whether fault migration is enabled, value: "true" | "false"</p>
     */
    public Boolean getFailOver() {
        return this.FailOver;
    }

    /**
     * Set <p>Whether fault migration is enabled, value: "true" | "false"</p>
     * @param FailOver <p>Whether fault migration is enabled, value: "true" | "false"</p>
     */
    public void setFailOver(Boolean FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get <p>Automatically add RO. Parameter: "true" | "false"</p> 
     * @return AutoAddRo <p>Automatically add RO. Parameter: "true" | "false"</p>
     */
    public Boolean getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set <p>Automatically add RO. Parameter: "true" | "false"</p>
     * @param AutoAddRo <p>Automatically add RO. Parameter: "true" | "false"</p>
     */
    public void setAutoAddRo(Boolean AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get <p>Whether it is read-only. Value: "true" | "false".</p> 
     * @return ReadOnly <p>Whether it is read-only. Value: "true" | "false".</p>
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set <p>Whether it is read-only. Value: "true" | "false".</p>
     * @param ReadOnly <p>Whether it is read-only. Value: "true" | "false".</p>
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get <p>Proxy group address ID. Obtain through the <a href="https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1">DescribeCdbProxyInfo</a> API.</p> 
     * @return ProxyAddressId <p>Proxy group address ID. Obtain through the <a href="https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1">DescribeCdbProxyInfo</a> API.</p>
     */
    public String getProxyAddressId() {
        return this.ProxyAddressId;
    }

    /**
     * Set <p>Proxy group address ID. Obtain through the <a href="https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1">DescribeCdbProxyInfo</a> API.</p>
     * @param ProxyAddressId <p>Proxy group address ID. Obtain through the <a href="https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1">DescribeCdbProxyInfo</a> API.</p>
     */
    public void setProxyAddressId(String ProxyAddressId) {
        this.ProxyAddressId = ProxyAddressId;
    }

    /**
     * Get <p>Whether transaction splitting is enabled. Value: "true" | "false". Default value: false.</p> 
     * @return TransSplit <p>Whether transaction splitting is enabled. Value: "true" | "false". Default value: false.</p>
     */
    public Boolean getTransSplit() {
        return this.TransSplit;
    }

    /**
     * Set <p>Whether transaction splitting is enabled. Value: "true" | "false". Default value: false.</p>
     * @param TransSplit <p>Whether transaction splitting is enabled. Value: "true" | "false". Default value: false.</p>
     */
    public void setTransSplit(Boolean TransSplit) {
        this.TransSplit = TransSplit;
    }

    /**
     * Get <p>Whether the connection pool is enabled. Off by default.<br>Note: If you need to use the database proxy connection pool capability, the kernel minor version of the MySQL 8.0 primary instance must be at least MySQL 8.0 20230630.</p> 
     * @return ConnectionPool <p>Whether the connection pool is enabled. Off by default.<br>Note: If you need to use the database proxy connection pool capability, the kernel minor version of the MySQL 8.0 primary instance must be at least MySQL 8.0 20230630.</p>
     */
    public Boolean getConnectionPool() {
        return this.ConnectionPool;
    }

    /**
     * Set <p>Whether the connection pool is enabled. Off by default.<br>Note: If you need to use the database proxy connection pool capability, the kernel minor version of the MySQL 8.0 primary instance must be at least MySQL 8.0 20230630.</p>
     * @param ConnectionPool <p>Whether the connection pool is enabled. Off by default.<br>Note: If you need to use the database proxy connection pool capability, the kernel minor version of the MySQL 8.0 primary instance must be at least MySQL 8.0 20230630.</p>
     */
    public void setConnectionPool(Boolean ConnectionPool) {
        this.ConnectionPool = ConnectionPool;
    }

    /**
     * Get <p>Read-write weight allocation. If WeightMode is passed in as system, the passed-in weight does not take effect and the default weight is assigned by the system.</p> 
     * @return ProxyAllocation <p>Read-write weight allocation. If WeightMode is passed in as system, the passed-in weight does not take effect and the default weight is assigned by the system.</p>
     */
    public ProxyAllocation [] getProxyAllocation() {
        return this.ProxyAllocation;
    }

    /**
     * Set <p>Read-write weight allocation. If WeightMode is passed in as system, the passed-in weight does not take effect and the default weight is assigned by the system.</p>
     * @param ProxyAllocation <p>Read-write weight allocation. If WeightMode is passed in as system, the passed-in weight does not take effect and the default weight is assigned by the system.</p>
     */
    public void setProxyAllocation(ProxyAllocation [] ProxyAllocation) {
        this.ProxyAllocation = ProxyAllocation;
    }

    /**
     * Get <p>Whether self-adaptive load balancing is enabled. Off by default.</p> 
     * @return AutoLoadBalance <p>Whether self-adaptive load balancing is enabled. Off by default.</p>
     */
    public Boolean getAutoLoadBalance() {
        return this.AutoLoadBalance;
    }

    /**
     * Set <p>Whether self-adaptive load balancing is enabled. Off by default.</p>
     * @param AutoLoadBalance <p>Whether self-adaptive load balancing is enabled. Off by default.</p>
     */
    public void setAutoLoadBalance(Boolean AutoLoadBalance) {
        this.AutoLoadBalance = AutoLoadBalance;
    }

    /**
     * Get <p>Access mode: nearby - proximity access, balance - balanced allocation. Default is proximity access.</p> 
     * @return AccessMode <p>Access mode: nearby - proximity access, balance - balanced allocation. Default is proximity access.</p>
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set <p>Access mode: nearby - proximity access, balance - balanced allocation. Default is proximity access.</p>
     * @param AccessMode <p>Access mode: nearby - proximity access, balance - balanced allocation. Default is proximity access.</p>
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
     * Get <p>Whether to forward to other nodes in case of a libra node fault</p> 
     * @return ApQueryToOtherNode <p>Whether to forward to other nodes in case of a libra node fault</p>
     */
    public Boolean getApQueryToOtherNode() {
        return this.ApQueryToOtherNode;
    }

    /**
     * Set <p>Whether to forward to other nodes in case of a libra node fault</p>
     * @param ApQueryToOtherNode <p>Whether to forward to other nodes in case of a libra node fault</p>
     */
    public void setApQueryToOtherNode(Boolean ApQueryToOtherNode) {
        this.ApQueryToOtherNode = ApQueryToOtherNode;
    }

    public AdjustCdbProxyAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdjustCdbProxyAddressRequest(AdjustCdbProxyAddressRequest source) {
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.IsKickOut != null) {
            this.IsKickOut = new Boolean(source.IsKickOut);
        }
        if (source.MinCount != null) {
            this.MinCount = new Long(source.MinCount);
        }
        if (source.MaxDelay != null) {
            this.MaxDelay = new Long(source.MaxDelay);
        }
        if (source.FailOver != null) {
            this.FailOver = new Boolean(source.FailOver);
        }
        if (source.AutoAddRo != null) {
            this.AutoAddRo = new Boolean(source.AutoAddRo);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Boolean(source.ReadOnly);
        }
        if (source.ProxyAddressId != null) {
            this.ProxyAddressId = new String(source.ProxyAddressId);
        }
        if (source.TransSplit != null) {
            this.TransSplit = new Boolean(source.TransSplit);
        }
        if (source.ConnectionPool != null) {
            this.ConnectionPool = new Boolean(source.ConnectionPool);
        }
        if (source.ProxyAllocation != null) {
            this.ProxyAllocation = new ProxyAllocation[source.ProxyAllocation.length];
            for (int i = 0; i < source.ProxyAllocation.length; i++) {
                this.ProxyAllocation[i] = new ProxyAllocation(source.ProxyAllocation[i]);
            }
        }
        if (source.AutoLoadBalance != null) {
            this.AutoLoadBalance = new Boolean(source.AutoLoadBalance);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "IsKickOut", this.IsKickOut);
        this.setParamSimple(map, prefix + "MinCount", this.MinCount);
        this.setParamSimple(map, prefix + "MaxDelay", this.MaxDelay);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamSimple(map, prefix + "AutoAddRo", this.AutoAddRo);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "ProxyAddressId", this.ProxyAddressId);
        this.setParamSimple(map, prefix + "TransSplit", this.TransSplit);
        this.setParamSimple(map, prefix + "ConnectionPool", this.ConnectionPool);
        this.setParamArrayObj(map, prefix + "ProxyAllocation.", this.ProxyAllocation);
        this.setParamSimple(map, prefix + "AutoLoadBalance", this.AutoLoadBalance);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamSimple(map, prefix + "ApNodeAsRoNode", this.ApNodeAsRoNode);
        this.setParamSimple(map, prefix + "ApQueryToOtherNode", this.ApQueryToOtherNode);

    }
}

