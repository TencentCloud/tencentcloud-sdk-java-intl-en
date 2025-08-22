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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStreamPackageVodRemuxTaskRequest extends AbstractModel {

    /**
    * VOD remux task name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The supported remuxing formats for VOD remux tasks.
Optional values: WEBVTT.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Input configuration.
    */
    @SerializedName("InputFileInfo")
    @Expose
    private InputFileInfo InputFileInfo;

    /**
    * Output configuration.
    */
    @SerializedName("OutputStorage")
    @Expose
    private OutputStorage OutputStorage;

    /**
     * Get VOD remux task name. 
     * @return Name VOD remux task name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set VOD remux task name.
     * @param Name VOD remux task name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The supported remuxing formats for VOD remux tasks.
Optional values: WEBVTT. 
     * @return Type The supported remuxing formats for VOD remux tasks.
Optional values: WEBVTT.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The supported remuxing formats for VOD remux tasks.
Optional values: WEBVTT.
     * @param Type The supported remuxing formats for VOD remux tasks.
Optional values: WEBVTT.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Input configuration. 
     * @return InputFileInfo Input configuration.
     */
    public InputFileInfo getInputFileInfo() {
        return this.InputFileInfo;
    }

    /**
     * Set Input configuration.
     * @param InputFileInfo Input configuration.
     */
    public void setInputFileInfo(InputFileInfo InputFileInfo) {
        this.InputFileInfo = InputFileInfo;
    }

    /**
     * Get Output configuration. 
     * @return OutputStorage Output configuration.
     */
    public OutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Output configuration.
     * @param OutputStorage Output configuration.
     */
    public void setOutputStorage(OutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    public CreateStreamPackageVodRemuxTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStreamPackageVodRemuxTaskRequest(CreateStreamPackageVodRemuxTaskRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InputFileInfo != null) {
            this.InputFileInfo = new InputFileInfo(source.InputFileInfo);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new OutputStorage(source.OutputStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "InputFileInfo.", this.InputFileInfo);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);

    }
}

