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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListModelRequest extends AbstractModel {

    /**
    * Application type; knowledge_qa - knowledge Q&A management; summary - knowledge summary; classifys - knowledge label extraction.
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * Application mode standard: standard; agent; single_workflow.
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * Model category: 
Generate: Generative model
Thought: Thinking model
    */
    @SerializedName("ModelCategory")
    @Expose
    private String ModelCategory;

    /**
    * Login to user's root account (required in integrator mode).	
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * Login to user's sub-account (required in integrator mode).	
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
     * Get Application type; knowledge_qa - knowledge Q&A management; summary - knowledge summary; classifys - knowledge label extraction. 
     * @return AppType Application type; knowledge_qa - knowledge Q&A management; summary - knowledge summary; classifys - knowledge label extraction.
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set Application type; knowledge_qa - knowledge Q&A management; summary - knowledge summary; classifys - knowledge label extraction.
     * @param AppType Application type; knowledge_qa - knowledge Q&A management; summary - knowledge summary; classifys - knowledge label extraction.
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get Application mode standard: standard; agent; single_workflow. 
     * @return Pattern Application mode standard: standard; agent; single_workflow.
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set Application mode standard: standard; agent; single_workflow.
     * @param Pattern Application mode standard: standard; agent; single_workflow.
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get Model category: 
Generate: Generative model
Thought: Thinking model 
     * @return ModelCategory Model category: 
Generate: Generative model
Thought: Thinking model
     */
    public String getModelCategory() {
        return this.ModelCategory;
    }

    /**
     * Set Model category: 
Generate: Generative model
Thought: Thinking model
     * @param ModelCategory Model category: 
Generate: Generative model
Thought: Thinking model
     */
    public void setModelCategory(String ModelCategory) {
        this.ModelCategory = ModelCategory;
    }

    /**
     * Get Login to user's root account (required in integrator mode).	 
     * @return LoginUin Login to user's root account (required in integrator mode).	
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set Login to user's root account (required in integrator mode).	
     * @param LoginUin Login to user's root account (required in integrator mode).	
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get Login to user's sub-account (required in integrator mode).	 
     * @return LoginSubAccountUin Login to user's sub-account (required in integrator mode).	
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set Login to user's sub-account (required in integrator mode).	
     * @param LoginSubAccountUin Login to user's sub-account (required in integrator mode).	
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    public ListModelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListModelRequest(ListModelRequest source) {
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
        if (source.ModelCategory != null) {
            this.ModelCategory = new String(source.ModelCategory);
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "ModelCategory", this.ModelCategory);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);

    }
}

