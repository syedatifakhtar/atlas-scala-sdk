/**
 * Atlas REST API
 * Atlas exposes a variety of REST endpoints to work with types, entities, lineage and data discovery.
 *
 * OpenAPI spec version: 2.0.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class JsonAtlasEntityDef (
  category: Option[JsonTypeCategory] = None,
  // 
  createTime: Option[Number] = None,
  // 
  createdBy: Option[String] = None,
  dateFormatter: Option[JsonDateFormat] = None,
  // 
  description: Option[String] = None,
  // 
  guid: Option[String] = None,
  // 
  name: Option[String] = None,
  // 
  options: Option[Map[String, String]] = None,
  // 
  serviceType: Option[String] = None,
  // 
  typeVersion: Option[String] = None,
  // 
  updateTime: Option[Number] = None,
  // 
  updatedBy: Option[String] = None,
  // 
  version: Option[Number] = None,
  // 
  attributeDefs: Option[List[JsonAtlasAttributeDef]] = None,
  // 
  relationshipAttributeDefs: Option[List[JsonAtlasRelationshipAttributeDef]] = None,
  // 
  subTypes: Option[List[String]] = None,
  // 
  superTypes: Option[List[String]] = None
)

