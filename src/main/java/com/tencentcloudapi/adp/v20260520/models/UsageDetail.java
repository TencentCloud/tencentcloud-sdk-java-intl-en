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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsageDetail extends AbstractModel {

    /**
    * <p>Invocation source</p>
    */
    @SerializedName("CallSource")
    @Expose
    private CallSource CallSource;

    /**
    * <p>Measurement ID, used for reconciliation/tracing</p>
    */
    @SerializedName("DosageId")
    @Expose
    private String DosageId;

    /**
    * <p>Call timestamp (Unix seconds).</p>
    */
    @SerializedName("EventTime")
    @Expose
    private String EventTime;

    /**
    * <p>Exclusive to MODEL domain</p>
    */
    @SerializedName("Model")
    @Expose
    private ModelUsageDetail Model;

    /**
    * <p>Exclusive to the PLUGIN domain</p>
    */
    @SerializedName("Plugin")
    @Expose
    private PluginUsageDetail Plugin;

    /**
    * <p>Call chain tracing ID</p>
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
    * <p>User ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get <p>Invocation source</p> 
     * @return CallSource <p>Invocation source</p>
     */
    public CallSource getCallSource() {
        return this.CallSource;
    }

    /**
     * Set <p>Invocation source</p>
     * @param CallSource <p>Invocation source</p>
     */
    public void setCallSource(CallSource CallSource) {
        this.CallSource = CallSource;
    }

    /**
     * Get <p>Measurement ID, used for reconciliation/tracing</p> 
     * @return DosageId <p>Measurement ID, used for reconciliation/tracing</p>
     */
    public String getDosageId() {
        return this.DosageId;
    }

    /**
     * Set <p>Measurement ID, used for reconciliation/tracing</p>
     * @param DosageId <p>Measurement ID, used for reconciliation/tracing</p>
     */
    public void setDosageId(String DosageId) {
        this.DosageId = DosageId;
    }

    /**
     * Get <p>Call timestamp (Unix seconds).</p> 
     * @return EventTime <p>Call timestamp (Unix seconds).</p>
     */
    public String getEventTime() {
        return this.EventTime;
    }

    /**
     * Set <p>Call timestamp (Unix seconds).</p>
     * @param EventTime <p>Call timestamp (Unix seconds).</p>
     */
    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get <p>Exclusive to MODEL domain</p> 
     * @return Model <p>Exclusive to MODEL domain</p>
     */
    public ModelUsageDetail getModel() {
        return this.Model;
    }

    /**
     * Set <p>Exclusive to MODEL domain</p>
     * @param Model <p>Exclusive to MODEL domain</p>
     */
    public void setModel(ModelUsageDetail Model) {
        this.Model = Model;
    }

    /**
     * Get <p>Exclusive to the PLUGIN domain</p> 
     * @return Plugin <p>Exclusive to the PLUGIN domain</p>
     */
    public PluginUsageDetail getPlugin() {
        return this.Plugin;
    }

    /**
     * Set <p>Exclusive to the PLUGIN domain</p>
     * @param Plugin <p>Exclusive to the PLUGIN domain</p>
     */
    public void setPlugin(PluginUsageDetail Plugin) {
        this.Plugin = Plugin;
    }

    /**
     * Get <p>Call chain tracing ID</p> 
     * @return TraceId <p>Call chain tracing ID</p>
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * Set <p>Call chain tracing ID</p>
     * @param TraceId <p>Call chain tracing ID</p>
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
    }

    /**
     * Get <p>User ID</p> 
     * @return UserId <p>User ID</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>User ID</p>
     * @param UserId <p>User ID</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public UsageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageDetail(UsageDetail source) {
        if (source.CallSource != null) {
            this.CallSource = new CallSource(source.CallSource);
        }
        if (source.DosageId != null) {
            this.DosageId = new String(source.DosageId);
        }
        if (source.EventTime != null) {
            this.EventTime = new String(source.EventTime);
        }
        if (source.Model != null) {
            this.Model = new ModelUsageDetail(source.Model);
        }
        if (source.Plugin != null) {
            this.Plugin = new PluginUsageDetail(source.Plugin);
        }
        if (source.TraceId != null) {
            this.TraceId = new String(source.TraceId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CallSource.", this.CallSource);
        this.setParamSimple(map, prefix + "DosageId", this.DosageId);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamObj(map, prefix + "Model.", this.Model);
        this.setParamObj(map, prefix + "Plugin.", this.Plugin);
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

