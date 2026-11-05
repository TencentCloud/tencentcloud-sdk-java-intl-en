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

public class ConsumptionDetail extends AbstractModel {

    /**
    * <p>Consumption category (Type/Target/Scenario/Package)</p>
    */
    @SerializedName("Classification")
    @Expose
    private ConsumptionClassification Classification;

    /**
    * <p>Consumption time, Unix seconds.</p>
    */
    @SerializedName("EventTime")
    @Expose
    private String EventTime;

    /**
    * <p>Amount source type</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>METRIC_SOURCE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>METRIC_SOURCE_TYPE_APP</td><td>1</td><td>Application development</td></tr><tr><td>METRIC_SOURCE_TYPE_KB</td><td>2</td><td>Knowledge base</td></tr><tr><td>METRIC_SOURCE_TYPE_WIDGET</td><td>3</td><td>Widget</td></tr><tr><td>METRIC_SOURCE_TYPE_OPEN_CLAW</td><td>4</td><td>ClawPro</td></tr><tr><td>METRIC_SOURCE_TYPE_KB_RECALL_TEST</td><td>5</td><td>Knowledge base recall test</td></tr><tr><td>METRIC_SOURCE_TYPE_WORKBENCH</td><td>6</td><td>Intelligent workbench</td></tr><tr><td>METRIC_SOURCE_TYPE_MODEL_API</td><td>7</td><td>Model API calls</td></tr></tbody></table>
    */
    @SerializedName("MetricSourceType")
    @Expose
    private Long MetricSourceType;

    /**
    * <p>Name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Space name</p>
    */
    @SerializedName("SpaceName")
    @Expose
    private String SpaceName;

    /**
    * <p>Consumed usage (numeric value/unit/PU consumption)</p>
    */
    @SerializedName("Usage")
    @Expose
    private ConsumptionUsage Usage;

    /**
    * <p>Username</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
     * Get <p>Consumption category (Type/Target/Scenario/Package)</p> 
     * @return Classification <p>Consumption category (Type/Target/Scenario/Package)</p>
     */
    public ConsumptionClassification getClassification() {
        return this.Classification;
    }

    /**
     * Set <p>Consumption category (Type/Target/Scenario/Package)</p>
     * @param Classification <p>Consumption category (Type/Target/Scenario/Package)</p>
     */
    public void setClassification(ConsumptionClassification Classification) {
        this.Classification = Classification;
    }

    /**
     * Get <p>Consumption time, Unix seconds.</p> 
     * @return EventTime <p>Consumption time, Unix seconds.</p>
     */
    public String getEventTime() {
        return this.EventTime;
    }

    /**
     * Set <p>Consumption time, Unix seconds.</p>
     * @param EventTime <p>Consumption time, Unix seconds.</p>
     */
    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get <p>Amount source type</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>METRIC_SOURCE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>METRIC_SOURCE_TYPE_APP</td><td>1</td><td>Application development</td></tr><tr><td>METRIC_SOURCE_TYPE_KB</td><td>2</td><td>Knowledge base</td></tr><tr><td>METRIC_SOURCE_TYPE_WIDGET</td><td>3</td><td>Widget</td></tr><tr><td>METRIC_SOURCE_TYPE_OPEN_CLAW</td><td>4</td><td>ClawPro</td></tr><tr><td>METRIC_SOURCE_TYPE_KB_RECALL_TEST</td><td>5</td><td>Knowledge base recall test</td></tr><tr><td>METRIC_SOURCE_TYPE_WORKBENCH</td><td>6</td><td>Intelligent workbench</td></tr><tr><td>METRIC_SOURCE_TYPE_MODEL_API</td><td>7</td><td>Model API calls</td></tr></tbody></table> 
     * @return MetricSourceType <p>Amount source type</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>METRIC_SOURCE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>METRIC_SOURCE_TYPE_APP</td><td>1</td><td>Application development</td></tr><tr><td>METRIC_SOURCE_TYPE_KB</td><td>2</td><td>Knowledge base</td></tr><tr><td>METRIC_SOURCE_TYPE_WIDGET</td><td>3</td><td>Widget</td></tr><tr><td>METRIC_SOURCE_TYPE_OPEN_CLAW</td><td>4</td><td>ClawPro</td></tr><tr><td>METRIC_SOURCE_TYPE_KB_RECALL_TEST</td><td>5</td><td>Knowledge base recall test</td></tr><tr><td>METRIC_SOURCE_TYPE_WORKBENCH</td><td>6</td><td>Intelligent workbench</td></tr><tr><td>METRIC_SOURCE_TYPE_MODEL_API</td><td>7</td><td>Model API calls</td></tr></tbody></table>
     */
    public Long getMetricSourceType() {
        return this.MetricSourceType;
    }

