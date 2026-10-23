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
    * <p>Specific actions for safe execution. Valid values:</p><ul><li>Deny: block, prevent requests from accessing site resources;</li><li>Monitor: observe, only record logs;</li><li>Redirect: redirect to URL;</li><li>Disabled: not enabled, do not enable the specified rule;</li><li>Allow: pass, skip the remaining rules of the current security module. Delay response when the AllowActionParameters parameter is configured;</li><li>Challenge: challenge, respond with challenge content;</li><li>BlockIP: to be deprecated, IP blocking;</li><li>ReturnCustomPage: to be deprecated, use a specified page for interception;</li><li>JSChallenge: to be deprecated, JavaScript challenge;</li><li>ManagedChallenge: to be deprecated, managed challenge.</li></ul>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Additional parameter when Name is Deny.</p>
    */
    @SerializedName("DenyActionParameters")
    @Expose
    private DenyActionParameters DenyActionParameters;

    /**
    * <p>Additional parameter when Name is Redirect.</p>
    */
    @SerializedName("RedirectActionParameters")
    @Expose
    private RedirectActionParameters RedirectActionParameters;

    /**
    * <p>Additional parameter when Name is Allow.</p>
    */
    @SerializedName("AllowActionParameters")
    @Expose
    private AllowActionParameters AllowActionParameters;

    /**
    * <p>Additional parameter when Name is Challenge.</p>
    */
    @SerializedName("ChallengeActionParameters")
    @Expose
    private ChallengeActionParameters ChallengeActionParameters;

    /**
    * <p>To be deprecated. Additional parameter when Name is BlockIP.</p>
    */
    @SerializedName("BlockIPActionParameters")
    @Expose
    private BlockIPActionParameters BlockIPActionParameters;

    /**
    * <p>To be deprecated. An additional parameter when Name is ReturnCustomPage.</p>
    */
    @SerializedName("ReturnCustomPageActionParameters")
    @Expose
    private ReturnCustomPageActionParameters ReturnCustomPageActionParameters;

    /**
     * Get <p>Specific actions for safe execution. Valid values:</p><ul><li>Deny: block, prevent requests from accessing site resources;</li><li>Monitor: observe, only record logs;</li><li>Redirect: redirect to URL;</li><li>Disabled: not enabled, do not enable the specified rule;</li><li>Allow: pass, skip the remaining rules of the current security module. Delay response when the AllowActionParameters parameter is configured;</li><li>Challenge: challenge, respond with challenge content;</li><li>BlockIP: to be deprecated, IP blocking;</li><li>ReturnCustomPage: to be deprecated, use a specified page for interception;</li><li>JSChallenge: to be deprecated, JavaScript challenge;</li><li>ManagedChallenge: to be deprecated, managed challenge.</li></ul> 
     * @return Name <p>Specific actions for safe execution. Valid values:</p><ul><li>Deny: block, prevent requests from accessing site resources;</li><li>Monitor: observe, only record logs;</li><li>Redirect: redirect to URL;</li><li>Disabled: not enabled, do not enable the specified rule;</li><li>Allow: pass, skip the remaining rules of the current security module. Delay response when the AllowActionParameters parameter is configured;</li><li>Challenge: challenge, respond with challenge content;</li><li>BlockIP: to be deprecated, IP blocking;</li><li>ReturnCustomPage: to be deprecated, use a specified page for interception;</li><li>JSChallenge: to be deprecated, JavaScript challenge;</li><li>ManagedChallenge: to be deprecated, managed challenge.</li></ul>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Specific actions for safe execution. Valid values:</p><ul><li>Deny: block, prevent requests from accessing site resources;</li><li>Monitor: observe, only record logs;</li><li>Redirect: redirect to URL;</li><li>Disabled: not enabled, do not enable the specified rule;</li><li>Allow: pass, skip the remaining rules of the current security module. Delay response when the AllowActionParameters parameter is configured;</li><li>Challenge: challenge, respond with challenge content;</li><li>BlockIP: to be deprecated, IP blocking;</li><li>ReturnCustomPage: to be deprecated, use a specified page for interception;</li><li>JSChallenge: to be deprecated, JavaScript challenge;</li><li>ManagedChallenge: to be deprecated, managed challenge.</li></ul>
     * @param Name <p>Specific actions for safe execution. Valid values:</p><ul><li>Deny: block, prevent requests from accessing site resources;</li><li>Monitor: observe, only record logs;</li><li>Redirect: redirect to URL;</li><li>Disabled: not enabled, do not enable the specified rule;</li><li>Allow: pass, skip the remaining rules of the current security module. Delay response when the AllowActionParameters parameter is configured;</li><li>Challenge: challenge, respond with challenge content;</li><li>BlockIP: to be deprecated, IP blocking;</li><li>ReturnCustomPage: to be deprecated, use a specified page for interception;</li><li>JSChallenge: to be deprecated, JavaScript challenge;</li><li>ManagedChallenge: to be deprecated, managed challenge.</li></ul>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Additional parameter when Name is Deny.</p> 
     * @return DenyActionParameters <p>Additional parameter when Name is Deny.</p>
     */
    public DenyActionParameters getDenyActionParameters() {
        return this.DenyActionParameters;
    }

    /**
     * Set <p>Additional parameter when Name is Deny.</p>
     * @param DenyActionParameters <p>Additional parameter when Name is Deny.</p>
     */
    public void setDenyActionParameters(DenyActionParameters DenyActionParameters) {
        this.DenyActionParameters = DenyActionParameters;
    }

    /**
     * Get <p>Additional parameter when Name is Redirect.</p> 
     * @return RedirectActionParameters <p>Additional parameter when Name is Redirect.</p>
     */
    public RedirectActionParameters getRedirectActionParameters() {
        return this.RedirectActionParameters;
    }

    /**
     * Set <p>Additional parameter when Name is Redirect.</p>
     * @param RedirectActionParameters <p>Additional parameter when Name is Redirect.</p>
     */
    public void setRedirectActionParameters(RedirectActionParameters RedirectActionParameters) {
        this.RedirectActionParameters = RedirectActionParameters;
    }

    /**
     * Get <p>Additional parameter when Name is Allow.</p> 
     * @return AllowActionParameters <p>Additional parameter when Name is Allow.</p>
     */
    public AllowActionParameters getAllowActionParameters() {
        return this.AllowActionParameters;
    }

    /**
     * Set <p>Additional parameter when Name is Allow.</p>
     * @param AllowActionParameters <p>Additional parameter when Name is Allow.</p>
     */
    public void setAllowActionParameters(AllowActionParameters AllowActionParameters) {
        this.AllowActionParameters = AllowActionParameters;
    }

    /**
     * Get <p>Additional parameter when Name is Challenge.</p> 
     * @return ChallengeActionParameters <p>Additional parameter when Name is Challenge.</p>
     */
    public ChallengeActionParameters getChallengeActionParameters() {
        return this.ChallengeActionParameters;
    }

    /**
     * Set <p>Additional parameter when Name is Challenge.</p>
     * @param ChallengeActionParameters <p>Additional parameter when Name is Challenge.</p>
     */
    public void setChallengeActionParameters(ChallengeActionParameters ChallengeActionParameters) {
        this.ChallengeActionParameters = ChallengeActionParameters;
    }

    /**
     * Get <p>To be deprecated. Additional parameter when Name is BlockIP.</p> 
     * @return BlockIPActionParameters <p>To be deprecated. Additional parameter when Name is BlockIP.</p>
     */
    public BlockIPActionParameters getBlockIPActionParameters() {
        return this.BlockIPActionParameters;
    }

    /**
     * Set <p>To be deprecated. Additional parameter when Name is BlockIP.</p>
     * @param BlockIPActionParameters <p>To be deprecated. Additional parameter when Name is BlockIP.</p>
     */
    public void setBlockIPActionParameters(BlockIPActionParameters BlockIPActionParameters) {
        this.BlockIPActionParameters = BlockIPActionParameters;
    }

    /**
     * Get <p>To be deprecated. An additional parameter when Name is ReturnCustomPage.</p> 
     * @return ReturnCustomPageActionParameters <p>To be deprecated. An additional parameter when Name is ReturnCustomPage.</p>
     */
    public ReturnCustomPageActionParameters getReturnCustomPageActionParameters() {
        return this.ReturnCustomPageActionParameters;
    }

    /**
     * Set <p>To be deprecated. An additional parameter when Name is ReturnCustomPage.</p>
     * @param ReturnCustomPageActionParameters <p>To be deprecated. An additional parameter when Name is ReturnCustomPage.</p>
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

