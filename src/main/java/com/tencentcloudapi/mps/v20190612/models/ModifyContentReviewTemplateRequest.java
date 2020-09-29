/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyContentReviewTemplateRequest extends AbstractModel{

    /**
    * Unique ID of a content audit template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Name of a content audit template. Length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description of a content audit template. Length limit: 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Porn information detection control parameter.
    */
    @SerializedName("PornConfigure")
    @Expose
    private PornConfigureInfoForUpdate PornConfigure;

    /**
    * Terrorism information detection control parameter.
    */
    @SerializedName("TerrorismConfigure")
    @Expose
    private TerrorismConfigureInfoForUpdate TerrorismConfigure;

    /**
    * Politically sensitive information detection control parameter.
    */
    @SerializedName("PoliticalConfigure")
    @Expose
    private PoliticalConfigureInfoForUpdate PoliticalConfigure;

    /**
    * Control parameter of prohibited information detection. Prohibited information includes:
<li>Abusive;</li>
<li>Drug-related.</li>
Note: this parameter is not supported yet.
    */
    @SerializedName("ProhibitedConfigure")
    @Expose
    private ProhibitedConfigureInfoForUpdate ProhibitedConfigure;

    /**
    * Custom content audit control parameter.
    */
    @SerializedName("UserDefineConfigure")
    @Expose
    private UserDefineConfigureInfoForUpdate UserDefineConfigure;

    /**
     * Get Unique ID of a content audit template. 
     * @return Definition Unique ID of a content audit template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique ID of a content audit template.
     * @param Definition Unique ID of a content audit template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Name of a content audit template. Length limit: 64 characters. 
     * @return Name Name of a content audit template. Length limit: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of a content audit template. Length limit: 64 characters.
     * @param Name Name of a content audit template. Length limit: 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description of a content audit template. Length limit: 256 characters. 
     * @return Comment Description of a content audit template. Length limit: 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Description of a content audit template. Length limit: 256 characters.
     * @param Comment Description of a content audit template. Length limit: 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Porn information detection control parameter. 
     * @return PornConfigure Porn information detection control parameter.
     */
    public PornConfigureInfoForUpdate getPornConfigure() {
        return this.PornConfigure;
    }

    /**
     * Set Porn information detection control parameter.
     * @param PornConfigure Porn information detection control parameter.
     */
    public void setPornConfigure(PornConfigureInfoForUpdate PornConfigure) {
        this.PornConfigure = PornConfigure;
    }

    /**
     * Get Terrorism information detection control parameter. 
     * @return TerrorismConfigure Terrorism information detection control parameter.
     */
    public TerrorismConfigureInfoForUpdate getTerrorismConfigure() {
        return this.TerrorismConfigure;
    }

    /**
     * Set Terrorism information detection control parameter.
     * @param TerrorismConfigure Terrorism information detection control parameter.
     */
    public void setTerrorismConfigure(TerrorismConfigureInfoForUpdate TerrorismConfigure) {
        this.TerrorismConfigure = TerrorismConfigure;
    }

    /**
     * Get Politically sensitive information detection control parameter. 
     * @return PoliticalConfigure Politically sensitive information detection control parameter.
     */
    public PoliticalConfigureInfoForUpdate getPoliticalConfigure() {
        return this.PoliticalConfigure;
    }

    /**
     * Set Politically sensitive information detection control parameter.
     * @param PoliticalConfigure Politically sensitive information detection control parameter.
     */
    public void setPoliticalConfigure(PoliticalConfigureInfoForUpdate PoliticalConfigure) {
        this.PoliticalConfigure = PoliticalConfigure;
    }

    /**
     * Get Control parameter of prohibited information detection. Prohibited information includes:
<li>Abusive;</li>
<li>Drug-related.</li>
Note: this parameter is not supported yet. 
     * @return ProhibitedConfigure Control parameter of prohibited information detection. Prohibited information includes:
<li>Abusive;</li>
<li>Drug-related.</li>
Note: this parameter is not supported yet.
     */
    public ProhibitedConfigureInfoForUpdate getProhibitedConfigure() {
        return this.ProhibitedConfigure;
    }

    /**
     * Set Control parameter of prohibited information detection. Prohibited information includes:
<li>Abusive;</li>
<li>Drug-related.</li>
Note: this parameter is not supported yet.
     * @param ProhibitedConfigure Control parameter of prohibited information detection. Prohibited information includes:
<li>Abusive;</li>
<li>Drug-related.</li>
Note: this parameter is not supported yet.
     */
    public void setProhibitedConfigure(ProhibitedConfigureInfoForUpdate ProhibitedConfigure) {
        this.ProhibitedConfigure = ProhibitedConfigure;
    }

    /**
     * Get Custom content audit control parameter. 
     * @return UserDefineConfigure Custom content audit control parameter.
     */
    public UserDefineConfigureInfoForUpdate getUserDefineConfigure() {
        return this.UserDefineConfigure;
    }

    /**
     * Set Custom content audit control parameter.
     * @param UserDefineConfigure Custom content audit control parameter.
     */
    public void setUserDefineConfigure(UserDefineConfigureInfoForUpdate UserDefineConfigure) {
        this.UserDefineConfigure = UserDefineConfigure;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "PornConfigure.", this.PornConfigure);
        this.setParamObj(map, prefix + "TerrorismConfigure.", this.TerrorismConfigure);
        this.setParamObj(map, prefix + "PoliticalConfigure.", this.PoliticalConfigure);
        this.setParamObj(map, prefix + "ProhibitedConfigure.", this.ProhibitedConfigure);
        this.setParamObj(map, prefix + "UserDefineConfigure.", this.UserDefineConfigure);

    }
}

