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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Command extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 
    */
    @SerializedName("WorkingDirectory")
    @Expose
    private String WorkingDirectory;

    /**
    * 
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
     * Get  
     * @return Content 
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 
     * @param Content 
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get  
     * @return Timeout 
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 
     * @param Timeout 
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get  
     * @return WorkingDirectory 
     */
    public String getWorkingDirectory() {
        return this.WorkingDirectory;
    }

    /**
     * Set 
     * @param WorkingDirectory 
     */
    public void setWorkingDirectory(String WorkingDirectory) {
        this.WorkingDirectory = WorkingDirectory;
    }

    /**
     * Get  
     * @return Username 
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 
     * @param Username 
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    public Command() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Command(Command source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.WorkingDirectory != null) {
            this.WorkingDirectory = new String(source.WorkingDirectory);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "WorkingDirectory", this.WorkingDirectory);
        this.setParamSimple(map, prefix + "Username", this.Username);

    }
}

