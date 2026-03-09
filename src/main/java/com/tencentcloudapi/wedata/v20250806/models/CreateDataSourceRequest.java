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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDataSourceRequest extends AbstractModel {

    /**
    * Data source item ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Data source name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Data source type: enumeration value.

- MYSQL
- TENCENT_MYSQL
- POSTGRE
- ORACLE
- SQLSERVER
- FTP
- HIVE
- HUDI
- HDFS
- ICEBERG
- KAFKA
- DTS_KAFKA
- HBASE
- SPARK
- TBASE
- DB2
- DM
- GAUSSDB
- GBASE
- IMPALA
- ES
- TENCENT_ES
- GREENPLUM
- SAP_HANA
- SFTP
- OCEANBASE
- CLICKHOUSE
- KUDU
- VERTICA
- REDIS
- COS
- DLC
- DORIS
- CKAFKA
- S3_DATAINSIGHT
- TDSQL
- TDSQL_MYSQL
- MONGODB
- TENCENT_MONGODB
- REST_API
- TiDB
- StarRocks
- Trino
- Kyuubi
- TCHOUSE_X
- TCHOUSE_P
- TCHOUSE_C
- TCHOUSE_D
- INFLUXDB
- BIG_QUERY
- SSH
- BLOB
- TDSQL_POSTGRE
- GDB
- TDENGINE
- TDSQLC
- FileSystem

    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Configuration message of data sources is stored in JSON KV, based on data source type, KV storage information varies.

> deployType: 
CONNSTR_PUBLICDB (public network instance). 
CONNSTR_CVMDB (self-built instance).
Cloud INSTANCE.

```
mysql: self-built instance.
{
    "deployType": "CONNSTR_CVMDB",
    "url": "jdbc:mysql://1.1.1.1:1111/example#test#123456",
    "username": "root",
    "password": "example#test#123456",
    "region": "ap-shanghai",
    "vpcId": "vpc-kprq42yo",
    "type": "MYSQL"
}
mysql: cloud instance.
{
    "instanceid": "cdb-12uxdo5e",
    "db": "db",
    "region": "ap-shanghai",
    "username": "msyql",
    "password": "example#test#123456",
    "deployType": "INSTANCE",
    "type": "TENCENT_MYSQL"
}
sql_server: 
{
    "deployType": "CONNSTR_PUBLICDB",
    "url": "jdbc:sqlserver://1.1.1.1:223;example#test#123456",
    "username": "user_1",
    "password": "example#test#123456",
    "type": "SQLSERVER"
}
redis:
    redisType:
-Account-Free.
-SELF_ACCOUNT (custom account).
{
    "deployType": "CONNSTR_PUBLICDB",
    "username":""
    "password": "example#test#123456",
    "ip": "1.1.1.1",
    "port": "6379",
    "redisType": "NO_ACCOUT",
    "type": "REDIS"
}
oracle: 
{
    "deployType": "CONNSTR_CVMDB",
    "url": "jdbc:oracle:thin:@1.1.1.1:1521:example#test#123456",
    "username": "oracle",
    "password": "example#test#123456",
    "region": "ap-shanghai",
    "vpcId": "vpc-kprq42yo",
    "type": "ORACLE"
}
mongodb:
advanceParams (custom parameters, which will be appended to the url).
{
    "advanceParams": [
        {
            "key": "authSource",
            "value": "auth"
        }
    ],
    "db": "admin",
    "deployType": "CONNSTR_PUBLICDB",
    "username": "user",
    "password": "example#test#123456",
    "type": "MONGODB",
    "host": "1.1.1.1:9200"
}
postgresql:
{
    "deployType": "CONNSTR_PUBLICDB",
    "url": "jdbc:postgresql://1.1.1.1:1921/example#test#123456",
    "username": "user",
    "password": "example#test#123456",
    "type": "POSTGRE"
}
kafka:
    authType:
        - sasl
        - jaas
        - sasl_plaintext
        - sasl_ssl
        - GSSAPI
    ssl:
        -PLAIN
        -GSSAPI
{
    "deployType": "CONNSTR_PUBLICDB",
    "host": "1.1.1.1:9092",
    "ssl": "GSSAPI",
    "authType": "sasl",
    "type": "KAFKA",
    "principal": "aaaa",
    "serviceName": "kafka"
}

cos:
{
    "region": "ap-shanghai",
    "deployType": "INSTANCE",
    "secretId": "aaaaa",
    "secretKey": "example#test#123456",
    "bucket": "aaa",
    "type": "COS"
}

```
    */
    @SerializedName("ProdConProperties")
    @Expose
    private String ProdConProperties;

    /**
    * Development environment data source configuration info. if the project is in standard mode, this field is required.
    */
    @SerializedName("DevConProperties")
    @Expose
    private String DevConProperties;

    /**
    * Upload data source file in production environment.
    */
    @SerializedName("ProdFileUpload")
    @Expose
    private DataSourceFileUpload ProdFileUpload;

    /**
    * Upload the data source file in the development environment.
    */
    @SerializedName("DevFileUpload")
    @Expose
    private DataSourceFileUpload DevFileUpload;

    /**
    * Data source display name for visual inspection.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Data source description information
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Data source item ID. 
     * @return ProjectId Data source item ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Data source item ID.
     * @param ProjectId Data source item ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Data source name 
     * @return Name Data source name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Data source name
     * @param Name Data source name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Data source type: enumeration value.

- MYSQL
- TENCENT_MYSQL
- POSTGRE
- ORACLE
- SQLSERVER
- FTP
- HIVE
- HUDI
- HDFS
- ICEBERG
- KAFKA
- DTS_KAFKA
- HBASE
- SPARK
- TBASE
- DB2
- DM
- GAUSSDB
- GBASE
- IMPALA
- ES
- TENCENT_ES
- GREENPLUM
- SAP_HANA
- SFTP
- OCEANBASE
- CLICKHOUSE
- KUDU
- VERTICA
- REDIS
- COS
- DLC
- DORIS
- CKAFKA
- S3_DATAINSIGHT
- TDSQL
- TDSQL_MYSQL
- MONGODB
- TENCENT_MONGODB
- REST_API
- TiDB
- StarRocks
- Trino
- Kyuubi
- TCHOUSE_X
- TCHOUSE_P
- TCHOUSE_C
- TCHOUSE_D
- INFLUXDB
- BIG_QUERY
- SSH
- BLOB
- TDSQL_POSTGRE
- GDB
- TDENGINE
- TDSQLC
- FileSystem
 
     * @return Type Data source type: enumeration value.

- MYSQL
- TENCENT_MYSQL
- POSTGRE
- ORACLE
- SQLSERVER
- FTP
- HIVE
- HUDI
- HDFS
- ICEBERG
- KAFKA
- DTS_KAFKA
- HBASE
- SPARK
- TBASE
- DB2
- DM
- GAUSSDB
- GBASE
- IMPALA
- ES
- TENCENT_ES
- GREENPLUM
- SAP_HANA
- SFTP
- OCEANBASE
- CLICKHOUSE
- KUDU
- VERTICA
- REDIS
- COS
- DLC
- DORIS
- CKAFKA
- S3_DATAINSIGHT
- TDSQL
- TDSQL_MYSQL
- MONGODB
- TENCENT_MONGODB
- REST_API
- TiDB
- StarRocks
- Trino
- Kyuubi
- TCHOUSE_X
- TCHOUSE_P
- TCHOUSE_C
- TCHOUSE_D
- INFLUXDB
- BIG_QUERY
- SSH
- BLOB
- TDSQL_POSTGRE
- GDB
- TDENGINE
- TDSQLC
- FileSystem

     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Data source type: enumeration value.

- MYSQL
- TENCENT_MYSQL
- POSTGRE
- ORACLE
- SQLSERVER
- FTP
- HIVE
- HUDI
- HDFS
- ICEBERG
- KAFKA
- DTS_KAFKA
- HBASE
- SPARK
- TBASE
- DB2
- DM
- GAUSSDB
- GBASE
- IMPALA
- ES
- TENCENT_ES
- GREENPLUM
- SAP_HANA
- SFTP
- OCEANBASE
- CLICKHOUSE
- KUDU
- VERTICA
- REDIS
- COS
- DLC
- DORIS
- CKAFKA
- S3_DATAINSIGHT
- TDSQL
- TDSQL_MYSQL
- MONGODB
- TENCENT_MONGODB
- REST_API
- TiDB
- StarRocks
- Trino
- Kyuubi
- TCHOUSE_X
- TCHOUSE_P
- TCHOUSE_C
- TCHOUSE_D
- INFLUXDB
- BIG_QUERY
- SSH
- BLOB
- TDSQL_POSTGRE
- GDB
- TDENGINE
- TDSQLC
- FileSystem

     * @param Type Data source type: enumeration value.

- MYSQL
- TENCENT_MYSQL
- POSTGRE
- ORACLE
- SQLSERVER
- FTP
- HIVE
- HUDI
- HDFS
- ICEBERG
- KAFKA
- DTS_KAFKA
- HBASE
- SPARK
- TBASE
- DB2
- DM
- GAUSSDB
- GBASE
- IMPALA
- ES
- TENCENT_ES
- GREENPLUM
- SAP_HANA
- SFTP
- OCEANBASE
- CLICKHOUSE
- KUDU
- VERTICA
- REDIS
- COS
- DLC
- DORIS
- CKAFKA
- S3_DATAINSIGHT
- TDSQL
- TDSQL_MYSQL
- MONGODB
- TENCENT_MONGODB
- REST_API
- TiDB
- StarRocks
- Trino
- Kyuubi
- TCHOUSE_X
- TCHOUSE_P
- TCHOUSE_C
- TCHOUSE_D
- INFLUXDB
- BIG_QUERY
- SSH
- BLOB
- TDSQL_POSTGRE
- GDB
- TDENGINE
- TDSQLC
- FileSystem

     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Configuration message of data sources is stored in JSON KV, based on data source type, KV storage information varies.

> deployType: 
CONNSTR_PUBLICDB (public network instance). 
CONNSTR_CVMDB (self-built instance).
Cloud INSTANCE.

```
mysql: self-built instance.
{
    "deployType": "CONNSTR_CVMDB",
    "url": "jdbc:mysql://1.1.1.1:1111/example#test#123456",
    "username": "root",
    "password": "example#test#123456",
    "region": "ap-shanghai",
    "vpcId": "vpc-kprq42yo",
    "type": "MYSQL"
}
mysql: cloud instance.
{
    "instanceid": "cdb-12uxdo5e",
    "db": "db",
    "region": "ap-shanghai",
    "username": "msyql",
    "password": "example#test#123456",
    "deployType": "INSTANCE",
    "type": "TENCENT_MYSQL"
}
sql_server: 
{
    "deployType": "CONNSTR_PUBLICDB",
    "url": "jdbc:sqlserver://1.1.1.1:223;example#test#123456",
    "username": "user_1",
    "password": "example#test#123456",
    "type": "SQLSERVER"
}
redis:
    redisType:
-Account-Free.
-SELF_ACCOUNT (custom account).
{
    "deployType": "CONNSTR_PUBLICDB",
    "username":""
    "password": "example#test#123456",
    "ip": "1.1.1.1",
    "port": "6379",
    "redisType": "NO_ACCOUT",
    "type": "REDIS"
}
oracle: 
{
    "deployType": "CONNSTR_CVMDB",
    "url": "jdbc:oracle:thin:@1.1.1.1:1521:example#test#123456",
    "username": "oracle",
    "password": "example#test#123456",
    "region": "ap-shanghai",
    "vpcId": "vpc-kprq42yo",
    "type": "ORACLE"
}
mongodb:
advanceParams (custom parameters, which will be appended to the url).
{
    "advanceParams": [
        {
            "key": "authSource",
            "value": "auth"
        }
    ],
    "db": "admin",
    "deployType": "CONNSTR_PUBLICDB",
    "username": "user",
    "password": "example#test#123456",
    "type": "MONGODB",
    "host": "1.1.1.1:9200"
}
postgresql:
{
    "deployType": "CONNSTR_PUBLICDB",
    "url": "jdbc:postgresql://1.1.1.1:1921/example#test#123456",
    "username": "user",
    "password": "example#test#123456",
    "type": "POSTGRE"
}
kafka:
    authType:
        - sasl
        - jaas
        - sasl_plaintext
        - sasl_ssl
        - GSSAPI
    ssl:
        -PLAIN
        -GSSAPI
{
    "deployType": "CONNSTR_PUBLICDB",
    "host": "1.1.1.1:9092",
    "ssl": "GSSAPI",
    "authType": "sasl",
    "type": "KAFKA",
    "principal": "aaaa",
    "serviceName": "kafka"
}

cos:
{
    "region": "ap-shanghai",
    "deployType": "INSTANCE",
    "secretId": "aaaaa",
    "secretKey": "example#test#123456",
    "bucket": "aaa",
    "type": "COS"
}

``` 
     * @return ProdConProperties Configuration message of data sources is stored in JSON KV, based on data source type, KV storage information varies.

> deployType: 
CONNSTR_PUBLICDB (public network instance). 
CONNSTR_CVMDB (self-built instance).
Cloud INSTANCE.

```
mysql: self-built instance.
{
    "deployType": "CONNSTR_CVMDB",
    "url": "jdbc:mysql://1.1.1.1:1111/example#test#123456",
    "username": "root",
    "password": "example#test#123456",
    "region": "ap-shanghai",
    "vpcId": "vpc-kprq42yo",
    "type": "MYSQL"
}
mysql: cloud instance.
{
    "instanceid": "cdb-12uxdo5e",
    "db": "db",
    "region": "ap-shanghai",
    "username": "msyql",
    "password": "example#test#123456",
    "deployType": "INSTANCE",
    "type": "TENCENT_MYSQL"
}
sql_server: 
{
    "deployType": "CONNSTR_PUBLICDB",
    "url": "jdbc:sqlserver://1.1.1.1:223;example#test#123456",
    "username": "user_1",
    "password": "example#test#123456",
    "type": "SQLSERVER"
}
redis:
    redisType:
-Account-Free.
-SELF_ACCOUNT (custom account).
{
    "deployType": "CONNSTR_PUBLICDB",
    "username":""
    "password": "example#test#123456",
    "ip": "1.1.1.1",
    "port": "6379",
    "redisType": "NO_ACCOUT",
    "type": "REDIS"
}
oracle: 
{
    "deployType": "CONNSTR_CVMDB",
    "url": "jdbc:oracle:thin:@1.1.1.1:1521:example#test#123456",
    "username": "oracle",
    "password": "example#test#123456",
    "region": "ap-shanghai",
    "vpcId": "vpc-kprq42yo",
    "type": "ORACLE"
}
mongodb:
advanceParams (custom parameters, which will be appended to the url).
{
    "advanceParams": [
        {
            "key": "authSource",
            "value": "auth"
        }
    ],
    "db": "admin",
    "deployType": "CONNSTR_PUBLICDB",
    "username": "user",
    "password": "example#test#123456",
    "type": "MONGODB",
    "host": "1.1.1.1:9200"
}
postgresql:
{
    "deployType": "CONNSTR_PUBLICDB",
    "url": "jdbc:postgresql://1.1.1.1:1921/example#test#123456",
    "username": "user",
    "password": "example#test#123456",
    "type": "POSTGRE"
}
kafka:
    authType:
        - sasl
        - jaas
        - sasl_plaintext
        - sasl_ssl
        - GSSAPI
    ssl:
        -PLAIN
        -GSSAPI
{
    "deployType": "CONNSTR_PUBLICDB",
    "host": "1.1.1.1:9092",
    "ssl": "GSSAPI",
    "authType": "sasl",
    "type": "KAFKA",
    "principal": "aaaa",
    "serviceName": "kafka"
}

cos:
{
    "region": "ap-shanghai",
    "deployType": "INSTANCE",
    "secretId": "aaaaa",
    "secretKey": "example#test#123456",
    "bucket": "aaa",
    "type": "COS"
}

```
     */
    public String getProdConProperties() {
        return this.ProdConProperties;
    }

    /**
     * Set Configuration message of data sources is stored in JSON KV, based on data source type, KV storage information varies.

> deployType: 
CONNSTR_PUBLICDB (public network instance). 
CONNSTR_CVMDB (self-built instance).
Cloud INSTANCE.

```
mysql: self-built instance.
{
    "deployType": "CONNSTR_CVMDB",
    "url": "jdbc:mysql://1.1.1.1:1111/example#test#123456",
    "username": "root",
    "password": "example#test#123456",
    "region": "ap-shanghai",
    "vpcId": "vpc-kprq42yo",
    "type": "MYSQL"
}
mysql: cloud instance.
{
    "instanceid": "cdb-12uxdo5e",
    "db": "db",
    "region": "ap-shanghai",
    "username": "msyql",
    "password": "example#test#123456",
    "deployType": "INSTANCE",
    "type": "TENCENT_MYSQL"
}
sql_server: 
{
    "deployType": "CONNSTR_PUBLICDB",
    "url": "jdbc:sqlserver://1.1.1.1:223;example#test#123456",
    "username": "user_1",
    "password": "example#test#123456",
    "type": "SQLSERVER"
}
redis:
    redisType:
-Account-Free.
-SELF_ACCOUNT (custom account).
{
    "deployType": "CONNSTR_PUBLICDB",
    "username":""
    "password": "example#test#123456",
    "ip": "1.1.1.1",
    "port": "6379",
    "redisType": "NO_ACCOUT",
    "type": "REDIS"
}
oracle: 
{
    "deployType": "CONNSTR_CVMDB",
    "url": "jdbc:oracle:thin:@1.1.1.1:1521:example#test#123456",
    "username": "oracle",
    "password": "example#test#123456",
    "region": "ap-shanghai",
    "vpcId": "vpc-kprq42yo",
    "type": "ORACLE"
}
mongodb:
advanceParams (custom parameters, which will be appended to the url).
{
    "advanceParams": [
        {
            "key": "authSource",
            "value": "auth"
        }
    ],
    "db": "admin",
    "deployType": "CONNSTR_PUBLICDB",
    "username": "user",
    "password": "example#test#123456",
    "type": "MONGODB",
    "host": "1.1.1.1:9200"
}
postgresql:
{
    "deployType": "CONNSTR_PUBLICDB",
    "url": "jdbc:postgresql://1.1.1.1:1921/example#test#123456",
    "username": "user",
    "password": "example#test#123456",
    "type": "POSTGRE"
}
kafka:
    authType:
        - sasl
        - jaas
        - sasl_plaintext
        - sasl_ssl
        - GSSAPI
    ssl:
        -PLAIN
        -GSSAPI
{
    "deployType": "CONNSTR_PUBLICDB",
    "host": "1.1.1.1:9092",
    "ssl": "GSSAPI",
    "authType": "sasl",
    "type": "KAFKA",
    "principal": "aaaa",
    "serviceName": "kafka"
}

cos:
{
    "region": "ap-shanghai",
    "deployType": "INSTANCE",
    "secretId": "aaaaa",
    "secretKey": "example#test#123456",
    "bucket": "aaa",
    "type": "COS"
}

```
     * @param ProdConProperties Configuration message of data sources is stored in JSON KV, based on data source type, KV storage information varies.

> deployType: 
CONNSTR_PUBLICDB (public network instance). 
CONNSTR_CVMDB (self-built instance).
Cloud INSTANCE.

```
mysql: self-built instance.
{
    "deployType": "CONNSTR_CVMDB",
    "url": "jdbc:mysql://1.1.1.1:1111/example#test#123456",
    "username": "root",
    "password": "example#test#123456",
    "region": "ap-shanghai",
    "vpcId": "vpc-kprq42yo",
    "type": "MYSQL"
}
mysql: cloud instance.
{
    "instanceid": "cdb-12uxdo5e",
    "db": "db",
    "region": "ap-shanghai",
    "username": "msyql",
    "password": "example#test#123456",
    "deployType": "INSTANCE",
    "type": "TENCENT_MYSQL"
}
sql_server: 
{
    "deployType": "CONNSTR_PUBLICDB",
    "url": "jdbc:sqlserver://1.1.1.1:223;example#test#123456",
    "username": "user_1",
    "password": "example#test#123456",
    "type": "SQLSERVER"
}
redis:
    redisType:
-Account-Free.
-SELF_ACCOUNT (custom account).
{
    "deployType": "CONNSTR_PUBLICDB",
    "username":""
    "password": "example#test#123456",
    "ip": "1.1.1.1",
    "port": "6379",
    "redisType": "NO_ACCOUT",
    "type": "REDIS"
}
oracle: 
{
    "deployType": "CONNSTR_CVMDB",
    "url": "jdbc:oracle:thin:@1.1.1.1:1521:example#test#123456",
    "username": "oracle",
    "password": "example#test#123456",
    "region": "ap-shanghai",
    "vpcId": "vpc-kprq42yo",
    "type": "ORACLE"
}
mongodb:
advanceParams (custom parameters, which will be appended to the url).
{
    "advanceParams": [
        {
            "key": "authSource",
            "value": "auth"
        }
    ],
    "db": "admin",
    "deployType": "CONNSTR_PUBLICDB",
    "username": "user",
    "password": "example#test#123456",
    "type": "MONGODB",
    "host": "1.1.1.1:9200"
}
postgresql:
{
    "deployType": "CONNSTR_PUBLICDB",
    "url": "jdbc:postgresql://1.1.1.1:1921/example#test#123456",
    "username": "user",
    "password": "example#test#123456",
    "type": "POSTGRE"
}
kafka:
    authType:
        - sasl
        - jaas
        - sasl_plaintext
        - sasl_ssl
        - GSSAPI
    ssl:
        -PLAIN
        -GSSAPI
{
    "deployType": "CONNSTR_PUBLICDB",
    "host": "1.1.1.1:9092",
    "ssl": "GSSAPI",
    "authType": "sasl",
    "type": "KAFKA",
    "principal": "aaaa",
    "serviceName": "kafka"
}

cos:
{
    "region": "ap-shanghai",
    "deployType": "INSTANCE",
    "secretId": "aaaaa",
    "secretKey": "example#test#123456",
    "bucket": "aaa",
    "type": "COS"
}

```
     */
    public void setProdConProperties(String ProdConProperties) {
        this.ProdConProperties = ProdConProperties;
    }

    /**
     * Get Development environment data source configuration info. if the project is in standard mode, this field is required. 
     * @return DevConProperties Development environment data source configuration info. if the project is in standard mode, this field is required.
     */
    public String getDevConProperties() {
        return this.DevConProperties;
    }

    /**
     * Set Development environment data source configuration info. if the project is in standard mode, this field is required.
     * @param DevConProperties Development environment data source configuration info. if the project is in standard mode, this field is required.
     */
    public void setDevConProperties(String DevConProperties) {
        this.DevConProperties = DevConProperties;
    }

    /**
     * Get Upload data source file in production environment. 
     * @return ProdFileUpload Upload data source file in production environment.
     */
    public DataSourceFileUpload getProdFileUpload() {
        return this.ProdFileUpload;
    }

    /**
     * Set Upload data source file in production environment.
     * @param ProdFileUpload Upload data source file in production environment.
     */
    public void setProdFileUpload(DataSourceFileUpload ProdFileUpload) {
        this.ProdFileUpload = ProdFileUpload;
    }

    /**
     * Get Upload the data source file in the development environment. 
     * @return DevFileUpload Upload the data source file in the development environment.
     */
    public DataSourceFileUpload getDevFileUpload() {
        return this.DevFileUpload;
    }

    /**
     * Set Upload the data source file in the development environment.
     * @param DevFileUpload Upload the data source file in the development environment.
     */
    public void setDevFileUpload(DataSourceFileUpload DevFileUpload) {
        this.DevFileUpload = DevFileUpload;
    }

    /**
     * Get Data source display name for visual inspection. 
     * @return DisplayName Data source display name for visual inspection.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Data source display name for visual inspection.
     * @param DisplayName Data source display name for visual inspection.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get Data source description information 
     * @return Description Data source description information
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Data source description information
     * @param Description Data source description information
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateDataSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDataSourceRequest(CreateDataSourceRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ProdConProperties != null) {
            this.ProdConProperties = new String(source.ProdConProperties);
        }
        if (source.DevConProperties != null) {
            this.DevConProperties = new String(source.DevConProperties);
        }
        if (source.ProdFileUpload != null) {
            this.ProdFileUpload = new DataSourceFileUpload(source.ProdFileUpload);
        }
        if (source.DevFileUpload != null) {
            this.DevFileUpload = new DataSourceFileUpload(source.DevFileUpload);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ProdConProperties", this.ProdConProperties);
        this.setParamSimple(map, prefix + "DevConProperties", this.DevConProperties);
        this.setParamObj(map, prefix + "ProdFileUpload.", this.ProdFileUpload);
        this.setParamObj(map, prefix + "DevFileUpload.", this.DevFileUpload);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

