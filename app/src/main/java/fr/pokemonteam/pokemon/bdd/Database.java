package fr.pokemonteam.pokemon.bdd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {
    private static Database instance = null;

    public Database(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public static Database getInstance(Context context) {
        if (instance == null)
            instance = new Database(context, "pokemon.db", null, 1);
        return instance;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.beginTransaction();
            db.execSQL("CREATE TABLE utilisateur (id_utilisateur INT, pseudo VARCHAR(20), nom VARCHAR(20), prenom VARCHAR(20));");
            db.execSQL("CREATE TABLE sac_a_dos (id_utilisateur INT, id_element INT, nombre INT);");
            db.execSQL("CREATE TABLE element (id_element INT, libelle VARCHAR(50), effet VARCHAR(255));");
            db.execSQL("CREATE TABLE pokemon_reel (id_pokemon_reel INT, id_utilisateur INT, id_pokemon INT, pseudo VARCHAR(20), equipe BOOL, atk INT, def INT, niveau INT, exp INT, longitude REAL, latitude REAL );");
            db.execSQL("CREATE TABLE infos_pokemon (id_pokemon INT , id_type_pokemon INT, nom VARCHAR(255), description TEXT, nom_image VARCHAR(255), vue BOOL, capture BOOL);");
            db.execSQL("CREATE TABLE type_pokemon (id_type_pokemon INT, libelle VARCHAR(50));");
            db.execSQL("CREATE TABLE lieu (id_lieu INT, libelle VARCHAR(50), type_lieu VARCHAR(50), longitude REAL, latitude REAL );");
            db.execSQL("CREATE TABLE lieu_favoris (id_lieu INT, id_user INT );");
            db.setTransactionSuccessful();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.endTransaction();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (db.getVersion() == oldVersion) db.setVersion(newVersion);
    }

//
//    public void insertTweets(Tweet t) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        try {
//            db.beginTransaction();
//
//            ContentValues values = new ContentValues();
//            //on lui ajoute une valeur associée à une clé (qui est le nom de la colonne dans laquelle on veut mettre la valeur)
//            values.put("date", t.getDate());
//            values.put("user", t.getUser());
//            values.put("text", t.getText());
//            values.put("id", t.getId());
//            values.put("fav", t.getJaime());
//            values.put("retweet", t.getRetweet());
//
//            if (t.isGeoloc()) {
//                values.put("geoloc", 1);
//            } else {
//                values.put("geoloc", 0);
//            }
//
//            db.insert("tweets", null, values);
//            db.setTransactionSuccessful();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            db.endTransaction();
//        }
//    }
//
//    public List<Tweet> getAllTweets() {
//        SQLiteDatabase db = this.getReadableDatabase();
//
//        List<Tweet> ret = new ArrayList<Tweet>();
//
//        try {
//            db.beginTransaction();
//            Cursor c = db.query("tweets", new String[]{"date", "user", "text","retweet","id","fav","geoloc"}, null, null, null, null, null);
//            System.out.println(c.getCount());
//            if (c.getCount() > 0) {
//                c.moveToFirst();
//
//                do {
//                    Tweet t = new Tweet();
//                    t.setDate(c.getString(c.getColumnIndex("date")));
//                    t.setUser(c.getString(c.getColumnIndex("user")));
//                    t.setText(c.getString(c.getColumnIndex("text")));
//                    t.setRetweet(c.getInt(c.getColumnIndex("retweet")));
//                    t.setId(c.getLong(c.getColumnIndex("id")));
//                    t.setJaime(c.getInt(c.getColumnIndex("fav")));
//                    if (c.getInt(c.getColumnIndex("geoloc")) == 1) {
//                        t.setGeoloc(true);
//                    } else {
//                        t.setGeoloc(false);
//                    }
//
//
//                    ret.add(t);
//
//                } while (c.moveToNext());
//            }
//            db.setTransactionSuccessful();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            db.endTransaction();
//            return ret;
//        }
//    }
//
//    public void deleteAllTweets() {
//        SQLiteDatabase db = this.getWritableDatabase();
//        try {
//            db.beginTransaction();
//            db.delete("tweets", null, null);
//            db.setTransactionSuccessful();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            db.endTransaction();
//        }
//    }
}
