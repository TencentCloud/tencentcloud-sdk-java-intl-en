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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Docker extends AbstractModel {

    /**
    * Docker Hub username or Tencent Registry username
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Docker Hub password or Tencent Registry password
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * For Docker Hub, enter "[user/repo]:[tag]"; for Tencent Registry, enter "ccr.ccs.tencentyun.com/[namespace/repo]:[tag]"
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * For Docker Hub, this can be left blank, but please ensure public network access is present. For Tencent Registry, the server address is "ccr.ccs.tencentyun.com"
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
    * Maximum retry attempts to load docket images. Range: 0 - 10. Default: `0`
    */
    @SerializedName("MaxRetryCount")
    @Expose
    private Long MaxRetryCount;

    /**
    * Docker image loading timeout period (in seconds). Range: 1 - 360
    */
    @SerializedName("DelayOnRetry")
    @Expose
    private Long DelayOnRetry;

    /**
    * Docker command execution parameter
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("DockerRunOption")
    @Expose
    private String DockerRunOption;

    /**
     * Get Docker Hub username or Tencent Registry username 
     * @return User Docker Hub username or Tencent Registry username
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Docker Hub username or Tencent Registry username
     * @param User Docker Hub username or Tencent Registry username
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Docker Hub password or Tencent Registry password 
     * @return Password Docker Hub password or Tencent Registry password
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Docker Hub password or Tencent Registry password
     * @param Password Docker Hub password or Tencent Registry password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get For Docker Hub, enter "[user/repo]:[tag]"; for Tencent Registry, enter "ccr.ccs.tencentyun.com/[namespace/repo]:[tag]" 
     * @return Image For Docker Hub, enter "[user/repo]:[tag]"; for Tencent Registry, enter "ccr.ccs.tencentyun.com/[namespace/repo]:[tag]"
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set For Docker Hub, enter "[user/repo]:[tag]"; for Tencent Registry, enter "ccr.ccs.tencentyun.com/[namespace/repo]:[tag]"
     * @param Image For Docker Hub, enter "[user/repo]:[tag]"; for Tencent Registry, enter "ccr.ccs.tencentyun.com/[namespace/repo]:[tag]"
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get For Docker Hub, this can be left blank, but please ensure public network access is present. For Tencent Registry, the server address is "ccr.ccs.tencentyun.com" 
     * @return Server For Docker Hub, this can be left blank, but please ensure public network access is present. For Tencent Registry, the server address is "ccr.ccs.tencentyun.com"
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set For Docker Hub, this can be left blank, but please ensure public network access is present. For Tencent Registry, the server address is "ccr.ccs.tencentyun.com"
     * @param Server For Docker Hub, this can be left blank, but please ensure public network access is present. For Tencent Registry, the server address is "ccr.ccs.tencentyun.com"
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * Get Maximum retry attempts to load docket images. Range: 0 - 10. Default: `0` 
     * @return MaxRetryCount Maximum retry attempts to load docket images. Range: 0 - 10. Default: `0`
     */
    public Long getMaxRetryCount() {
        return this.MaxRetryCount;
    }

    /**
     * Set Maximum retry attempts to load docket images. Range: 0 - 10. Default: `0`
     * @param MaxRetryCount Maximum retry attempts to load docket images. Range: 0 - 10. Default: `0`
     */
    public void setMaxRetryCount(Long MaxRetryCount) {
        this.MaxRetryCount = MaxRetryCount;
    }

    /**
     * Get Docker image loading timeout period (in seconds). Range: 1 - 360 
     * @return DelayOnRetry Docker image loading timeout period (in seconds). Range: 1 - 360
     */
    public Long getDelayOnRetry() {
        return this.DelayOnRetry;
    }

    /**
     * Set Docker image loading timeout period (in seconds). Range: 1 - 360
     * @param DelayOnRetry Docker image loading timeout period (in seconds). Range: 1 - 360
     */
    public void setDelayOnRetry(Long DelayOnRetry) {
        this.DelayOnRetry = DelayOnRetry;
    }

    /**
     * Get Docker command execution parameter
Note: This field may return `null`, indicating that no valid value was found. 
     * @return DockerRunOption Docker command execution parameter
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getDockerRunOption() {
        return this.DockerRunOption;
    }

    /**
     * Set Docker command execution parameter
Note: This field may return `null`, indicating that no valid value was found.
     * @param DockerRunOption Docker command execution parameter
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setDockerRunOption(String DockerRunOption) {
        this.DockerRunOption = DockerRunOption;
    }

    public Docker() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Docker(Docker source) {
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Server != null) {
            this.Server = new String(source.Server);
        }
        if (source.MaxRetryCount != null) {
            this.MaxRetryCount = new Long(source.MaxRetryCount);
        }
        if (source.DelayOnRetry != null) {
            this.DelayOnRetry = new Long(source.DelayOnRetry);
        }
        if (source.DockerRunOption != null) {
            this.DockerRunOption = new String(source.DockerRunOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "MaxRetryCount", this.MaxRetryCount);
        this.setParamSimple(map, prefix + "DelayOnRetry", this.DelayOnRetry);
        this.setParamSimple(map, prefix + "DockerRunOption", this.DockerRunOption);

    }
}

