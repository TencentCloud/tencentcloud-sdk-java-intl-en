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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateKillTaskRequest extends AbstractModel{

    /**
    * ID of the instance associated with the session killing task.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Task duration in seconds. Pass in `-1` to stop the task manually.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Client IP, which is a task filter.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Database name, which is a task filter. Multiple database names are separated by comma.
    */
    @SerializedName("DB")
    @Expose
    private String DB;

    /**
    * Related command, which is a task filter. Multiple commands are separated by comma.
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * Task filter. Filtering by single filter prefix is supported.
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * User type, which is a task filter.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Session duration in seconds, which is a task filter.
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get ID of the instance associated with the session killing task. 
     * @return InstanceId ID of the instance associated with the session killing task.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance associated with the session killing task.
     * @param InstanceId ID of the instance associated with the session killing task.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Task duration in seconds. Pass in `-1` to stop the task manually. 
     * @return Duration Task duration in seconds. Pass in `-1` to stop the task manually.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Task duration in seconds. Pass in `-1` to stop the task manually.
     * @param Duration Task duration in seconds. Pass in `-1` to stop the task manually.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Client IP, which is a task filter. 
     * @return Host Client IP, which is a task filter.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Client IP, which is a task filter.
     * @param Host Client IP, which is a task filter.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Database name, which is a task filter. Multiple database names are separated by comma. 
     * @return DB Database name, which is a task filter. Multiple database names are separated by comma.
     */
    public String getDB() {
        return this.DB;
    }

    /**
     * Set Database name, which is a task filter. Multiple database names are separated by comma.
     * @param DB Database name, which is a task filter. Multiple database names are separated by comma.
     */
    public void setDB(String DB) {
        this.DB = DB;
    }

    /**
     * Get Related command, which is a task filter. Multiple commands are separated by comma. 
     * @return Command Related command, which is a task filter. Multiple commands are separated by comma.
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set Related command, which is a task filter. Multiple commands are separated by comma.
     * @param Command Related command, which is a task filter. Multiple commands are separated by comma.
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get Task filter. Filtering by single filter prefix is supported. 
     * @return Info Task filter. Filtering by single filter prefix is supported.
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set Task filter. Filtering by single filter prefix is supported.
     * @param Info Task filter. Filtering by single filter prefix is supported.
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get User type, which is a task filter. 
     * @return User User type, which is a task filter.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set User type, which is a task filter.
     * @param User User type, which is a task filter.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Session duration in seconds, which is a task filter. 
     * @return Time Session duration in seconds, which is a task filter.
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set Session duration in seconds, which is a task filter.
     * @param Time Session duration in seconds, which is a task filter.
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`. 
     * @return Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
     * @param Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public CreateKillTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateKillTaskRequest(CreateKillTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.DB != null) {
            this.DB = new String(source.DB);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "DB", this.DB);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

