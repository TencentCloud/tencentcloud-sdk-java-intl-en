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
    * Safe execution actions. valid values:.
<Li>Deny: block request to access site resource;</li>.
<Li>`Monitor`: observe; only record logs</li>.
<li>`Redirect`: Redirect to URL</li>.
<Li>Disabled: disabled; specify rule is not enabled.</li>.
<Li>Allow: allow access but delay processing the request.</li>.
<Li>Challenge: challenge, respond to challenge content;</li>.
<Li>BlockIP: to be deprecated, ip block;</li>.
<Li>`ReturnCustomPage`: to be deprecated, use specified page block;</li>.
<li>JSChallenge: to be deprecated, JavaScript challenge;</li>.
<Li>ManagedChallenge: to be deprecated. managed challenge.</li>.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Additional parameters when Name is Deny.
    */
    @SerializedName("DenyActionParameters")
    @Expose
    private DenyActionParameters DenyActionParameters;

    /**
    * Additional parameter when Name is Redirect.
    */
    @SerializedName("RedirectActionParameters")
    @Expose
    private RedirectActionParameters RedirectActionParameters;

    /**
    * Additional parameters when Name is Allow.
    */
    @SerializedName("AllowActionParameters")
    @Expose
    private AllowActionParameters AllowActionParameters;

    /**
    * Additional parameter when Name is Challenge.
    */
    @SerializedName("ChallengeActionParameters")
    @Expose
    private ChallengeActionParameters ChallengeActionParameters;

    /**
    * To be deprecated, additional parameter when Name is BlockIP.
    */
    @SerializedName("BlockIPActionParameters")
    @Expose
    private BlockIPActionParameters BlockIPActionParameters;

    /**
    * To be deprecated, additional parameter when Name is ReturnCustomPage.
    */
    @SerializedName("ReturnCustomPageActionParameters")
    @Expose
    private ReturnCustomPageActionParameters ReturnCustomPageActionParameters;

    /**
     * Get Safe execution actions. valid values:.
<Li>Deny: block request to access site resource;</li>.
<Li>`Monitor`: observe; only record logs</li>.
<li>`Redirect`: Redirect to URL</li>.
<Li>Disabled: disabled; specify rule is not enabled.</li>.
<Li>Allow: allow access but delay processing the request.</li>.
<Li>Challenge: challenge, respond to challenge content;</li>.
<Li>BlockIP: to be deprecated, ip block;</li>.
<Li>`ReturnCustomPage`: to be deprecated, use specified page block;</li>.
<li>JSChallenge: to be deprecated, JavaScript challenge;</li>.
<Li>ManagedChallenge: to be deprecated. managed challenge.</li>. 
     * @return Name Safe execution actions. valid values:.
<Li>Deny: block request to access site resource;</li>.
<Li>`Monitor`: observe; only record logs</li>.
<li>`Redirect`: Redirect to URL</li>.
<Li>Disabled: disabled; specify rule is not enabled.</li>.
<Li>Allow: allow access but delay processing the request.</li>.
<Li>Challenge: challenge, respond to challenge content;</li>.
<Li>BlockIP: to be deprecated, ip block;</li>.
<Li>`ReturnCustomPage`: to be deprecated, use specified page block;</li>.
<li>JSChallenge: to be deprecated, JavaScript challenge;</li>.
<Li>ManagedChallenge: to be deprecated. managed challenge.</li>.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Safe execution actions. valid values:.
<Li>Deny: block request to access site resource;</li>.
<Li>`Monitor`: observe; only record logs</li>.
<li>`Redirect`: Redirect to URL</li>.
<Li>Disabled: disabled; specify rule is not enabled.</li>.
<Li>Allow: allow access but delay processing the request.</li>.
<Li>Challenge: challenge, respond to challenge content;</li>.
<Li>BlockIP: to be deprecated, ip block;</li>.
<Li>`ReturnCustomPage`: to be deprecated, use specified page block;</li>.
<li>JSChallenge: to be deprecated, JavaScript challenge;</li>.
<Li>ManagedChallenge: to be deprecated. managed challenge.</li>.
     * @param Name Safe execution actions. valid values:.
<Li>Deny: block request to access site resource;</li>.
<Li>`Monitor`: observe; only record logs</li>.
<li>`Redirect`: Redirect to URL</li>.
<Li>Disabled: disabled; specify rule is not enabled.</li>.
<Li>Allow: allow access but delay processing the request.</li>.
<Li>Challenge: challenge, respond to challenge content;</li>.
<Li>BlockIP: to be deprecated, ip block;</li>.
<Li>`ReturnCustomPage`: to be deprecated, use specified page block;</li>.
<li>JSChallenge: to be deprecated, JavaScript challenge;</li>.
<Li>ManagedChallenge: to be deprecated. managed challenge.</li>.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Additional parameters when Name is Deny. 
     * @return DenyActionParameters Additional parameters when Name is Deny.
     */
    public DenyActionParameters getDenyActionParameters() {
        return this.DenyActionParameters;
    }

    /**
     * Set Additional parameters when Name is Deny.
     * @param DenyActionParameters Additional parameters when Name is Deny.
     */
    public void setDenyActionParameters(DenyActionParameters DenyActionParameters) {
        this.DenyActionParameters = DenyActionParameters;
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

    /**
     * Get Additional parameters when Name is Allow. 
     * @return AllowActionParameters Additional parameters when Name is Allow.
     */
    public AllowActionParameters getAllowActionParameters() {
        return this.AllowActionParameters;
    }

    /**
     * Set Additional parameters when Name is Allow.
     * @param AllowActionParameters Additional parameters when Name is Allow.
     */
    public void setAllowActionParameters(AllowActionParameters AllowActionParameters) {
        this.AllowActionParameters = AllowActionParameters;
    }

    /**
     * Get Additional parameter when Name is Challenge. 
     * @return ChallengeActionParameters Additional parameter when Name is Challenge.
     */
    public ChallengeActionParameters getChallengeActionParameters() {
        return this.ChallengeActionParameters;
    }

    /**
     * Set Additional parameter when Name is Challenge.
     * @param ChallengeActionParameters Additional parameter when Name is Challenge.
     */
    public void setChallengeActionParameters(ChallengeActionParameters ChallengeActionParameters) {
        this.ChallengeActionParameters = ChallengeActionParameters;
    }

    /**
     * Get To be deprecated, additional parameter when Name is BlockIP. 
     * @return BlockIPActionParameters To be deprecated, additional parameter when Name is BlockIP.
     */
    public BlockIPActionParameters getBlockIPActionParameters() {
        return this.BlockIPActionParameters;
    }

    /**
     * Set To be deprecated, additional parameter when Name is BlockIP.
     * @param BlockIPActionParameters To be deprecated, additional parameter when Name is BlockIP.
     */
    public void setBlockIPActionParameters(BlockIPActionParameters BlockIPActionParameters) {
        this.BlockIPActionParameters = BlockIPActionParameters;
    }

    /**
     * Get To be deprecated, additional parameter when Name is ReturnCustomPage. 
     * @return ReturnCustomPageActionParameters To be deprecated, additional parameter when Name is ReturnCustomPage.
     */
    public ReturnCustomPageActionParameters getReturnCustomPageActionParameters() {
        return this.ReturnCustomPageActionParameters;
    }

    /**
     * Set To be deprecated, additional parameter when Name is ReturnCustomPage.
     * @param ReturnCustomPageActionParameters To be deprecated, additional parameter when Name is ReturnCustomPage.
     */
    public void setReturnCustomPageActionParameters(ReturnCustomPageActionParameters ReturnCustomPageActionParameters) {
        this.ReturnCustomPageActionParameters = ReturnCustomPageActionParameters;
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
        if (source.DenyActionParameters != null) {
            this.DenyActionParameters = new DenyActionParameters(source.DenyActionParameters);
        }
        if (source.RedirectActionParameters != null) {
            this.RedirectActionParameters = new RedirectActionParameters(source.RedirectActionParameters);
        }
        if (source.AllowActionParameters != null) {
            this.AllowActionParameters = new AllowActionParameters(source.AllowActionParameters);
        }
        if (source.ChallengeActionParameters != null) {
            this.ChallengeActionParameters = new ChallengeActionParameters(source.ChallengeActionParameters);
        }
        if (source.BlockIPActionParameters != null) {
            this.BlockIPActionParameters = new BlockIPActionParameters(source.BlockIPActionParameters);
        }
        if (source.ReturnCustomPageActionParameters != null) {
            this.ReturnCustomPageActionParameters = new ReturnCustomPageActionParameters(source.ReturnCustomPageActionParameters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "DenyActionParameters.", this.DenyActionParameters);
        this.setParamObj(map, prefix + "RedirectActionParameters.", this.RedirectActionParameters);
        this.setParamObj(map, prefix + "AllowActionParameters.", this.AllowActionParameters);
        this.setParamObj(map, prefix + "ChallengeActionParameters.", this.ChallengeActionParameters);
        this.setParamObj(map, prefix + "BlockIPActionParameters.", this.BlockIPActionParameters);
        this.setParamObj(map, prefix + "ReturnCustomPageActionParameters.", this.ReturnCustomPageActionParameters);

    }
}