    /**
     * Set <p>Amount source type</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>METRIC_SOURCE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>METRIC_SOURCE_TYPE_APP</td><td>1</td><td>Application development</td></tr><tr><td>METRIC_SOURCE_TYPE_KB</td><td>2</td><td>Knowledge base</td></tr><tr><td>METRIC_SOURCE_TYPE_WIDGET</td><td>3</td><td>Widget</td></tr><tr><td>METRIC_SOURCE_TYPE_OPEN_CLAW</td><td>4</td><td>ClawPro</td></tr><tr><td>METRIC_SOURCE_TYPE_KB_RECALL_TEST</td><td>5</td><td>Knowledge base recall test</td></tr><tr><td>METRIC_SOURCE_TYPE_WORKBENCH</td><td>6</td><td>Intelligent workbench</td></tr><tr><td>METRIC_SOURCE_TYPE_MODEL_API</td><td>7</td><td>Model API calls</td></tr></tbody></table>
     * @param MetricSourceType <p>Amount source type</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>METRIC_SOURCE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>METRIC_SOURCE_TYPE_APP</td><td>1</td><td>Application development</td></tr><tr><td>METRIC_SOURCE_TYPE_KB</td><td>2</td><td>Knowledge base</td></tr><tr><td>METRIC_SOURCE_TYPE_WIDGET</td><td>3</td><td>Widget</td></tr><tr><td>METRIC_SOURCE_TYPE_OPEN_CLAW</td><td>4</td><td>ClawPro</td></tr><tr><td>METRIC_SOURCE_TYPE_KB_RECALL_TEST</td><td>5</td><td>Knowledge base recall test</td></tr><tr><td>METRIC_SOURCE_TYPE_WORKBENCH</td><td>6</td><td>Intelligent workbench</td></tr><tr><td>METRIC_SOURCE_TYPE_MODEL_API</td><td>7</td><td>Model API calls</td></tr></tbody></table>
     */
    public void setMetricSourceType(Long MetricSourceType) {
        this.MetricSourceType = MetricSourceType;
    }

    /**
     * Get <p>Name.</p> 
     * @return Name <p>Name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Name.</p>
     * @param Name <p>Name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Space name</p> 
     * @return SpaceName <p>Space name</p>
     */
    public String getSpaceName() {
        return this.SpaceName;
    }

    /**
     * Set <p>Space name</p>
     * @param SpaceName <p>Space name</p>
     */
    public void setSpaceName(String SpaceName) {
        this.SpaceName = SpaceName;
    }

    /**
     * Get <p>Consumed usage (numeric value/unit/PU consumption)</p> 
     * @return Usage <p>Consumed usage (numeric value/unit/PU consumption)</p>
     */
    public ConsumptionUsage getUsage() {
        return this.Usage;
    }

    /**
     * Set <p>Consumed usage (numeric value/unit/PU consumption)</p>
     * @param Usage <p>Consumed usage (numeric value/unit/PU consumption)</p>
     */
    public void setUsage(ConsumptionUsage Usage) {
        this.Usage = Usage;
    }

    /**
     * Get <p>Username</p> 
     * @return UserName <p>Username</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>Username</p>
     * @param UserName <p>Username</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public ConsumptionDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumptionDetail(ConsumptionDetail source) {
        if (source.Classification != null) {
            this.Classification = new ConsumptionClassification(source.Classification);
        }
        if (source.EventTime != null) {
            this.EventTime = new String(source.EventTime);
        }
        if (source.MetricSourceType != null) {
            this.MetricSourceType = new Long(source.MetricSourceType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SpaceName != null) {
            this.SpaceName = new String(source.SpaceName);
        }
        if (source.Usage != null) {
            this.Usage = new ConsumptionUsage(source.Usage);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Classification.", this.Classification);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamSimple(map, prefix + "MetricSourceType", this.MetricSourceType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SpaceName", this.SpaceName);
        this.setParamObj(map, prefix + "Usage.", this.Usage);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}

