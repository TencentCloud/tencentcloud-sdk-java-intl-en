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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoSnapshotTemplateInfo extends AbstractModel {

    /**
    * <p>Screenshot template Id</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>Screenshot template name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Screenshot type</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Frame capturing frequency</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>Multiple mode</p>
    */
    @SerializedName("MultiMode")
    @Expose
    private MultiVideoSnapshotMode MultiMode;

    /**
    * <p>Effective period</p>
    */
    @SerializedName("Times")
    @Expose
    private EffectiveTime [] Times;

    /**
    * <p>Number of configurations associated with the template</p>
    */
    @SerializedName("RelatedConfigCount")
    @Expose
    private Long RelatedConfigCount;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Last update time</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>Screenshot template Id</p> 
     * @return TemplateId <p>Screenshot template Id</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>Screenshot template Id</p>
     * @param TemplateId <p>Screenshot template Id</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>Screenshot template name</p> 
     * @return Name <p>Screenshot template name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Screenshot template name</p>
     * @param Name <p>Screenshot template name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Screenshot type</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul> 
     * @return Type <p>Screenshot type</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Screenshot type</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul>
     * @param Type <p>Screenshot type</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Frame capturing frequency</p> 
     * @return Interval <p>Frame capturing frequency</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>Frame capturing frequency</p>
     * @param Interval <p>Frame capturing frequency</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>Multiple mode</p> 
     * @return MultiMode <p>Multiple mode</p>
     */
    public MultiVideoSnapshotMode getMultiMode() {
        return this.MultiMode;
    }

    /**
     * Set <p>Multiple mode</p>
     * @param MultiMode <p>Multiple mode</p>
     */
    public void setMultiMode(MultiVideoSnapshotMode MultiMode) {
        this.MultiMode = MultiMode;
    }

    /**
     * Get <p>Effective period</p> 
     * @return Times <p>Effective period</p>
     */
    public EffectiveTime [] getTimes() {
        return this.Times;
    }

    /**
     * Set <p>Effective period</p>
     * @param Times <p>Effective period</p>
     */
    public void setTimes(EffectiveTime [] Times) {
        this.Times = Times;
    }

    /**
     * Get <p>Number of configurations associated with the template</p> 
     * @return RelatedConfigCount <p>Number of configurations associated with the template</p>
     */
    public Long getRelatedConfigCount() {
        return this.RelatedConfigCount;
    }

    /**
     * Set <p>Number of configurations associated with the template</p>
     * @param RelatedConfigCount <p>Number of configurations associated with the template</p>
     */
    public void setRelatedConfigCount(Long RelatedConfigCount) {
        this.RelatedConfigCount = RelatedConfigCount;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Last update time</p> 
     * @return UpdateTime <p>Last update time</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Last update time</p>
     * @param UpdateTime <p>Last update time</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public VideoSnapshotTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoSnapshotTemplateInfo(VideoSnapshotTemplateInfo source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.MultiMode != null) {
            this.MultiMode = new MultiVideoSnapshotMode(source.MultiMode);
        }
        if (source.Times != null) {
            this.Times = new EffectiveTime[source.Times.length];
            for (int i = 0; i < source.Times.length; i++) {
                this.Times[i] = new EffectiveTime(source.Times[i]);
            }
        }
        if (source.RelatedConfigCount != null) {
            this.RelatedConfigCount = new Long(source.RelatedConfigCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamObj(map, prefix + "MultiMode.", this.MultiMode);
        this.setParamArrayObj(map, prefix + "Times.", this.Times);
        this.setParamSimple(map, prefix + "RelatedConfigCount", this.RelatedConfigCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

