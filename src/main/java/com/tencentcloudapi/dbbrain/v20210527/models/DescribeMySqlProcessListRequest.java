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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMySqlProcessListRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Thread ID, which is used to filter the thread list.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Thread operation account name, which is used to filter the thread list.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Thread operation host address, which is used to filter the thread list.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Thread operation database, which is used to filter the thread list.
    */
    @SerializedName("DB")
    @Expose
    private String DB;

    /**
    * Thread operation status, which is used to filter the thread list.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Thread execution type, which is used to filter the thread list.
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * Minimum operation duration of the thread in seconds, which is used to filter the list of threads whose operation duration is greater than this value.
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * Thread operation statement, which is used to filter the thread list.
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * Number of returned results. Default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Service type. Valid values: mysql (TencentDB for MySQL), cynosdb (TDSQL-C for MySQL). Default value: mysql.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Thread ID, which is used to filter the thread list. 
     * @return ID Thread ID, which is used to filter the thread list.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Thread ID, which is used to filter the thread list.
     * @param ID Thread ID, which is used to filter the thread list.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Thread operation account name, which is used to filter the thread list. 
     * @return User Thread operation account name, which is used to filter the thread list.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Thread operation account name, which is used to filter the thread list.
     * @param User Thread operation account name, which is used to filter the thread list.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Thread operation host address, which is used to filter the thread list. 
     * @return Host Thread operation host address, which is used to filter the thread list.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Thread operation host address, which is used to filter the thread list.
     * @param Host Thread operation host address, which is used to filter the thread list.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Thread operation database, which is used to filter the thread list. 
     * @return DB Thread operation database, which is used to filter the thread list.
     */
    public String getDB() {
        return this.DB;
    }

    /**
     * Set Thread operation database, which is used to filter the thread list.
     * @param DB Thread operation database, which is used to filter the thread list.
     */
    public void setDB(String DB) {
        this.DB = DB;
    }

    /**
     * Get Thread operation status, which is used to filter the thread list. 
     * @return State Thread operation status, which is used to filter the thread list.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Thread operation status, which is used to filter the thread list.
     * @param State Thread operation status, which is used to filter the thread list.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Thread execution type, which is used to filter the thread list. 
     * @return Command Thread execution type, which is used to filter the thread list.
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set Thread execution type, which is used to filter the thread list.
     * @param Command Thread execution type, which is used to filter the thread list.
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get Minimum operation duration of the thread in seconds, which is used to filter the list of threads whose operation duration is greater than this value. 
     * @return Time Minimum operation duration of the thread in seconds, which is used to filter the list of threads whose operation duration is greater than this value.
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set Minimum operation duration of the thread in seconds, which is used to filter the list of threads whose operation duration is greater than this value.
     * @param Time Minimum operation duration of the thread in seconds, which is used to filter the list of threads whose operation duration is greater than this value.
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get Thread operation statement, which is used to filter the thread list. 
     * @return Info Thread operation statement, which is used to filter the thread list.
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set Thread operation statement, which is used to filter the thread list.
     * @param Info Thread operation statement, which is used to filter the thread list.
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get Number of returned results. Default value: 20. 
     * @return Limit Number of returned results. Default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20.
     * @param Limit Number of returned results. Default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Service type. Valid values: mysql (TencentDB for MySQL), cynosdb (TDSQL-C for MySQL). Default value: mysql. 
     * @return Product Service type. Valid values: mysql (TencentDB for MySQL), cynosdb (TDSQL-C for MySQL). Default value: mysql.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type. Valid values: mysql (TencentDB for MySQL), cynosdb (TDSQL-C for MySQL). Default value: mysql.
     * @param Product Service type. Valid values: mysql (TencentDB for MySQL), cynosdb (TDSQL-C for MySQL). Default value: mysql.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeMySqlProcessListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMySqlProcessListRequest(DescribeMySqlProcessListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.DB != null) {
            this.DB = new String(source.DB);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "DB", this.DB);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

