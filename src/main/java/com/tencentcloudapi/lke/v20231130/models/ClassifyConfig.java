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

public class ClassifyConfig extends AbstractModel {

    /**
    * Model configuration.
    */
    @SerializedName("Model")
    @Expose
    private AppModel Model;

    /**
    * Label list.
    */
    @SerializedName("Labels")
    @Expose
    private ClassifyLabel [] Labels;

    /**
    * Welcome words, within 200 characters.
    */
    @SerializedName("Greeting")
    @Expose
    private String Greeting;

    /**
     * Get Model configuration. 
     * @return Model Model configuration.
     */
    public AppModel getModel() {
        return this.Model;
    }

    /**
     * Set Model configuration.
     * @param Model Model configuration.
     */
    public void setModel(AppModel Model) {
        this.Model = Model;
    }

    /**
     * Get Label list. 
     * @return Labels Label list.
     */
    public ClassifyLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Label list.
     * @param Labels Label list.
     */
    public void setLabels(ClassifyLabel [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Welcome words, within 200 characters. 
     * @return Greeting Welcome words, within 200 characters.
     */
    public String getGreeting() {
        return this.Greeting;
    }

    /**
     * Set Welcome words, within 200 characters.
     * @param Greeting Welcome words, within 200 characters.
     */
    public void setGreeting(String Greeting) {
        this.Greeting = Greeting;
    }

    public ClassifyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClassifyConfig(ClassifyConfig source) {
        if (source.Model != null) {
            this.Model = new AppModel(source.Model);
        }
        if (source.Labels != null) {
            this.Labels = new ClassifyLabel[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new ClassifyLabel(source.Labels[i]);
            }
        }
        if (source.Greeting != null) {
            this.Greeting = new String(source.Greeting);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Model.", this.Model);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "Greeting", this.Greeting);

    }
}

