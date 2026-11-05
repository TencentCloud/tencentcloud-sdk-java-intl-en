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

public class CallSource extends AbstractModel {

    /**
    * <p>Caller ID, whose meaning is determined by subject_type (such as app_id, kb_id)</p>
    */
    @SerializedName("SubjectId")
    @Expose
    private String SubjectId;

    /**
    * <p>Name of the calling entity</p>
    */
    @SerializedName("SubjectName")
    @Expose
    private String SubjectName;

    /**
    * <p>Caller type: APP/KB/WIDGET/OPEN_CLAW/KB_RECALL_TEST/WORKBENCH/MODEL_API</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>METRIC_SOURCE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>METRIC_SOURCE_TYPE_APP</td><td>1</td><td>Application development</td></tr><tr><td>METRIC_SOURCE_TYPE_KB</td><td>2</td><td>Knowledge base</td></tr><tr><td>METRIC_SOURCE_TYPE_WIDGET</td><td>3</td><td>Widget</td></tr><tr><td>METRIC_SOURCE_TYPE_OPEN_CLAW</td><td>4</td><td>ClawPro</td></tr><tr><td>METRIC_SOURCE_TYPE_KB_RECALL_TEST</td><td>5</td><td>Knowledge base recall test</td></tr><tr><td>METRIC_SOURCE_TYPE_WORKBENCH</td><td>6</td><td>Intelligent workbench</td></tr><tr><td>METRIC_SOURCE_TYPE_MODEL_API</td><td>7</td><td>Model API call</td></tr></tbody></table>
    */
    @SerializedName("SubjectType")
    @Expose
    private Long SubjectType;

    /**
     * Get <p>Caller ID, whose meaning is determined by subject_type (such as app_id, kb_id)</p> 
     * @return SubjectId <p>Caller ID, whose meaning is determined by subject_type (such as app_id, kb_id)</p>
     */
    public String getSubjectId() {
        return this.SubjectId;
    }

    /**
     * Set <p>Caller ID, whose meaning is determined by subject_type (such as app_id, kb_id)</p>
     * @param SubjectId <p>Caller ID, whose meaning is determined by subject_type (such as app_id, kb_id)</p>
     */
    public void setSubjectId(String SubjectId) {
        this.SubjectId = SubjectId;
    }

    /**
     * Get <p>Name of the calling entity</p> 
     * @return SubjectName <p>Name of the calling entity</p>
     */
    public String getSubjectName() {
        return this.SubjectName;
    }

    /**
     * Set <p>Name of the calling entity</p>
     * @param SubjectName <p>Name of the calling entity</p>
     */
    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }

    /**
     * Get <p>Caller type: APP/KB/WIDGET/OPEN_CLAW/KB_RECALL_TEST/WORKBENCH/MODEL_API</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>METRIC_SOURCE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>METRIC_SOURCE_TYPE_APP</td><td>1</td><td>Application development</td></tr><tr><td>METRIC_SOURCE_TYPE_KB</td><td>2</td><td>Knowledge base</td></tr><tr><td>METRIC_SOURCE_TYPE_WIDGET</td><td>3</td><td>Widget</td></tr><tr><td>METRIC_SOURCE_TYPE_OPEN_CLAW</td><td>4</td><td>ClawPro</td></tr><tr><td>METRIC_SOURCE_TYPE_KB_RECALL_TEST</td><td>5</td><td>Knowledge base recall test</td></tr><tr><td>METRIC_SOURCE_TYPE_WORKBENCH</td><td>6</td><td>Intelligent workbench</td></tr><tr><td>METRIC_SOURCE_TYPE_MODEL_API</td><td>7</td><td>Model API call</td></tr></tbody></table> 
     * @return SubjectType <p>Caller type: APP/KB/WIDGET/OPEN_CLAW/KB_RECALL_TEST/WORKBENCH/MODEL_API</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>METRIC_SOURCE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>METRIC_SOURCE_TYPE_APP</td><td>1</td><td>Application development</td></tr><tr><td>METRIC_SOURCE_TYPE_KB</td><td>2</td><td>Knowledge base</td></tr><tr><td>METRIC_SOURCE_TYPE_WIDGET</td><td>3</td><td>Widget</td></tr><tr><td>METRIC_SOURCE_TYPE_OPEN_CLAW</td><td>4</td><td>ClawPro</td></tr><tr><td>METRIC_SOURCE_TYPE_KB_RECALL_TEST</td><td>5</td><td>Knowledge base recall test</td></tr><tr><td>METRIC_SOURCE_TYPE_WORKBENCH</td><td>6</td><td>Intelligent workbench</td></tr><tr><td>METRIC_SOURCE_TYPE_MODEL_API</td><td>7</td><td>Model API call</td></tr></tbody></table>
     */
    public Long getSubjectType() {
        return this.SubjectType;
    }

    /**
     * Set <p>Caller type: APP/KB/WIDGET/OPEN_CLAW/KB_RECALL_TEST/WORKBENCH/MODEL_API</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>METRIC_SOURCE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>METRIC_SOURCE_TYPE_APP</td><td>1</td><td>Application development</td></tr><tr><td>METRIC_SOURCE_TYPE_KB</td><td>2</td><td>Knowledge base</td></tr><tr><td>METRIC_SOURCE_TYPE_WIDGET</td><td>3</td><td>Widget</td></tr><tr><td>METRIC_SOURCE_TYPE_OPEN_CLAW</td><td>4</td><td>ClawPro</td></tr><tr><td>METRIC_SOURCE_TYPE_KB_RECALL_TEST</td><td>5</td><td>Knowledge base recall test</td></tr><tr><td>METRIC_SOURCE_TYPE_WORKBENCH</td><td>6</td><td>Intelligent workbench</td></tr><tr><td>METRIC_SOURCE_TYPE_MODEL_API</td><td>7</td><td>Model API call</td></tr></tbody></table>
     * @param SubjectType <p>Caller type: APP/KB/WIDGET/OPEN_CLAW/KB_RECALL_TEST/WORKBENCH/MODEL_API</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>METRIC_SOURCE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>METRIC_SOURCE_TYPE_APP</td><td>1</td><td>Application development</td></tr><tr><td>METRIC_SOURCE_TYPE_KB</td><td>2</td><td>Knowledge base</td></tr><tr><td>METRIC_SOURCE_TYPE_WIDGET</td><td>3</td><td>Widget</td></tr><tr><td>METRIC_SOURCE_TYPE_OPEN_CLAW</td><td>4</td><td>ClawPro</td></tr><tr><td>METRIC_SOURCE_TYPE_KB_RECALL_TEST</td><td>5</td><td>Knowledge base recall test</td></tr><tr><td>METRIC_SOURCE_TYPE_WORKBENCH</td><td>6</td><td>Intelligent workbench</td></tr><tr><td>METRIC_SOURCE_TYPE_MODEL_API</td><td>7</td><td>Model API call</td></tr></tbody></table>
     */
    public void setSubjectType(Long SubjectType) {
        this.SubjectType = SubjectType;
    }

    public CallSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallSource(CallSource source) {
        if (source.SubjectId != null) {
            this.SubjectId = new String(source.SubjectId);
        }
        if (source.SubjectName != null) {
            this.SubjectName = new String(source.SubjectName);
        }
        if (source.SubjectType != null) {
            this.SubjectType = new Long(source.SubjectType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubjectId", this.SubjectId);
        this.setParamSimple(map, prefix + "SubjectName", this.SubjectName);
        this.setParamSimple(map, prefix + "SubjectType", this.SubjectType);

    }
}

