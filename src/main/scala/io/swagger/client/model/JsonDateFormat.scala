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


case class JsonDateFormat (
  // 
  availableLocales: Option[List[String]] = None,
  // 
  calendar: Option[Number] = None,
  dateInstance: Option[JsonDateFormat] = None,
  dateTimeInstance: Option[JsonDateFormat] = None,
  instance: Option[JsonDateFormat] = None,
  // 
  lenient: Option[Boolean] = None,
  numberFormat: Option[JsonNumberFormat] = None,
  timeInstance: Option[JsonDateFormat] = None,
  timeZone: Option[JsonTimeZone] = None
)

