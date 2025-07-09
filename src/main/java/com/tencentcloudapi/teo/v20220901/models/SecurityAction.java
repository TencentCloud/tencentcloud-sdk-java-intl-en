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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityAction extends AbstractModel {

    /**
    * Specific action name for security operation. Values:
<li>`Deny`: block</li> <li>`Monitor`: monitor</li> <li>`ReturnCustomPage`: block with customized page</li> <li>`Redirect`: Redirect to URL</li> <li>`BlockIP`: IP block</li> <li>`JSChallenge`: javaScript challenge</li> <li>`ManagedChallenge`: managed challenge</li> <li>`Disabled`: disabled</li> <li>`Allow`: allow</li>.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Additional parameter when Name is BlockIP.
    */
    @SerializedName("BlockIPActionParameters")
    @Expose
    private BlockIPActionParameters BlockIPActionParameters;

    /**
    * Additional parameter when Name is ReturnCustomPage.
    */
    @SerializedName("ReturnCustomPageActionParameters")
    @Expose
    private ReturnCustomPageActionParameters ReturnCustomPageActionParameters;

    /**
    * Additional parameter when Name is Redirect.
    */
    @SerializedName("RedirectActionParameters")
    @Expose
    private RedirectActionParameters RedirectActionParameters;

    /**
     * Get Specific action name for security operation. Values:
<li>`Deny`: block</li> <li>`Monitor`: monitor</li> <li>`ReturnCustomPage`: block with customized page</li> <li>`Redirect`: Redirect to URL</li> <li>`BlockIP`: IP block</li> <li>`JSChallenge`: javaScript challenge</li> <li>`ManagedChallenge`: managed challenge</li> <li>`Disabled`: disabled</li> <li>`Allow`: allow</li>. 
     * @return Name Specific action name for security operation. Values:
<li>`Deny`: block</li> <li>`Monitor`: monitor</li> <li>`ReturnCustomPage`: block with customized page</li> <li>`Redirect`: Redirect to URL</li> <li>`BlockIP`: IP block</li> <li>`JSChallenge`: javaScript challenge</li> <li>`ManagedChallenge`: managed challenge</li> <li>`Disabled`: disabled</li> <li>`Allow`: allow</li>.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Specific action name for security operation. Values:
<li>`Deny`: block</li> <li>`Monitor`: monitor</li> <li>`ReturnCustomPage`: block with customized page</li> <li>`Redirect`: Redirect to URL</li> <li>`BlockIP`: IP block</li> <li>`JSChallenge`: javaScript challenge</li> <li>`ManagedChallenge`: managed challenge</li> <li>`Disabled`: disabled</li> <li>`Allow`: allow</li>.
     * @param Name Specific action name for security operation. Values:
<li>`Deny`: block</li> <li>`Monitor`: monitor</li> <li>`ReturnCustomPage`: block with customized page</li> <li>`Redirect`: Redirect to URL</li> <li>`BlockIP`: IP block</li> <li>`JSChallenge`: javaScript challenge</li> <li>`ManagedChallenge`: managed challenge</li> <li>`Disabled`: disabled</li> <li>`Allow`: allow</li>.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Additional parameter when Name is BlockIP. 
     * @return BlockIPActionParameters Additional parameter when Name is BlockIP.
     */
    public BlockIPActionParameters getBlockIPActionParameters() {
        return this.BlockIPActionParameters;
    }

    /**
     * Set Additional parameter when Name is BlockIP.
     * @param BlockIPActionParameters Additional parameter when Name is BlockIP.
     */
    public void setBlockIPActionParameters(BlockIPActionParameters BlockIPActionParameters) {
        this.BlockIPActionParameters = BlockIPActionParameters;
    }

    /**
     * Get Additional parameter when Name is ReturnCustomPage. 
     * @return ReturnCustomPageActionParameters Additional parameter when Name is ReturnCustomPage.
     */
    public ReturnCustomPageActionParameters getReturnCustomPageActionParameters() {
        return this.ReturnCustomPageActionParameters;
    }

    /**
     * Set Additional parameter when Name is ReturnCustomPage.
     * @param ReturnCustomPageActionParameters Additional parameter when Name is ReturnCustomPage.
     */
    public void setReturnCustomPageActionParameters(ReturnCustomPageActionParameters ReturnCustomPageActionParameters) {
        this.ReturnCustomPageActionParameters = ReturnCustomPageActionParameters;
    }

    /**
     * Get Additional parameter when Name is Redirect. 
     * @return RedirectActionParameters Additional parameter when Name is Redirect.
     */
    public RedirectActionParameters getRedirectActionParameters() {
        return this.RedirectActionParameters;
    }

    /**
     * Set Additional parameter when Name is Redirect.
     * @param RedirectActionParameters Additional parameter when Name is Redirect.
     */
    public void setRedirectActionParameters(RedirectActionParameters RedirectActionParameters) {
        this.RedirectActionParameters = RedirectActionParameters;
    }

    public SecurityAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityAction(SecurityAction source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.BlockIPActionParameters != null) {
            this.BlockIPActionParameters = new BlockIPActionParameters(source.BlockIPActionParameters);
        }
        if (source.ReturnCustomPageActionParameters != null) {
            this.ReturnCustomPageActionParameters = new ReturnCustomPageActionParameters(source.ReturnCustomPageActionParameters);
        }
        if (source.RedirectActionParameters != null) {
            this.RedirectActionParameters = new RedirectActionParameters(source.RedirectActionParameters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "BlockIPActionParameters.", this.BlockIPActionParameters);
        this.setParamObj(map, prefix + "ReturnCustomPageActionParameters.", this.ReturnCustomPageActionParameters);
        this.setParamObj(map, prefix + "RedirectActionParameters.", this.RedirectActionParameters);

    }
}

