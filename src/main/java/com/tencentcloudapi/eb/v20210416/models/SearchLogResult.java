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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchLogResult extends AbstractModel {

    /**
    * Log reported time
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * Log details
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Event source
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * The event type.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Event matching rule
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleIds")
    @Expose
    private String RuleIds;

    /**
    * The instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * The region.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Event status
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Log reported time
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Timestamp Log reported time
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Log reported time
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Timestamp Log reported time
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Log details
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Message Log details
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Log details
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Message Log details
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Event source
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Source Event source
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Event source
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Source Event source
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get The event type.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Type The event type.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The event type.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Type The event type.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Event matching rule
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return RuleIds Event matching rule
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set Event matching rule
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param RuleIds Event matching rule
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setRuleIds(String RuleIds) {
        this.RuleIds = RuleIds;
    }

    /**
     * Get The instance ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Subject The instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set The instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Subject The instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * Get The region.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Region The region.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set The region.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Region The region.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Event status
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Status Event status
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Event status
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Status Event status
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public SearchLogResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchLogResult(SearchLogResult source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RuleIds != null) {
            this.RuleIds = new String(source.RuleIds);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RuleIds", this.RuleIds);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

