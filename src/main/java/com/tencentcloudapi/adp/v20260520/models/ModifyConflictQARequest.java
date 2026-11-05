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

public class ModifyConflictQARequest extends AbstractModel {

    /**
    * <p>Knowledge base ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>Conflict group ID (optional if ignored globally)</p>
    */
    @SerializedName("ConflictGroupId")
    @Expose
    private String ConflictGroupId;

    /**
    * <p>Whether to ignore globally (ignore all pending conflict issues under the current KB)</p>
    */
    @SerializedName("IsIgnoreAll")
    @Expose
    private Boolean IsIgnoreAll;

    /**
    * <p>QA ID list involved in decision-making (required for KEEP and DELETE)</p>
    */
    @SerializedName("QaIdList")
    @Expose
    private String [] QaIdList;

    /**
    * <p>Conflict resolution policy: 1=reserve, 2=ignore, 3=delete (can be omitted when ignored globally)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>CONFLICT_RESOLUTION_UNKNOWN</td><td>0</td><td>-</td></tr><tr><td>CONFLICT_RESOLUTION_KEEP</td><td>1</td><td>Reserve</td></tr><tr><td>CONFLICT_RESOLUTION_IGNORE</td><td>2</td><td>Ignore</td></tr><tr><td>CONFLICT_RESOLUTION_DELETE</td><td>3</td><td>Delete</td></tr></tbody></table></p>
    */
    @SerializedName("Resolution")
    @Expose
    private Long Resolution;

    /**
     * Get <p>Knowledge base ID</p> 
     * @return KbId <p>Knowledge base ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>Knowledge base ID</p>
     * @param KbId <p>Knowledge base ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>Conflict group ID (optional if ignored globally)</p> 
     * @return ConflictGroupId <p>Conflict group ID (optional if ignored globally)</p>
     */
    public String getConflictGroupId() {
        return this.ConflictGroupId;
    }

    /**
     * Set <p>Conflict group ID (optional if ignored globally)</p>
     * @param ConflictGroupId <p>Conflict group ID (optional if ignored globally)</p>
     */
    public void setConflictGroupId(String ConflictGroupId) {
        this.ConflictGroupId = ConflictGroupId;
    }

    /**
     * Get <p>Whether to ignore globally (ignore all pending conflict issues under the current KB)</p> 
     * @return IsIgnoreAll <p>Whether to ignore globally (ignore all pending conflict issues under the current KB)</p>
     */
    public Boolean getIsIgnoreAll() {
        return this.IsIgnoreAll;
    }

    /**
     * Set <p>Whether to ignore globally (ignore all pending conflict issues under the current KB)</p>
     * @param IsIgnoreAll <p>Whether to ignore globally (ignore all pending conflict issues under the current KB)</p>
     */
    public void setIsIgnoreAll(Boolean IsIgnoreAll) {
        this.IsIgnoreAll = IsIgnoreAll;
    }

    /**
     * Get <p>QA ID list involved in decision-making (required for KEEP and DELETE)</p> 
     * @return QaIdList <p>QA ID list involved in decision-making (required for KEEP and DELETE)</p>
     */
    public String [] getQaIdList() {
        return this.QaIdList;
    }

    /**
     * Set <p>QA ID list involved in decision-making (required for KEEP and DELETE)</p>
     * @param QaIdList <p>QA ID list involved in decision-making (required for KEEP and DELETE)</p>
     */
    public void setQaIdList(String [] QaIdList) {
        this.QaIdList = QaIdList;
    }

    /**
     * Get <p>Conflict resolution policy: 1=reserve, 2=ignore, 3=delete (can be omitted when ignored globally)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>CONFLICT_RESOLUTION_UNKNOWN</td><td>0</td><td>-</td></tr><tr><td>CONFLICT_RESOLUTION_KEEP</td><td>1</td><td>Reserve</td></tr><tr><td>CONFLICT_RESOLUTION_IGNORE</td><td>2</td><td>Ignore</td></tr><tr><td>CONFLICT_RESOLUTION_DELETE</td><td>3</td><td>Delete</td></tr></tbody></table></p> 
     * @return Resolution <p>Conflict resolution policy: 1=reserve, 2=ignore, 3=delete (can be omitted when ignored globally)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>CONFLICT_RESOLUTION_UNKNOWN</td><td>0</td><td>-</td></tr><tr><td>CONFLICT_RESOLUTION_KEEP</td><td>1</td><td>Reserve</td></tr><tr><td>CONFLICT_RESOLUTION_IGNORE</td><td>2</td><td>Ignore</td></tr><tr><td>CONFLICT_RESOLUTION_DELETE</td><td>3</td><td>Delete</td></tr></tbody></table></p>
     */
    public Long getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>Conflict resolution policy: 1=reserve, 2=ignore, 3=delete (can be omitted when ignored globally)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>CONFLICT_RESOLUTION_UNKNOWN</td><td>0</td><td>-</td></tr><tr><td>CONFLICT_RESOLUTION_KEEP</td><td>1</td><td>Reserve</td></tr><tr><td>CONFLICT_RESOLUTION_IGNORE</td><td>2</td><td>Ignore</td></tr><tr><td>CONFLICT_RESOLUTION_DELETE</td><td>3</td><td>Delete</td></tr></tbody></table></p>
     * @param Resolution <p>Conflict resolution policy: 1=reserve, 2=ignore, 3=delete (can be omitted when ignored globally)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>CONFLICT_RESOLUTION_UNKNOWN</td><td>0</td><td>-</td></tr><tr><td>CONFLICT_RESOLUTION_KEEP</td><td>1</td><td>Reserve</td></tr><tr><td>CONFLICT_RESOLUTION_IGNORE</td><td>2</td><td>Ignore</td></tr><tr><td>CONFLICT_RESOLUTION_DELETE</td><td>3</td><td>Delete</td></tr></tbody></table></p>
     */
    public void setResolution(Long Resolution) {
        this.Resolution = Resolution;
    }

    public ModifyConflictQARequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConflictQARequest(ModifyConflictQARequest source) {
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.ConflictGroupId != null) {
            this.ConflictGroupId = new String(source.ConflictGroupId);
        }
        if (source.IsIgnoreAll != null) {
            this.IsIgnoreAll = new Boolean(source.IsIgnoreAll);
        }
        if (source.QaIdList != null) {
            this.QaIdList = new String[source.QaIdList.length];
            for (int i = 0; i < source.QaIdList.length; i++) {
                this.QaIdList[i] = new String(source.QaIdList[i]);
            }
        }
        if (source.Resolution != null) {
            this.Resolution = new Long(source.Resolution);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "ConflictGroupId", this.ConflictGroupId);
        this.setParamSimple(map, prefix + "IsIgnoreAll", this.IsIgnoreAll);
        this.setParamArraySimple(map, prefix + "QaIdList.", this.QaIdList);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);

    }
}

