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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListenerOutput extends AbstractModel {

    /**
    * <p>Whether mutual authentication is enabled.</p>
    */
    @SerializedName("CaEnable")
    @Expose
    private Boolean CaEnable;

    /**
    * <p>Creation time of the listener instance. Format: ISO 8601 (for example, 2025-01-01T08:30:00+08:00)</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Whether to enable Gzip compression.</p>
    */
    @SerializedName("GzipEnabled")
    @Expose
    private Boolean GzipEnabled;

    /**
    * <p>Whether to enable http/2.</p>
    */
    @SerializedName("Http2Enable")
    @Expose
    private Boolean Http2Enable;

    /**
    * <p>Idle timeout period.</p>
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
    * <p>Listener ID, format: lst- followed by 8 alphanumeric characters.</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>Listener name.</p>
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * <p>Listener port.</p>
    */
    @SerializedName("ListenerPort")
    @Expose
    private Long ListenerPort;

    /**
    * <p>Listener protocol.</p>
    */
    @SerializedName("ListenerProtocol")
    @Expose
    private String ListenerProtocol;

    /**
    * <p>Listener status. Value:</p><ul><li><strong>Active</strong>: Running.</li><li><strong>Provisioning</strong>: Creating.</li><li><strong>Configuring</strong>: Modifying configuration.</li><li><strong>ProvisionFailed</strong>: Creation failed</li></ul>
    */
    @SerializedName("ListenerStatus")
    @Expose
    private String ListenerStatus;

    /**
    * <p>Last change time of the listener instance. Format: ISO 8601 (for example, 2025-01-01T08:30:00+08:00)</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>Connection request timeout period.</p>
    */
    @SerializedName("RequestTimeout")
    @Expose
    private Long RequestTimeout;

    /**
    * <p>Tag.</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>Security policy ID.</p>
    */
    @SerializedName("TlsSecurityPolicyId")
    @Expose
    private String TlsSecurityPolicyId;

    /**
    * <p>XForwardedFor configuration.</p>
    */
    @SerializedName("XForwardedForConfig")
    @Expose
    private XForwardedForConfig XForwardedForConfig;

    /**
     * Get <p>Whether mutual authentication is enabled.</p> 
     * @return CaEnable <p>Whether mutual authentication is enabled.</p>
     */
    public Boolean getCaEnable() {
        return this.CaEnable;
    }

    /**
     * Set <p>Whether mutual authentication is enabled.</p>
     * @param CaEnable <p>Whether mutual authentication is enabled.</p>
     */
    public void setCaEnable(Boolean CaEnable) {
        this.CaEnable = CaEnable;
    }

    /**
     * Get <p>Creation time of the listener instance. Format: ISO 8601 (for example, 2025-01-01T08:30:00+08:00)</p> 
     * @return CreateTime <p>Creation time of the listener instance. Format: ISO 8601 (for example, 2025-01-01T08:30:00+08:00)</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time of the listener instance. Format: ISO 8601 (for example, 2025-01-01T08:30:00+08:00)</p>
     * @param CreateTime <p>Creation time of the listener instance. Format: ISO 8601 (for example, 2025-01-01T08:30:00+08:00)</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Whether to enable Gzip compression.</p> 
     * @return GzipEnabled <p>Whether to enable Gzip compression.</p>
     */
    public Boolean getGzipEnabled() {
        return this.GzipEnabled;
    }

    /**
     * Set <p>Whether to enable Gzip compression.</p>
     * @param GzipEnabled <p>Whether to enable Gzip compression.</p>
     */
    public void setGzipEnabled(Boolean GzipEnabled) {
        this.GzipEnabled = GzipEnabled;
    }

    /**
     * Get <p>Whether to enable http/2.</p> 
     * @return Http2Enable <p>Whether to enable http/2.</p>
     */
    public Boolean getHttp2Enable() {
        return this.Http2Enable;
    }

    /**
     * Set <p>Whether to enable http/2.</p>
     * @param Http2Enable <p>Whether to enable http/2.</p>
     */
    public void setHttp2Enable(Boolean Http2Enable) {
        this.Http2Enable = Http2Enable;
    }

    /**
     * Get <p>Idle timeout period.</p> 
     * @return IdleTimeout <p>Idle timeout period.</p>
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set <p>Idle timeout period.</p>
     * @param IdleTimeout <p>Idle timeout period.</p>
     */
    public void setIdleTimeout(Long IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

    /**
     * Get <p>Listener ID, format: lst- followed by 8 alphanumeric characters.</p> 
     * @return ListenerId <p>Listener ID, format: lst- followed by 8 alphanumeric characters.</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>Listener ID, format: lst- followed by 8 alphanumeric characters.</p>
     * @param ListenerId <p>Listener ID, format: lst- followed by 8 alphanumeric characters.</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>Listener name.</p> 
     * @return ListenerName <p>Listener name.</p>
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set <p>Listener name.</p>
     * @param ListenerName <p>Listener name.</p>
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get <p>Listener port.</p> 
     * @return ListenerPort <p>Listener port.</p>
     */
    public Long getListenerPort() {
        return this.ListenerPort;
    }

    /**
     * Set <p>Listener port.</p>
     * @param ListenerPort <p>Listener port.</p>
     */
    public void setListenerPort(Long ListenerPort) {
        this.ListenerPort = ListenerPort;
    }

    /**
     * Get <p>Listener protocol.</p> 
     * @return ListenerProtocol <p>Listener protocol.</p>
     */
    public String getListenerProtocol() {
        return this.ListenerProtocol;
    }

    /**
     * Set <p>Listener protocol.</p>
     * @param ListenerProtocol <p>Listener protocol.</p>
     */
    public void setListenerProtocol(String ListenerProtocol) {
        this.ListenerProtocol = ListenerProtocol;
    }

    /**
     * Get <p>Listener status. Value:</p><ul><li><strong>Active</strong>: Running.</li><li><strong>Provisioning</strong>: Creating.</li><li><strong>Configuring</strong>: Modifying configuration.</li><li><strong>ProvisionFailed</strong>: Creation failed</li></ul> 
     * @return ListenerStatus <p>Listener status. Value:</p><ul><li><strong>Active</strong>: Running.</li><li><strong>Provisioning</strong>: Creating.</li><li><strong>Configuring</strong>: Modifying configuration.</li><li><strong>ProvisionFailed</strong>: Creation failed</li></ul>
     */
    public String getListenerStatus() {
        return this.ListenerStatus;
    }

    /**
     * Set <p>Listener status. Value:</p><ul><li><strong>Active</strong>: Running.</li><li><strong>Provisioning</strong>: Creating.</li><li><strong>Configuring</strong>: Modifying configuration.</li><li><strong>ProvisionFailed</strong>: Creation failed</li></ul>
     * @param ListenerStatus <p>Listener status. Value:</p><ul><li><strong>Active</strong>: Running.</li><li><strong>Provisioning</strong>: Creating.</li><li><strong>Configuring</strong>: Modifying configuration.</li><li><strong>ProvisionFailed</strong>: Creation failed</li></ul>
     */
    public void setListenerStatus(String ListenerStatus) {
        this.ListenerStatus = ListenerStatus;
    }

    /**
     * Get <p>Last change time of the listener instance. Format: ISO 8601 (for example, 2025-01-01T08:30:00+08:00)</p> 
     * @return ModifyTime <p>Last change time of the listener instance. Format: ISO 8601 (for example, 2025-01-01T08:30:00+08:00)</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>Last change time of the listener instance. Format: ISO 8601 (for example, 2025-01-01T08:30:00+08:00)</p>
     * @param ModifyTime <p>Last change time of the listener instance. Format: ISO 8601 (for example, 2025-01-01T08:30:00+08:00)</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>Connection request timeout period.</p> 
     * @return RequestTimeout <p>Connection request timeout period.</p>
     */
    public Long getRequestTimeout() {
        return this.RequestTimeout;
    }

    /**
     * Set <p>Connection request timeout period.</p>
     * @param RequestTimeout <p>Connection request timeout period.</p>
     */
    public void setRequestTimeout(Long RequestTimeout) {
        this.RequestTimeout = RequestTimeout;
    }

    /**
     * Get <p>Tag.</p> 
     * @return Tags <p>Tag.</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag.</p>
     * @param Tags <p>Tag.</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Security policy ID.</p> 
     * @return TlsSecurityPolicyId <p>Security policy ID.</p>
     */
    public String getTlsSecurityPolicyId() {
        return this.TlsSecurityPolicyId;
    }

    /**
     * Set <p>Security policy ID.</p>
     * @param TlsSecurityPolicyId <p>Security policy ID.</p>
     */
    public void setTlsSecurityPolicyId(String TlsSecurityPolicyId) {
        this.TlsSecurityPolicyId = TlsSecurityPolicyId;
    }

    /**
     * Get <p>XForwardedFor configuration.</p> 
     * @return XForwardedForConfig <p>XForwardedFor configuration.</p>
     */
    public XForwardedForConfig getXForwardedForConfig() {
        return this.XForwardedForConfig;
    }

    /**
     * Set <p>XForwardedFor configuration.</p>
     * @param XForwardedForConfig <p>XForwardedFor configuration.</p>
     */
    public void setXForwardedForConfig(XForwardedForConfig XForwardedForConfig) {
        this.XForwardedForConfig = XForwardedForConfig;
    }

    public ListenerOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListenerOutput(ListenerOutput source) {
        if (source.CaEnable != null) {
            this.CaEnable = new Boolean(source.CaEnable);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.GzipEnabled != null) {
            this.GzipEnabled = new Boolean(source.GzipEnabled);
        }
        if (source.Http2Enable != null) {
            this.Http2Enable = new Boolean(source.Http2Enable);
        }
        if (source.IdleTimeout != null) {
            this.IdleTimeout = new Long(source.IdleTimeout);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.ListenerPort != null) {
            this.ListenerPort = new Long(source.ListenerPort);
        }
        if (source.ListenerProtocol != null) {
            this.ListenerProtocol = new String(source.ListenerProtocol);
        }
        if (source.ListenerStatus != null) {
            this.ListenerStatus = new String(source.ListenerStatus);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.RequestTimeout != null) {
            this.RequestTimeout = new Long(source.RequestTimeout);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.TlsSecurityPolicyId != null) {
            this.TlsSecurityPolicyId = new String(source.TlsSecurityPolicyId);
        }
        if (source.XForwardedForConfig != null) {
            this.XForwardedForConfig = new XForwardedForConfig(source.XForwardedForConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaEnable", this.CaEnable);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "GzipEnabled", this.GzipEnabled);
        this.setParamSimple(map, prefix + "Http2Enable", this.Http2Enable);
        this.setParamSimple(map, prefix + "IdleTimeout", this.IdleTimeout);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "ListenerPort", this.ListenerPort);
        this.setParamSimple(map, prefix + "ListenerProtocol", this.ListenerProtocol);
        this.setParamSimple(map, prefix + "ListenerStatus", this.ListenerStatus);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "RequestTimeout", this.RequestTimeout);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "TlsSecurityPolicyId", this.TlsSecurityPolicyId);
        this.setParamObj(map, prefix + "XForwardedForConfig.", this.XForwardedForConfig);

    }
}

